package com.huang.single;

/**
 * Created by hlp on 2017/4/14.
 * 单例模式
 *是一种常用的设计模式
 * 在java应用中单例对象能保证在一个jvm中，该对象只有一个实例存在。
 * 这样的模式有几个好处：
 * 1 某些类创建比较频繁，对于一些大型的对象，是一笔很大的系统开销
 * 2 省去了new操作符，降低了系统内存的使用频率，减轻GC压力
 * 3 有些类如交易所的核心交易引擎，控制着交易流程如果该类可以创建多个的话，系统就乱了。
 * 比如，一个军队同时出现多个司令员指挥，肯定会乱，
 * 所以只有单例模式，才能保证核心交易服务器独立控制整个流程
 *
 */
public class Single {
    /**
     * 私有静态实例，防止被引用，此处赋值为null，目的是事先延迟加载
     */
    private static Single single=null;

    /**
     * 私有构造，防止被实例化
     */
    private Single(){

    }

    /**
     * 静态工厂方法，创建实例
     *线程不安全---多线程下不能用
     * @return
     */
    public static Single getInstence(){
        if (single==null){
            single=new Single();
        }
        return  single;
    }

    /**
     *synchronized 关键字锁住的是这个对象
     * 这样的用法，在性能上会有所下降，
     * 因为每次调用getInstence1()都要对对象上锁
     * 事实上只有在第一次创建对象的时候需要加锁--之后就不需要了，所以这个方式可以改进 改成getInstence2()
     * @return
     */
    public static synchronized Single getInstence1(){
        if(single==null){
            single =new Single();
        }
        return single;
    }

    /**
     *似乎解决了上一个提到的问题，将synchronized关键字加在了内部
     * 也就是说当调用的时候不需要加锁
     * 只有在single为null，并创建对象的时候才会加锁，性能有一定的提升
     * 但是，这样的情况还是可能有问题
     * 看下面的情况
     * 在java指令中创建对象和赋值操作是分开进行的，
     * 也就是说single = new Singel();语句是分两步执行的。
     * 但是jvm并不保证这两个操作的先后顺序，也就是说jvm可能会为新的Single实例分配空间
     * 然后直接赋值给single成员，再去初始化这个实例。这样就可能出错。
     * 以两个线程 A、B为例
     * 1>A、B同时进入第一个if判断
     * 2>A先进入synchronized块，由于single为null 所以执行single=new Single();
     * 3>由于jvm的优化机制，jvm先划了一些分配给Single实例的空白内存病赋值给single成员（此时jvm还没开始初始化这个实例）然后A离开synchronized块
     * 4>B进入synchronized块，由于此时single不是null，此时B马上离开synchronized块并将结果返回给调用该方法的程序。
     * 5>此时B打算使用Single实例，却发现没有被初始化，于是错误发生了。
     *所以程序还是有可能会发生错误，其实程序的运行过程还是比较复杂的
     * 从这点我们就可以看出，尤其是在写多线程环境下的程序更有难度，有挑战性。我们对该程序做进一步优化
     * @return
     */
    public static Single getInstence2(){
        if(single==null){
            synchronized (single){
                if (single==null){
                    single=new Single();
                }
            }
        }
        return single;
    }

    /**
     * 对上一个的优化
     *实际情况是单例模式使用内部类来维护单例的实现
     * jvm的内部机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
     * 这样当我们第一次调用getInstence3()的时候,
     * jvm能够帮我们保证single只被创建一次
     * 并且会保证把赋值给single的内存初始化完毕，=
     * 这样我们就不用担心上面的问题。
     * 同时该方法只会在第一次调用的时候使用互斥机制
     * 这样就解决了低性能问题。这样我们暂时总结一个完美的单例模式
     * @return
     */
    public static Single getInstence3(){
        return SingletonFactory.single;
    }
    private static class SingletonFactory{
        private static  Single single=new Single();
    }
    /**
     * 如果该对象用于被序列化，可以保证对象在序列化前后保持一致
     * @return
     */
    public Object readResolve(){
        return single;
    }
}

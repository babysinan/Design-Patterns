package com.huang.facade;

/**
 * Created by hlp on 2017/4/14.
 * 外观模式
 * 外观模式是为了解决类与类之间的依赖关系
 * 想spring一样，可以将类和类之间的关系配置到配置文件中
 * 而外观模式就是将他们的关系放在一个Facade类中
 * 降低了类与类之间的耦合度..该模式中没有涉及到接口
 * 例子：以计算机的启动过程为例
 * 如果没有Computer类，那么CPU Memory Disk他们之间会相互持有实例
 * 产生关系，这样会造成严重的依赖，修改一个类可能会造成其他类的修改
 * 这是我们不愿意看到的，又来Computer类
 * 他们之间的关系被放在了Computer类里
 * 起到了解耦的作用
 */
public class Computer {
    private  CPU   cpu;
    private Memory memory;
    private  Disk disk;
    public Computer(){
        cpu=new CPU();
        memory=new Memory();
        disk=new Disk();
    }
    public void startup(){
        System.out.println("computer start...");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("computer start finished!");
    }
    public void shutdown(){
        System.out.println("begin close computer..");
        cpu.shutdown();
        memory.shutdowm();
        disk.shutdown();
        System.out.println("computer closed!");
    }
}

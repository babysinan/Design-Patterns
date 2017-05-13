package com.huang.prototype;

import java.io.*;

/**
 * Created by hlp on 2017/4/14.
 * 原形模式
 * 原形模式虽然是创建型的模式，但与工程模式没有关系
 * 从名字可以看出，该模式的思想就是讲一个对象作为原形，对其进行复制，克隆，产生一个和原形相类似的对象
 * java中复制对象是通过clone（）实现的.
 * 很简单一个原形类只需要实现Cloneable接口，复写clone方法
 */
public class Prototype implements  Cloneable,Serializable{
    private static final long serialVersionUID = 1L;
    private String string;
    private SerializableObject obj;
    /**
     * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
     * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
     * 简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
     * @return
     * @throws CloneNotSupportedException
     * 浅复制
     */
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    /**
     * 深复制
     * 要实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象
     * @return
     */
    public Object deepClone() throws IOException,ClassNotFoundException{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois =new ObjectInputStream(bis);

        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}
class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}
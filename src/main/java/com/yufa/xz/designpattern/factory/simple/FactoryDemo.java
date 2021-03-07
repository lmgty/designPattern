package com.yufa.xz.designpattern.factory.simple;

/**
 * @author LiuYe
 * @date 2021/3/7 6:58 下午
 *
 * 对不同类对象的创建进行了一层薄薄的封装。该模式通过向工厂传递类型来指定要创建的对象，
 */
public class FactoryDemo {
    public static void main(String[] arg) {
        PhoneFactory factory = new PhoneFactory();
        Phone miPhone = factory.makePhone("MiPhone");
        IPhone iPhone = (IPhone) factory.makePhone("iPhone");
    }
}

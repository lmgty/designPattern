package com.yufa.xz.designpattern.factory.factoryMethod;

/**
 * @author LiuYe
 * @date 2021/3/7 7:01 下午
 *
 * 和简单工厂模式中工厂负责生产所有产品相比，工厂方法模式将生成具体产品的任务分发给具体的产品工厂
 */
public class FactoryDemo02 {
    public static void main(String[] args) {

        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone();
        appleFactory.makePhone();
    }
}

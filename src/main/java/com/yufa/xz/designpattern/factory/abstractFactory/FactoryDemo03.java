package com.yufa.xz.designpattern.factory.abstractFactory;

import com.yufa.xz.designpattern.factory.abstractFactory.factory.AbstractFactory;
import com.yufa.xz.designpattern.factory.abstractFactory.factory.AppleFactory;
import com.yufa.xz.designpattern.factory.abstractFactory.factory.XiaoMiFactory;

/**
 * @author LiuYe
 * @date 2021/3/7 7:10 下午
 *
 * 抽象工厂模式通过在AbstractFactory中增加创建产品的接口，并在具体子工厂中实现新加产品的创建
 */
public class FactoryDemo03 {
    public static void main(String[] arg) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone();            // make xiaomi phone!
        miFactory.makePC();                // make xiaomi PC!
        appleFactory.makePhone();        // make iphone!
        appleFactory.makePC();            // make MAC!
    }
}

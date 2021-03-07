package com.yufa.xz.designpattern.factory.factoryMethod;

/**
 * @author LiuYe
 * @date 2021/3/7 7:01 下午
 */
public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}

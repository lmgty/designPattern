package com.yufa.xz.designpattern.factory.abstractFactory.factory;

import com.yufa.xz.designpattern.factory.abstractFactory.IPhone;
import com.yufa.xz.designpattern.factory.abstractFactory.MAC;
import com.yufa.xz.designpattern.factory.abstractFactory.PC;
import com.yufa.xz.designpattern.factory.abstractFactory.Phone;

/**
 * @author LiuYe
 * @date 2021/3/7 7:09 下午
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
    @Override
    public PC makePC() {
        return new MAC();
    }
}
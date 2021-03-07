package com.yufa.xz.designpattern.factory.abstractFactory.factory;

import com.yufa.xz.designpattern.factory.abstractFactory.MiPC;
import com.yufa.xz.designpattern.factory.abstractFactory.MiPhone;
import com.yufa.xz.designpattern.factory.abstractFactory.PC;
import com.yufa.xz.designpattern.factory.abstractFactory.Phone;

/**
 * @author LiuYe
 * @date 2021/3/7 7:08 下午
 */
public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
    @Override
    public PC makePC() {
        return new MiPC();
    }
}

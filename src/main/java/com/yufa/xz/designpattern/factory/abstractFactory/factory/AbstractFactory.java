package com.yufa.xz.designpattern.factory.abstractFactory.factory;

import com.yufa.xz.designpattern.factory.abstractFactory.PC;
import com.yufa.xz.designpattern.factory.abstractFactory.Phone;

/**
 * @author LiuYe
 * @date 2021/3/7 7:06 下午
 */
public interface AbstractFactory {
    Phone makePhone();

    PC makePC();
}

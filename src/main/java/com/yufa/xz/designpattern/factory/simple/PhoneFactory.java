package com.yufa.xz.designpattern.factory.simple;

/**
 * @author LiuYe
 * @date 2021/3/7 6:58 下午
 */
public class PhoneFactory {
    public Phone makePhone(String phoneType) {
        if (phoneType.equalsIgnoreCase("MiPhone")) {
            return new MiPhone();
        } else if (phoneType.equalsIgnoreCase("iPhone")) {
            return new IPhone();
        }
        return null;
    }
}
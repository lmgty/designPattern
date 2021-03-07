package com.yufa.xz.designpattern.factory.abstractFactory;

/**
 * @author LiuYe
 * @date 2021/3/7 6:57 下午
 */
public class MiPhone implements Phone {
    public MiPhone() {
        this.make();
    }

    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make xiaomi phone!");
    }
}

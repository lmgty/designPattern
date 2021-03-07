package com.yufa.xz.designpattern.factory.abstractFactory;

/**
 * @author LiuYe
 * @date 2021/3/7 7:04 下午
 */
public class MiPC implements PC {
    public MiPC() {
        this.make();
    }

    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make xiaomi PC!");
    }
}
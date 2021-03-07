package com.yufa.xz.designpattern.factory.abstractFactory;

/**
 * @author LiuYe
 * @date 2021/3/7 7:05 下午
 */
public class MAC implements PC {
    public MAC() {
        this.make();
    }

    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make MAC!");
    }
}

package com.yufa.xz.designpattern.factory.simple;

/**
 * @author LiuYe
 * @date 2021/3/7 6:57 下午
 */
public class IPhone implements Phone {
    public IPhone() {
        this.make();
    }
    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make iphone!");
    }
}
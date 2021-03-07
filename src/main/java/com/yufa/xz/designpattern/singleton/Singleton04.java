package com.yufa.xz.designpattern.singleton;

/**
 * @author LiuYe
 * @date 2021/3/7 6:15 下午
 *
 * 静态内部类实现
 * 线程安全,推荐使用
 * 1. 当外部类被装载的时候，静态内部类不会立即被装载
 * 2. 当调用getInstance() 方法是，静态内部类被装载
 *    由于类加载是线程安全的，所以不会有安全性问题
 */
public class Singleton04 {
    private Singleton04() {
    }

    private static class SingletonInstance{
        private static final Singleton04 INSTANCE = new Singleton04();
    }

    public static Singleton04 getInstance(){
        return SingletonInstance.INSTANCE;
    }

}

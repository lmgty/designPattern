package com.yufa.xz.designpattern.singleton;

/**
 * @author LiuYe
 * @date 2021/3/7 6:15 下午
 *
 * 线程安全,推荐使用
 */
public class Singleton03 {
    private Singleton03() {
    }

    private static volatile Singleton03 instance;

    public static Singleton03 getInstance(){
        if (instance == null) {
            synchronized (Singleton03.class){
                if (instance == null) {
                    instance = new Singleton03();
                }
            }
        }
        return instance;
    }

}

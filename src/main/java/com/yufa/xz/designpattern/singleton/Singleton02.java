package com.yufa.xz.designpattern.singleton;

import java.time.Instant;

/**
 * @author LiuYe
 * @date 2021/3/7 6:15 下午
 *
 * 线程不安全
 */
public class Singleton02 {
    private Singleton02() {

    }

    private static Singleton02 INSTANCE;

    public static Singleton02 getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }

}

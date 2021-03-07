package com.yufa.xz.designpattern.template.improve;

/**
 * @author LiuYe
 * @date 2021/3/7 8:39 下午
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        // 空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}

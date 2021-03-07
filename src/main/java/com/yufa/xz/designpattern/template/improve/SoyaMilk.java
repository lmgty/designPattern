package com.yufa.xz.designpattern.template.improve;

/**
 * @author LiuYe
 * @date 2021/3/7 8:24 下午
 */
public abstract class SoyaMilk {

    // final 避免被子类重写
    final void make() {
        select();
        if (customerWantCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步：挑选新鲜豆子");
    }

    // 添加配料
    abstract void addCondiments();

    void soak(){
        System.out.println("第三步，浸泡豆子和配料");
    }

    void beat(){
        System.out.println("第四部，打碎它们");
    }

    // 钩子方法，子类决定是否需要添加配料
    boolean customerWantCondiments(){
        return true;
    }

}

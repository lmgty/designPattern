package com.yufa.xz.designpattern.template.improve;

/**
 * @author LiuYe
 * @date 2021/3/7 8:21 下午
 *
 * AbstractClass 抽象类，类中实现了模版方法，定义了算法的骨架
 * 具体子类需要去实现其他的抽象方法 OP2、3、4
 * 钩子方法默认什么都不干，让子类来灵活控制实现
 */
public class TemplateDemo {
    public static void main(String[] args) {
        System.out.println("------制作红豆豆浆------");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("------制作花生豆浆------");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("------制作纯豆浆------");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();

    }
}

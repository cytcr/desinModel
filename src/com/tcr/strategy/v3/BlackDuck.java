package com.tcr.strategy.v3;

import com.tcr.strategy.v3.Duck;

/**
 * @Description 黑头鸭
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/9/12 9:53
 */
public class BlackDuck extends Duck implements FlyInterface,QuackInterface{
    @Override
    public void display() {
        System.out.println("我是黑头鸭！");
    }


    @Override
    public void fly() {
        System.out.println("我是黑头鸭！我在飞！");
    }

    @Override
    public void quack() {
        System.out.println("我是黑头鸭！我在叫！");
    }
}

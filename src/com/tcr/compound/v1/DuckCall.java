package com.tcr.compound.v1;

/**
 * 描述:
 * 鸭鸣器
 * @author TCR 670830864@qq.com
 * @date 2019/11/25 16:37
 */
public class DuckCall implements Quackable{

    @Override
    public void quack() {
        System.out.println("鸭鸣器吱吱叫！");
    }
}

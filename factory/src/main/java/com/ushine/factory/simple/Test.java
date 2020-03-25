package com.ushine.factory.simple;

import com.ushine.factory.Telunsu;

public class Test {

    public static void main(String[] args) {

        // 不需要生产过程 只需要 需求 返回结果
        SimpleFactory factory = new SimpleFactory();
        // 把用户的需求告诉工厂
        System.out.println(factory.getMike("特仑苏"));


    }

}

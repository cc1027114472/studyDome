package com.ushine.factory.abstr;

import com.ushine.factory.Milk;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        MilkFactory factory = new MilkFactory();

        //对于用户而言，更加简单了
        //用户只有选择的权利
        System.out.println(factory.getMengniu());


    }


}

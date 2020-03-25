package com.ushine.factory.simple;

import com.ushine.factory.MengNiu;
import com.ushine.factory.Milk;
import com.ushine.factory.Telunsu;
import com.ushine.factory.Yili;

/**
 *
 */
public class SimpleFactory {

    public Milk getMike(String name) {

        if ("特仑苏".equals(name)) {
            return new Telunsu();
        } else if ("伊利".equals(name)) {
            return new Yili();
        } else if ("蒙牛".equals(name)) {
            return new MengNiu();
        }
        return null ;
    }

}

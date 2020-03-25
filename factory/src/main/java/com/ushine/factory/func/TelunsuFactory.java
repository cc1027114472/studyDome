package com.ushine.factory.func;

import com.ushine.factory.Milk;
import com.ushine.factory.Telunsu;

/**
 *  事情变得越来越专业
 */
public class TelunsuFactory implements Factory{


    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}

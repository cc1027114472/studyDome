package com.ushine.factory.func;

import com.ushine.factory.Milk;
import com.ushine.factory.Yili;

public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}

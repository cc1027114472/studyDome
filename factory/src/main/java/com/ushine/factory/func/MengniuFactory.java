package com.ushine.factory.func;

import com.ushine.factory.MengNiu;
import com.ushine.factory.Milk;

public class MengniuFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new MengNiu();
    }


}

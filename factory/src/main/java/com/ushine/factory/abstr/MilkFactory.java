package com.ushine.factory.abstr;

import com.ushine.factory.MengNiu;
import com.ushine.factory.Milk;
import com.ushine.factory.func.MengniuFactory;
import com.ushine.factory.func.TelunsuFactory;
import com.ushine.factory.func.YiliFactory;

/**
 *
 */
public class MilkFactory extends AbstractFactory{


    @Override
    public Milk getMengniu() {

        return new MengniuFactory().getMilk();
    }

    @Override
    public Milk getYili() {

        return new YiliFactory().getMilk();
    }

    @Override
    public Milk getTelunsu() {

        return new TelunsuFactory().getMilk();
    }


}

package com.ushine.factory.abstr;

import com.ushine.factory.Milk;

/**
 *
 */
public abstract class AbstractFactory {

     // 公共逻辑
    // 方便于统一管理

    /**
     *  获得一个特仑苏品牌的牛奶
     * @return
     */
    public abstract Milk getMengniu();

    public abstract  Milk getYili();

    public abstract Milk getTelunsu();

}

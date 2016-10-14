package org.sts.sso.pizza.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author ts.Sun
 * @since 0.1
 */
public enum Topping {

    Marinara,Margherita,Romana,Quattro_Stagioni ;


    public static List<Topping> asList(){
        Topping[] toppings = Topping.values();
        return Arrays.asList(toppings);
    }

    @Override
    public String toString(){

        String temp = null;
        switch (this) {
            case Marinara:
                temp = "番茄酱 大蒜 牛至叶";
                break;
            case Margherita:
                temp="番茄酱 mozzarella 牛至叶 加几片罗勒叶";
                break;
            case Romana:
                temp="番茄酱 mozzarella 凤尾鱼 capperi";
                break;
            case Quattro_Stagioni:
                temp="番茄酱 mozzarella 熟火腿 洋蓟 凤尾鱼 牛至叶";
                break;
            default:
                temp="不就是烧饼嘛";
                break;
        }

        return temp;

    }
}
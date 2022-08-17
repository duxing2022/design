package com.demo.design.cBuilder.director;

import com.demo.design.cBuilder.concreteBuilder.ChickenBurger;
import com.demo.design.cBuilder.concreteBuilder.Coke;
import com.demo.design.cBuilder.concreteBuilder.Pepsi;
import com.demo.design.cBuilder.concreteBuilder.VegBurger;

/**
 * 膳食建设者
 *
 * @author Administrator
 * @date 2022/08/17
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

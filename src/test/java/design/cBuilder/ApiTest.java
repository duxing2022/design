package design.cBuilder;

import com.demo.design.cBuilder.concreteBuilder.Meal;
import com.demo.design.cBuilder.director.MealBuilder;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    @Test
    public void test_cBuilder() throws Exception {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        log.info("Veg Meal");
        vegMeal.showItems();
        log.info("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        log.info("Non-Veg Meal");
        nonVegMeal.showItems();
        log.info("Total Cost: " + nonVegMeal.getCost());
    }
}


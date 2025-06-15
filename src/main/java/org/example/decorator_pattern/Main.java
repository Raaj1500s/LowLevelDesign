package org.example.decorator_pattern;

import org.example.decorator_pattern.base_class.BasePizza;
import org.example.decorator_pattern.base_class.VegDelight;
import org.example.decorator_pattern.decorator.ExtraCheese;
import org.example.decorator_pattern.decorator.ExtraSpicy;

public class Main {
    public static void main(String[] args) {
        BasePizza vegPizza = new VegDelight();
        System.out.println("Veg Pizza Cost: "+ vegPizza.cost());

        BasePizza vegPizzaWithExtraCheese = new ExtraCheese(vegPizza);
        System.out.println("Veg Pizza with Extra Cheese Cost: "+ vegPizzaWithExtraCheese.cost());

        BasePizza vegPizzaWithExtraSpice = new ExtraSpicy(vegPizza);
        System.out.println("Veg Pizza with Extra Spicy Cost: " + vegPizzaWithExtraSpice.cost());

        BasePizza vegPizzaWithExtraCheeseAndSpice = new ExtraSpicy(vegPizzaWithExtraCheese);
        System.out.println("Veg Pizza with Extra Cheese and Spicy: " + vegPizzaWithExtraCheeseAndSpice.cost());
    }
}

package org.example.decorator_pattern.decorator;

import org.example.decorator_pattern.base_class.BasePizza;

public class ExtraSpicy extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraSpicy(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}

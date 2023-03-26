package fooddelivery.filter;

import fooddelivery.data.FoodItem;

public interface FoodItemFilter {
    boolean filter(FoodItem foodItem);
}

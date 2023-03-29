package fooddelivery.filter;

import fooddelivery.data.FoodItem;
import fooddelivery.filter.FoodItemFilter;
import fooddelivery.data.MealType;

public class MealTypeFilter implements FoodItemFilter {
    private MealType mealType;

    public MealTypeFilter(MealType mealType) {
        this.mealType = mealType;
    }

    public boolean filter(FoodItem foodItem){
        return foodItem.getMealType().equals(mealType);
    }
}

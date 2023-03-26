package fooddelivery.filter;

import java.util.List;

import fooddelivery.data.CuisineType;
import fooddelivery.data.FoodItem;

public class CuisineTypeFilter implements FoodItemFilter {
    private List<CuisineType> cuisineTypes;

    public CuisineTypeFilter(List<CuisineType> cuisineTypes) {
        this.cuisineTypes = cuisineTypes;
    }
    
    public boolean filter(FoodItem foodItem){
        return cuisineTypes.contains(foodItem.getCuisineType());
    }
}

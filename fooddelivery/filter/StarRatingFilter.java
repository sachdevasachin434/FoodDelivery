package fooddelivery.filter;

import fooddelivery.data.FoodItem;
import fooddelivery.data.StarRating;

public class StarRatingFilter implements FoodItemFilter {
    private StarRating starRating;

    public StarRatingFilter(StarRating starRating) {
        this.starRating = starRating;
    }

    public boolean filter(FoodItem foodItem){
        return foodItem.getStarRating().getVal()>=starRating.getVal();
    }
    
}

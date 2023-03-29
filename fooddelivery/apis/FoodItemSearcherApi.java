package fooddelivery.apis;

// import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;

import fooddelivery.data.CuisineType;
import fooddelivery.data.FoodItem;
import fooddelivery.data.MealType;
import fooddelivery.data.StarRating;
import fooddelivery.filter.MealTypeFilter;
import fooddelivery.filter.StarRatingFilter;
import fooddelivery.searcher.FoodItemSearcher;
import fooddelivery.filter.CuisineTypeFilter;
import fooddelivery.filter.FoodItemFilter;

public class FoodItemSearcherApi {
    public List<FoodItem> foodItemSearcherApi(String foodName, MealType mealType, StarRating starRating, List<CuisineType> cuisines){
        // validations
        List<FoodItemFilter> filters = new ArrayList<>();
        if(mealType!=null)
            filters.add(new MealTypeFilter(mealType));
        if(starRating!=null)
            filters.add(new StarRatingFilter(starRating));
        if(cuisines!=null)
            filters.add(new CuisineTypeFilter(cuisines));
        FoodItemSearcher foodItemSearcher = new FoodItemSearcher();
        return foodItemSearcher.foodItemSearcher(foodName, filters);
    }
}

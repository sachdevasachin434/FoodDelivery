package fooddelivery.searcher;

import java.util.ArrayList;
import java.util.List;

import fooddelivery.data.FoodItem;
import fooddelivery.filter.FoodItemFilter;

public class FoodItemSearcher {
    public List<FoodItem> foodItemSearcher(String foodItemName, List<FoodItemFilter> filters){
        if(foodItemName == "" || foodItemName == null){
            throw new IllegalArgumentException("foodItem wrong value");
        }
        DataAccessor dataAccessor = new DataAccessor();
        DataRows dataRows = dataAccessor.getItems(foodItemName);
        List<FoodItem> foodItems = DataRowsToFoodItemConverter.convert(dataRows);
        List<FoodItem> result = new ArrayList<>();
        for(FoodItem foodItem: foodItems){
            boolean isValid = true;
            for(FoodItemFilter filter: filters){
                if(!filter.filter(foodItem)){
                    isValid = false;
                }
            }
            if(isValid){
                result.add(foodItem);
            }
        }
        return foodItems;
    }
    
}

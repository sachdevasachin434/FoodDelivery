package fooddelivery.data;

public class FoodItem {
    private final int id;
    private final String name;
    private final String description;
    private final MealType mealType;
    private final CuisineType cuisineType;
    private final StarRating starRating;
    private final boolean isAvailable;
    private final int restrauntId;

    public FoodItem(int id, String name, String description, MealType mealType, CuisineType cuisineType,
            StarRating starRating, boolean isAvailable, int restrauntId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mealType = mealType;
        this.cuisineType = cuisineType;
        this.starRating = starRating;
        this.isAvailable = isAvailable;
        this.restrauntId = restrauntId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public MealType getMealType() {
        return mealType;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public StarRating getStarRating() {
        return starRating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getRestrauntId() {
        return restrauntId;
    }

    
}

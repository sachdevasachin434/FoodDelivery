package fooddelivery;

public class Controller{

    // Read APIs
    public List<FoodItem> foodItemSearcher(String searchItem, List<Filters> filters){}

    public List<Restraunt> searchByRestraunt(String searchItem, List<Filters> filters){}

    public Restraunt getRestrauntById(String restrauntId){}

    public FoodItem getFoodItemById(String foodItemId){}

    // Post APIs

    public void addToCart(String foodItemId, String userToken){}

    public Order placeOrder(String userToken, PaymentMode paymentMode, PaymentInfo paymentInfo){}

    public void updateOrder(String orderId, OrderStatus status, String userToken){}

}

// public class Restraunt{
//     String name;
//     List<FoodItem> menu;
//     FoodItem searchInMenu
// }

// cancelOrder(customer) -> condition === orderPlaced
// placeOrder(customer) -> status=OrderPlaced
// acceptOrder(restraunt) -> status=Cooking
// OrderPrepared(restraunt) -> status=READYFORDELIVERY
// orderPickedUp(deliveryGuy) -> status=OutForDelivery
// orderDelivered(deliveryGuy) -> status=Delivered



// public void removeFromCart(FoodItem foodItem, User user, String userToken){}

// public void increaseFoodItemQuantity(FoodItem foodItem, String userToken){}

// public void decreaseFoodItemQuantity(FoodItem foodItem, String userToken){}

// public void makePayment(Restraunt restraunt, User user, PaymentMode paymentMode, int amount, String userToken){}

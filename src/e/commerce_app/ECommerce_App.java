package e.commerce_app;

/**
 *
 * @author g
 */
public class ECommerce_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product chair = new Product("Wooden Chair", "Brown", "Furniture" , 30, 3 , "A wooden chair made from palm tree.");
        Product shirt = new Product("Red shirt", "Red", "Clothes" , 50, 1 , "A red shirt with soft fabric.");
        
        User user1 = new User("Gonca01" , "Gonca" , "Arabaci" , "01.01.2002" , "123", "gmail" , "Izmir" , "Manisa");
        CreditCard card1 =  new CreditCard("111111" , user1 , "3" , "01/2028");        
        Order order1 = new Order( chair,user1, card1 ); 
        
        user1.addtoFav(chair);
        user1.addToCart(chair );
        order1.orderProduct();
        
    }
}

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
        Product chair = new Product("Wooden Chair", "Brown", "Furniture" , 30, 3.2 , "A wooden chair made from palm tree.");
        Product shirt = new Product("Red shirt", "Red", "Clothes" , 50, 1.1 , "A red shirt with soft fabric.");
        
        User user1 = new User("Gonca01" , "Gonca" , "Arabaci" , "01.01.2002" , "123", "gmail_1" , "Izmir" , "Manisa");
        User user2 = new User("Fatma01" , "Fatma" , "Kozan" , "01.01.2003" , "321", "gmail_2" , "Manisa" , "Izmir");
        
        CreditCard card1 =  new CreditCard("111111" , user1 , "3" , "08/2028");    
        CreditCard card2 =  new CreditCard("222222" , user2 , "5" , "07/2027");        

        Order order1 = new Order( chair,user1, card1 ); 
        Order order2 = new Order( shirt,user2, card2 );
        
        user1.addtoFav(chair);
        user1.addtoFav(shirt);
        user1.addToCart(chair );
        order1.orderProduct();
        
        user2.addtoFav(shirt);
        user2.addToCart(shirt );
        order2.orderProduct();
        
    }
}

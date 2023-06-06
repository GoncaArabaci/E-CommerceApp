package e.commerce_app;

import java.util.Scanner;

/**
 *
 * @author g
 */
public class Order {
    private Product orderedProduct;
    private User user;
    private CreditCard creditCard;

    public Order(Product orderedProduct, User user, CreditCard creditCard) {
        this.orderedProduct = orderedProduct;
        this.user = user;
        this.creditCard = creditCard;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    
    //***************************************
    
    public void orderProduct() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the quantity you want to order:");
        int productAmount = s.nextInt();
        
        
            if (this.orderedProduct.updateStock(productAmount)) {
                System.out.println("Please enter your credit card's security code for purchase:");
                String input = s.next();
                if (input.equals(this.creditCard.getSecurityCode())) {
                    System.out.println("");
                    System.out.println("*************************");
                    System.out.println("Your order for " + productAmount + " " + this.orderedProduct.getProductName() + "(s) has been ordered successfully.");
                    System.out.println("*************************");
                    System.out.println("");
                } 
                else {
                System.out.println("The code you entered is wrong");
                }
            }
        
    }
}
package e.commerce_app;

import java.util.ArrayList;

/**
 *
 * @author g
 */
public class User {
    private String username;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String email;
    private String homeAdress;
    private String workAdress;
    private ArrayList<Product> orderedProducts;
    private ArrayList<Product> favProductList;
    private ArrayList<CreditCard> creditCardList;    

    public User(String username, String name, String surname, String dateOfBirth, String password, String email, String homeAdress, String workAdress ) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.homeAdress = homeAdress;
        this.workAdress = workAdress;
        this.favProductList = new ArrayList<Product>();
        this.orderedProducts = new ArrayList<Product>();
        this.creditCardList = new ArrayList<CreditCard>();
        this.writeAllAtts();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public String getWorkAdress() {
        return workAdress;
    }

    public void setWorkAdress(String workAdress) {
        this.workAdress = workAdress;
    }
  
    //*********************************************
    public void addCreditCard(CreditCard card){
        this.creditCardList.add(card);
    }
    
    public CreditCard getCreditCardByIndex(int index ){
        return this.creditCardList.get(index);
    }
    
    public void addtoFav(Product product){
        this.favProductList.add(product);
        System.out.println(this.username + ", " + "product '" + product.getProductName() + "' added to your favorite list.");
        System.out.println(this.username +"'s favourite product(s) list: ");
        for (int i = 0; i < favProductList.size(); i++) {
            System.out.println(favProductList.get(i).getProductName());
        }
    }
    
    public void addToCart(Product product ){
        this.orderedProducts.add(product);
        
        System.out.println( this.username + ", " + product.getProductName() +" added to your cart.");
    }
    
    public void writeAllAtts(){
        System.out.println("");
        System.out.println("***************");
        System.out.println("USER INFO");
        System.out.println("Username: " + this.username);
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Date Of Birth: " + this.dateOfBirth);
        System.out.println("Password: "+this.password);
        System.out.println("Email: "+this.email);
        System.out.println("Home Adress: " + this.homeAdress);
        System.out.println("Work Adress: " + this.workAdress);
        System.out.println("***************");
        System.out.println("");
    }


    
}
    
    


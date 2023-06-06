package e.commerce_app;

/**
 *
 * @author g
 */
public class Product {
    private String productName;
    private String productColor;
    private String productCategory;
    private int stock;
    private double productWeight;
    private String productDescription;

    public Product(String productName, String productColor, String productCategory, int stock, double productWeight, String productDescription) {
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.stock = stock;
        this.productWeight = productWeight;
        this.productDescription = productDescription;
        this.writeAllAtts();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    //*********************************************
    public boolean updateStock(int productAmount){
        if (productAmount <= this.stock) {
            this.setStock(this.stock - productAmount);
            System.out.println("");
            return true;
        }
        else{
            System.out.println("");
            System.out.println("*************************");
            System.out.println("Not enough stock to order.");
            System.out.println("*************************");
            System.out.println("");
            return false;
        }
    }
    public void writeAllAtts(){
        System.out.println("");
        System.out.println("***************");
        System.out.println("Product Name:" + this.productName);
        System.out.println("Product Color:" + this.productColor);
        System.out.println("Product Category:" + this.productCategory);
        System.out.println("Stock Info:" + this.stock);
        System.out.println("Product Weight:"+this.productWeight);
        System.out.println("Product Description:"+this.productDescription);
        System.out.println("***************");
        System.out.println("");
    }
}

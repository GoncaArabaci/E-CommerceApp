package e.commerce_app;

/**
 *
 * @author g
 */
public class CreditCard {
    private String creditCardNumber;
    private User creditCardOwner;
    private String securityCode;
    private String expirationDate;

    public CreditCard(String creditCardNumber, User creditCardOwner, String securityCode, String expirationDate) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardOwner = creditCardOwner;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
        this.writeAllAtts();
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public User getCreditCardOwner() {
        return creditCardOwner;
    }

    public void setCreditCardOwner(User creditCardOwner) {
        this.creditCardOwner = creditCardOwner;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    public void writeAllAtts(){
        System.out.println("");
        System.out.println("***************");
        System.out.println("Credit Card no: " + this.creditCardNumber);
        System.out.println("Owner: " + this.creditCardOwner.getName()+ " " + this.creditCardOwner.getSurname());
        System.out.println("Security Code: " + this.securityCode);
        System.out.println("Expiration Date: " + this.expirationDate);
        System.out.println("***************");
        System.out.println("");
    }
    
}

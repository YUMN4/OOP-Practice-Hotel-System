public class Customer {

    private String name;
    private int passportID;
    private String paymentMethod;
    private String email;
    private int mobileNum;
    private String birthDate;
    private String checkInDate;
    private int numDays;

    public Customer(String name, int passportID, String paymentMethod, String email, int mobileNum, String birthDate, String checkInDate, int numDays){
        this.name = name;
        this.passportID = passportID;
        this.paymentMethod = paymentMethod;
        this.email = email;
        this.mobileNum = mobileNum;
        this.birthDate = birthDate;
        this.checkInDate = checkInDate;
        this.numDays = numDays;
    }

    public void setName(String newName){ this.name = newName;}

    public void setPassportID(int newPassportID){ this.passportID = newPassportID;}

    public void setPaymentMethod(String newPaymentMethod){ this.paymentMethod = newPaymentMethod;}

    public void setEmail(String newEmail){ this.email = newEmail;}

    public void setMobileNum(int newMobileNum){ this.mobileNum = newMobileNum;}

    public void setBirthDate(String newBirthDate){ this.birthDate = newBirthDate;}

    public void setCheckInDate(String newCheckInDate){ this.checkInDate = newCheckInDate;}

    public void setNumDays(int newNumDays){ this.numDays = newNumDays;}

    public String getName(){ return this.name;}

    public int getPassportID(){ return this.passportID;}

    public String getPaymentMethod(){ return this.paymentMethod;}

    public String getEmail(){ return this.email;}

    public int getMobileNum(){ return this.mobileNum;}

    public String getBirthDate(){ return this.birthDate;}

    public String getCheckInDate(){ return this.checkInDate;}

    public int getNumDays(){ return this.numDays;}

    public void validateEmail(String email){
        if(email.contains("@") && email.contains(".") && email.indexOf("@") < email.indexOf(".")){
            System.out.println("Email address: " + email + " is valid!");
        }
        else{
            System.out.println(email + "Email address: " + email +" is not valid");
        }
    }

    @Override
    public String toString() {
        String customerInfo = "Name: " + this.name +
                "\nPassport ID: " + this.passportID +
                "\nPayment Method: " + this.paymentMethod +
                "\nEmail: " + this.email +
                "\nMobile Number: " + this.mobileNum +
                "\nBirth Date: " + this.birthDate +
                "\nCheck In Date: " + this.checkInDate +
                "\nNumber Of Days: " + this.numDays;
        return customerInfo;
    }
}

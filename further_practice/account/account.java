
//:::::Bank account with getter and setter:::::
//:::::DEFAULT & PARAMETERIZE CONSTRUCTOR:::::
//:::::THIS KEYWORD::::::

package interface_onward.account;

public class account {
    private String number;
    private double balance;
    private String customername;
    private String customeremailaddress;
    private String customerphonenumber;

    public void deposit(double deposite){
        this.balance+=deposite;

    }
    public account(){
        this("Aps","123","@fuck.com");
        System.out.println("account default constructor");
    }
    public account (String customername,String customerphonenumber,String customeremailaddress){
        System.out.println("parameterize constructor called::");
        this.customername=customername;
        this.customerphonenumber=customerphonenumber;
        this.customeremailaddress=customeremailaddress;
    }
    public void withdraw(double amount){
        this.balance-=amount;
        System.out.println("available amount::"+this.balance);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeremailaddress() {
        return customeremailaddress;
    }

    public void setCustomeremailaddress(String customeremailaddress) {
        this.customeremailaddress = customeremailaddress;
    }

    public String getCustomerphonenumber() {
        return customerphonenumber;
    }

    public void setCustomerphonenumber(String customerphonenumber) {
        this.customerphonenumber = customerphonenumber;
    }
}


public class Account {
    // Data Members
    private String accNo;
    private String name;
    private  String address;
    private  String phoneNo;
    private String dob;

    // Getters / Setters
    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getDob() {
        return dob;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    // Constructors
    Account(){}
    Account(String address,String name,String accNo,String dob,String phoneNo){}

    //Methods
    void Close(String accNo){}
}

  class SavingsAccount extends Account{
    void Deposit(){}
    void Withdrawals(){}
    void fixedDeposit(){}
    void liquidDate(){}
}

class LoanAccount extends  Account{
    void payEmi(){}
    void topUpLoan(){}
    void repayment(){}
}

class Inheritance{
 public static void main(String [] args){
    SavingsAccount sa=new SavingsAccount();
    sa.Deposit();
    sa.Withdrawals();
    LoanAccount la = new LoanAccount();
    la.payEmi();
    la.repayment();
}

}
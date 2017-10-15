public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;

    public void withdrawal(double withdrawalamount)
    {
        if(this.balance > withdrawalamount)
        {
            this.balance = this.balance - withdrawalamount;

            System.out.println("Withdrawal of " + withdrawalamount + "Processed. Remaining balance = " + this.balance);

        }else
        {
            System.out.println("Insufficient Banalce");
            System.out.println("Current Balance = "+ this.balance);
        }
    }

    public void deposite(double depositamount)
    {
        this.balance += depositamount;
        System.out.println("Current Balance = "+ this.balance);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhn_number(String phn_number) {
        this.phn_number = phn_number;
    }

    public String getNumber() {

        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhn_number() {
        return phn_number;
    }

    private String phn_number;

}

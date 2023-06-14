package ChapterThree;

public class Account {
    private int balance;
    private String pin;
    private String accountNum;
    private String accountName;
    private String phoneNum;

    public Account(String accountName, String phoneNum) {
        this.accountName = accountName;
        this.phoneNum = phoneNum;
    }

    public void deposit(int amount) {
        if (amount > 0)
            balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(String pin, int amount) {
        if (this.pin == pin) {
            if (amount > 0) {
                balance -= amount;
            }
        }
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }
    public String getAccountNum(){
        return accountNum;
    }
    public String getPin(){
        return pin;
    }
    public void setPin(String pin){
        this.pin = pin;
    }
    public String getAccountName(){
        return accountName;
    }
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
}


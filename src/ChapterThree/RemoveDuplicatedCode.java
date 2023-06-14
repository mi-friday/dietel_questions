package ChapterThree;

public class RemoveDuplicatedCode {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", "0906933532");
        Account account2 = new Account("John Blue", "08135455332" );

        displayAccount(account1);
        displayAccount(account2);
    }

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("Account name: %s%nBalance: $%.2f%n%n", accountToDisplay.getAccountName(), accountToDisplay.getBalance());
    }
}

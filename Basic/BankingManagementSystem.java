package Basic;
public class BankingManagementSystem{
    String Name;
    int Pin;
    int AccNumber;
    int CurrentAmount;
    
    BankingManagementSystem(String Name){//To create a accouunt when class is called
        this.Name=Name;
        AccNumber=(int)(Math.random()*1000000000);
        Pin=(int)(Math.random()*10000);
        CurrentAmount = 1000;
    }
    public void Details (){//To show Bank details
        System.out.println("\nAccount owner name: "+Name);
        System.out.println("Account Number is: "+AccNumber);
        System.out.println("Pin is "+ Pin);
        System.out.println("Initial amount is "+ CurrentAmount);
    }
    public void deposit(int deposit){// To deposite money
        if (deposit < 0) {
            System.out.println("\nDeposit Should be positive");
        }
        else{
        CurrentAmount = CurrentAmount+deposit;
        System.out.println("\nYour "+deposit+" has been succesfully deposited\nYour new account ballance is "+CurrentAmount);
        }
    }
    int withdrawl(int withdrawl){//To withdrawl money
        if (withdrawl > CurrentAmount){
            System.out.println("\nYou don't have sufficient amount");
        }
        else if (withdrawl <0) {
             System.out.println("\nWithdrawl Should be positive");
        }
        else{
            CurrentAmount-=withdrawl;
            System.out.println("You haave been withdrawl "+withdrawl+ " suuccesfully");
        }
        return CurrentAmount;
    }
    void checkBalance(){//To show balance
        System.out.println("\n"+Name+" Your current balance is "+CurrentAmount);
    }
}
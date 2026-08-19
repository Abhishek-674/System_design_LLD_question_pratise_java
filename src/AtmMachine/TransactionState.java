package AtmMachine;

import java.util.Scanner;

public class TransactionState implements AtmState {
    @Override
    public void insertCard(Atm atm,Card card){

    }
    @Override
    public void validatePin(Atm atm, int pin){

    }
    @Override
    public void performTransaction(Atm atm){
        System.out.println("Enter 1 for checking balance");
        System.out.println("Enter 2 for withdrawing Cash");
        System.out.println("Enter 3 for withdrawing Cash");
        Scanner sc = new Scanner(System.in);
        int temp=sc.nextInt();
        if(temp==1){
            System.out.println("Your balance is "+atm.currentCard.account.checkBalance());

        }
        else if (temp==2) {
             System.out.println("Enter balance to be withdraw. Must be miultiple of 100 ");
             atm.currentCard.withdrawCash(sc.nextDouble());
             System.out.println("Please collect the cash");
        }
        else{
            atm.setState(new EjectCardState());
        }

    }
    @Override
    public void ejectCard(Atm atm){};
}

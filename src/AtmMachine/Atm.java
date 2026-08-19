package AtmMachine;

import java.util.Scanner;

public class Atm {
    AtmState atmState;
    Card currentCard;
    void setState(AtmState atmState){
        this.atmState = atmState;
    }
    void setAtmCard(Card card){
        this.currentCard = card;
    }

    public void insertCard(){
       atmState.insertCard(this,currentCard);
    }

    public void validatePin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pin");
         atmState.validatePin(this,sc.nextInt());
    }

    public void performTransaction(){
        atmState.performTransaction(this);
    }

    public void ejectCard(){
        atmState.ejectCard(this);
    };
}

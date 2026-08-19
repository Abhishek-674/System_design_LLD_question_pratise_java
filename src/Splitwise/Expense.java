package Splitwise;

public class Expense {
    User addedBy;
    int amount;
    Group group;
    public Expense(User addedBy, int amount){
        this.addedBy = addedBy;
        this.amount = amount;

    }
}

package Splitwise;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String name;
    List<User> users;
    List<Expense> expenses;
    SplitwiseStrategy strategy;
    public Group(String name){
        this.name = name;
        users = new ArrayList<>();
        expenses = new ArrayList<Expense>();
    }
    void addUser(User user){
        users.add(user);
    }
    void removeUser(User user){
        users.remove(user);
    }
    void addExpense(Expense expense,SplitwiseStrategy strategy)
    {
        strategy.split(expense,this);
        expenses.add(expense);
    }
}

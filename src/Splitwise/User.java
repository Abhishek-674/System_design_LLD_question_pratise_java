package Splitwise;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    List<Split> transactionList;
    public User(String name){
        this.name = name;
        transactionList = new ArrayList<Split>();
    }
    void getTransactionList()
    {
        for(Split s: transactionList)
        {
            System.out.println(s.payTo.name+ "amount"+s.amount);
        }
    }

}

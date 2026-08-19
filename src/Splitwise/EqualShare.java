package Splitwise;

import java.util.ArrayList;
import java.util.List;

public class EqualShare implements  SplitwiseStrategy {
    @Override
    public void split(Expense expense,Group group) {
           int amt=expense.amount;
           int numberofUser=group.users.size();
           int share=amt/numberofUser;
//        List<Split> splits=new ArrayList<Split>();
           for(User u:group.users){
               if(u!=expense.addedBy)
               {
                   Split split = new Split(expense.addedBy,share);
                   u.transactionList.add(split);
               }


           }
//           return splits;
    }

}

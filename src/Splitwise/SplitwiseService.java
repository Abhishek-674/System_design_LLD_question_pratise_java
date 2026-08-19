package Splitwise;

import java.util.ArrayList;
import java.util.List;

public class SplitwiseService {
    List<Group> groups;

    public SplitwiseService() {
        this.groups = new ArrayList<Group>();
    }
    void addGroup(Group group) {
        this.groups.add(group);
    }
    void addExpense(Expense expense,Group group,SplitwiseStrategy strategy) {
        group.addExpense(expense,strategy);

    }
}

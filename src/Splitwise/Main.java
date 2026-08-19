package Splitwise;

public class Main {
    public static void main(String[] args) {
        SplitwiseService splitwiseService = new SplitwiseService();
        User u1=new User("u1");
        User u2=new User("u2");
        User u3=new User("u3");
        User u4=new User("u4");
        User u5=new User("u5");
        User u6=new User("u6");
        Group manali=new Group("manali");
        Group movie=new Group("movie");
        manali.addUser(u1);
        manali.addUser(u2);
        manali.addUser(u3);
        manali.addUser(u4);
        manali.addUser(u5);
        manali.addUser(u6);
        splitwiseService.addExpense(new Expense(u1,6000),manali,new EqualShare());
        splitwiseService.addExpense(new Expense(u2,600),manali,new EqualShare());
        splitwiseService.addExpense(new Expense(u1,6000),manali,new EqualShare());
        u1.getTransactionList();
        System.out.println("List of u4");
        u4.getTransactionList();

    }
}

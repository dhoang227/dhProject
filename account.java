public class account {
    private String id;
    private String name;
    private float balance = 500;

    public account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public account(String id, String name, float balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getBalance(){
        return balance;
    }
    public float credit(float amount){
        balance += amount;
        return balance;
    }
    public float debit(float amount){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public float transferTo(account another, float amount){
        if(amount <= balance){
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString(){
        return "account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
    public static void main(String[] args){
        account acc1 = new account("A001", "Alice");
        account acc2 = new account("A002", "BoB");
        account acc3 = new account("A003", "Charlie", 2000);
        
        System.out.println(acc1);
        System.out.println(acc2);
        acc1.credit(1000);
        acc3.debit(700);
        acc1.transferTo(acc2, 500);
        System.out.println("Alice duoc cong them 1000");
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }


    
}

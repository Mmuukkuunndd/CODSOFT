public class Userbankaccount {
    float balance=0,amount;
    void withdraw(float samount)
    {
        amount=samount;
       if(amount<=0||balance<amount) 
      System.out.println("unable to withdrwa");
       else
       balance-=amount;
    }
    void deposit(float samount)
    {
        amount=samount;
        if(amount<=0)
        System.out.println("unable to deposit");
        else
        balance+=amount;
    }
    void checkbalance()
    {
        System.out.println("Current balance is :"+balance);
    }
    
}

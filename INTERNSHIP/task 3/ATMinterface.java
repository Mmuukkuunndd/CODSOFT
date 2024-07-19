import java.util.Scanner;

public class ATMinterface {
    public static void main(String[] args) {
        Userbankaccount userbankaccount=new Userbankaccount();
        int ch;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("ATM Menu:\npress 1:withdrwa\npress 2:deposit\npress 3:check balance\npress 4:Terminate");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("enter withdrwa amount:");
                float  amount =sc.nextFloat();
                userbankaccount.withdraw(amount);
                break;
                case 2:
                System.out.println("enter deposit amount:");
                float  aamount =sc.nextFloat();
                userbankaccount.deposit(aamount);
                break;
                case 3:
                userbankaccount.checkbalance();
                break;
                case 4:
                return;
                default:
                System.out.println("enter valid choice!");
            }
        }
    }
}

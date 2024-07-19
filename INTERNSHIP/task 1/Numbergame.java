import java.util.Random;
import java.util.Scanner;

class Numbergame
{
    
    public static void game(int random)
    {
        Scanner sc=new Scanner(System.in);
        int guess;
        System.out.println("Guess a positive integer(number):");
        guess=sc.nextInt();
        int round=0;
    while(guess!=random&&round<10)
    {
        if(guess<random)
        {
            System.out.println("To low!");
        }
        else if(guess>random)
        {
            System.out.println("To high!");
        }
        if(guess==random)
        System.out.println("correct");
        //System.out.println("Round"+round);
        
        System.out.println("Chosse again:");
        guess=sc.nextInt();
        round++;
    }
    //System.out.println(round);
    if(round>=10)
    System.out.println("You lost the game");
    else{
    if(round==0)

    System.out.println("You won the game and Your score is:100");
     if(round==1)
    System.out.println("You won the game and Your score is:90");
     if(round==2)
    System.out.println("Your score is:80");
     if(round==3)
    System.out.println("You won the game and Your score is:70");
     if(round==4)
    System.out.println("You won the game and Your score is:60");
     if(round==5)
    System.out.println("You won the game and Your score is:50");
     if(round==6)
    System.out.println("You won the game and Your score is:40");
    if(round>=7)
    System.out.println("you won the game but your score is less than 35 \n try it more");
}

}
public static void main(String[] args) {
    int guess;
    System.out.println("you have 10 chances!");
    Random rand=new Random();
    int random=rand.nextInt(1,100);
    game(random);
    System.out.println(" if you want to stop then press no else\n enter number of round you want to play");
    Scanner sc=new Scanner(System.in);
   // int user=sc.nextInt();
    String us=sc.nextLine();
    String us1= us.toUpperCase();
    System.out.println(us1);
    int i;
    if(us1.equals("NO"))
    {
        System.out.println("thanks for playing");
    }
    else
    {
    int us2=Integer.parseInt(us1);
    for(i=0;i<us2;i++)
    game(random);
    System.out.println("Thanks for playing.");
    }
}
}
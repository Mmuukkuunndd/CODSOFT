import java.util.Scanner;

public class Studentgradecalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int subjects;
        float sum=0;
        System.out.println("How many number of subjects?");
        subjects=sc.nextInt();
        int marks[]=new int[subjects];
        for(int i=0;i<subjects;i++)
        {
            System.out.println("enter marks of subject"+(i+1)+":");
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<subjects;i++)
        {
            sum+=marks[i];
        }
        
   
        float percentage=(sum/subjects);
        
        if(percentage>90)
        System.out.println("Total marks:"+sum+"\tAverage percentage:"+percentage+"\tGrade is:"+"A1 grade");
        else if(percentage>80&&percentage<=90)
        System.out.println("Total marks:"+sum+"\tAverage percentage:"+percentage+"\tGrade is:"+"A2 grade");
        else if(percentage>70&&percentage<=80)
        System.out.println("Total marks:"+sum+"\tAverage percentage:"+percentage+"\tGrade is:"+"B1 grade");
        else if(percentage>60&&percentage<=70)
        System.out.println("Total marks:"+sum+"\tAverage percentage:"+percentage+"\tGrade is:"+"B2 grade");
        else if(percentage>50&&percentage<=60)
        System.out.println("Total marks:"+sum+"\tAverage percentage:"+percentage+"\tGrade is:"+"C1 grade");
        else if(percentage>40&&percentage<=50)
        System.out.println("Total marks:"+sum+"\tAverage percentage:"+percentage+"\tGrade is:"+"C2 grade");
        else if(percentage>=35&&percentage<=40)
        System.out.println("Total marks:"+sum+"\tAverage percentage:"+percentage+"\tGrade is:"+"D grade");
        else if(percentage>20&&percentage<35)
        System.out.println("Total marks:"+sum+"\tAverage percentage:"+percentage+"\tGrade is:"+"E grade and you are fail");
        else
        System.out.println("Total marks:"+sum+"\tAverage percentage:"+percentage+"\tGrade is:"+"E2 grade and you are fail");




    }
}

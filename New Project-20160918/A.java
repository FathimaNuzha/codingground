import java.io.*;
import java.util.*;
public class A{

     public static void main(String []args)
     {
        Scanner s=new Scanner("System.in");
        int num,rem,sum=0,temp;
        System.out.println("Enter a number");
     num=s.nextInt();
        temp=num;
        while(num!=0)
        {
        rem=num%10;
        sum=sum+(rem*rem*rem);
        num=num/10;
        }
      if(num==temp)
      {
      System.out.println(temp+ "is an armstrong number");
      }
      else
      {
      System.out.println(num+ "is not an armstrong number");
      }
     }
}    


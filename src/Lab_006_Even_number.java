import java.util.*;

public class Lab_006_Even_number
{
    public static void main(String[] args)
    {
     int i;
     System.out.println("Enter a number");
     Scanner S=new Scanner(System.in);
     i=S.nextInt();

     if(i%2==0)
         System.out.println("Even number");
     else
         System.out.println("odd number");

    }
}

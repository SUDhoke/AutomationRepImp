import java.util.*;
public class Lab_003_addition_Input {
    public static void main(String[] args) {
// declaration of variables
        //int is a datatye
        // a,b,c,d are variables
        int a,b;
        float c,d;

        Scanner sonali=new Scanner(System.in);
        System.out.println("Enter first value");
        a=sonali.nextInt();
        System.out.println("Enter Second value");
        b=sonali.nextInt();
        System.out.println("Enter third value");
        d=sonali.nextFloat();
        c=a+b+d;
        System.out.println("Addition of two integer  and a float numbers\n"+c);
    }
}

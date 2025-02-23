package Function_practice;

import java.util.Scanner;

public class practice_factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (fact) :");
        int num = sc.nextInt();

        int result_fact = fact(num);
        System.out.println("factorial of a number : "+result_fact);

    }

    static int fact(int n)
    {
        int fct = 1;
        for(int i=n; i>1; i--)
        {
            fct = fct * i;
        }
        return fct;
    }
}

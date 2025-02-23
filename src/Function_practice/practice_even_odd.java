package Function_practice;

import java.util.Scanner;

public class practice_even_odd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        int result =check_number_even_odd(num);
        System.out.println(result);

    }
    static int check_number_even_odd(int n1)
    {
        if(n1%2==0)
        {
            System.out.println("even :"+n1);
        }else
        {
            System.out.println("odd :"+n1);
        }
        return 0;
    }
}

package Function_practice;

import java.util.Scanner;

public class practice_with_param_without_RT
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();


        w_param_WHRT(a);
    }

    static void w_param_WHRT(int num)
    {
        System.out.println("number : " +num);
    }
}



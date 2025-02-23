package Function_practice;

import java.util.Scanner;

public class practice_max_of_two
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int n1 = sc.nextInt();

        System.out.println("Enter num2");
        int n2 = sc.nextInt();

        int max_two = max(n1,n2);
        System.out.println("max : "+max_two);

    }

    static int max (int num1, int num2)
    {
        if(num1 > num2)
        {
            return num1;
        }
        else {
            return num2;
        }

    }
}

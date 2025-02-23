package Function_practice;

import java.util.Scanner;

public class Count_vowels_in_a_String
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s_name = sc.nextLine().toLowerCase();

        int print_S = str(s_name);
        System.out.println(print_S);
        System.out.println(s_name.length());


    }
    //function for a count vowels in a string

    static int str(String name)
    {
        int v_count = 0;
        for(int i = 0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                v_count++;
            }
        }
        System.out.println("Count of vowels :" +v_count);
        return v_count;

    }
}



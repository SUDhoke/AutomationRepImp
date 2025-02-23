package Function_practice;

import java.util.Scanner;

public class practice_reverse_string
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine().toLowerCase();

        String print_reverse = s_reverse(str);
        System.out.println("reverse :"+print_reverse);

    }
        static String s_reverse(String str1)
        {
            String reverse = "";
            char ch ;
            for(int i =0; i<=str1.length()-1; i++) {
                ch = str1.charAt(i);
                reverse = ch + reverse;

            }
            if(reverse.equals(str1))
            {
                System.out.println("pal");
            }else
            {
                System.out.println("NP");
            }
            return reverse;
        }

}

package Function_practice;

import java.util.Scanner;

public class Practice_with_para_with_ReturnType
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter F_name");
        String f1 = sc.nextLine();

        System.out.println("Enter L_name");
        String l1 = sc.nextLine();

        String details = wpwrt(f1,l1);

        System.out.println("Details : " +f1 + "\t" +l1);
    }

    static String wpwrt(String F_name, String L_name)
    {
        return F_name;
    }
}


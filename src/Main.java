import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Reading string from console input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words separated by spaces:  ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();

        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);

        Scanner insert = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        String s = insert.nextLine();
        char ch = s.charAt(0);
        System.out.println("The Character entered is " + ch);
    }
}
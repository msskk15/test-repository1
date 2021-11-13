import java.util.Scanner;

import static java.lang.System.out;

public class LowerUpperCase {

    public static void main(String[] args) {


        char ch;
        Scanner scan = new Scanner(System.in);
        out.println("Enter a character");
        ch = scan.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case letter");
        }

    }


}

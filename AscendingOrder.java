import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number having 3 or more digits: ");
        int OrgNum = in.nextInt();

        for (int i = 0; i <= 9; i++) {
            int num = OrgNum;
            int c = 0;
            while (num != 0) {
                if (num % 10 == i)
                    c++;
                num /= 10;
            }
            for (int j = 1; j <= c; j++) {
                System.out.print(i + ", ");
            }
        }

        System.out.println();
    }
}
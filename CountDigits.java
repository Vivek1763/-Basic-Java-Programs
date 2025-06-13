import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int flag = 0;
        int original = num;

        if (num == 0) {
            flag = 1;
        } else {
            while (num != 0) {
                num = num/10;
                flag++;
            }
        }

        System.out.println("The number of digits in " + original+ " is: " + flag);
    }
}


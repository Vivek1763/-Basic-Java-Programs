import java.util.Scanner;

class SwitchExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the case number: ");
        int num=sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Good Morning");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjure");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}


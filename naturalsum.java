import java.util.Scanner;
class naturalsum{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");

        int n=input.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
         sum=sum+i;
         i++;
        }
        System.out.println("sum of 1st "+n+" natural no. is "+ sum);
    }
}


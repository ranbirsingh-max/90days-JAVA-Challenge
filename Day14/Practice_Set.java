import java.util.Scanner;

public class Day10_PracticeSet {
    public static void main(String[] args) {
        //Question 1
        for(int i = 4; i > 0; i--){
            System.out.println("*".repeat(i));
        }

         //question 2
        int i = 10;
        int sum = 0;
        for ( int n = 0; n < i ; n++){
            int element = 2* n;
            sum += element;
        }
        System.out.println(sum);
        int i = 0;
        int sum = 0;
         while (i < 10){
            int element = 2 * i ;
            sum += element;
             i++;
         }
        System.out.println(sum);
        //Question 3
        System.out.print("Enter the number: ");
        Scanner inp = new Scanner(System.in);
        int u1 = inp.nextInt();
        for(int i =1; i <= 10 ; i++){
            System.out.println(u1 + " X "+ i + " = "+ u1 * i);
       }
        //Question 4
        System.out.print("Enter the number: ");
        Scanner inp = new Scanner(System.in);
        int u1 = inp.nextInt();
        for(int i =10; i >= 1 ; i--){
            System.out.println(u1 + " X "+ i + " = "+ u1 * i);
        }
        //Question 5
        System.out.print("Enter the number: ");
        Scanner inp = new Scanner(System.in);
        int u1 = inp.nextInt();
        int factorial= 1;
        for(int i = u1 ; i > 0; i-- ){
            factorial  = factorial * i;
        }
        System.out.println("Factorial of the number " +  u1 + " is " + factorial);
        //question 6
        System.out.print("Enter the number: ");
        Scanner inp = new Scanner(System.in);
        int u1 = inp.nextInt();
        int orinial = u1;
        int factorial = 1;
        while (u1 > 0){
            factorial  = factorial * u1;
            u1--;
        }
        System.out.println("Factorial of the number " +  orinial + " is " + factorial);
    }

}

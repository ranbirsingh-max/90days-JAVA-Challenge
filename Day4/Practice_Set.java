import java.util.Scanner;

public class Day4_Practiceset_1 {
    public static void main(String[] args) {
        // Question 1
        int a = 10;
        int b = 10;
        int c = 10;
        int sum = a + b + c ;
        System.out.println(sum);
       // Question 2
        Scanner mar = new Scanner(System.in);
        float x = mar.nextFloat();
        float y = mar.nextFloat();
        float z = mar.nextFloat();
        float totalmarks = x + y + z ;
        float percentage =  (totalmarks / 300) * 100 ;
        System.out.println(percentage / 10);

       // Question3
        Scanner name = new Scanner(System.in);
        String str = name.next();
        System.out.println("Hello " + str + " have a good day");

         // Question4
        System.out.println("Enter the number of kilometers :");
        Scanner km = new Scanner(System.in);
        float data = km.nextFloat();
        float miles = data / 1.609344f ;
        System.out.println(miles);
        //question5
        System.out.println("Enter your input:");
        Scanner in = new Scanner(System.in);

        System.out.println(in.hasNextInt());


    }
}

import java.util.Scanner;

public class Day_7 {
    public static void main(String[] args) {
       float a = 7/4f * 9/2f ;
        System.out.println(a);



        //Encrypt
        char grade = 'B';
        grade =   (char)(grade + 8);
        System.out.println(grade);
        //Decrypt
        System.out.println((char)(grade - 8));

       

        int a = 100;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your input :");
        int b = in.nextInt();
        System.out.println(a > b);

    }
}

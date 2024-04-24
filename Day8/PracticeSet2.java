import java.util.Scanner;

public class Practiceset2_12 {
    1.public static void main(String[] args) {
        float a= 7/4f * 9/2f;
        System.out.println(a);
    
    2.public static void main(String[] args) {
        char grade = 'B';

        grade =  (char)(grade + 8);
        System.out.println(grade);
        grade= (char)(grade - 8);
        System.out.println(grade);
    }
    3.public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num1= number.nextInt();
        int num2=200;
        boolean result = num1 > num2;
        System.out.println(result);

    }
  4 public static void main(String[] args) {
        int v= 4;
        float u=2;
        float a= 1;
        float b = (v*v - u*u)/ (2*a*5);
        System.out.println(b);
    }
    }



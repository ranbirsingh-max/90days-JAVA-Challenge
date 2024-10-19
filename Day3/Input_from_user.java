import java.util.Scanner;

public class Day3_video5_and_6 {
 public static void main(String[] args) {
  System.out.println("Taking input from the user");
  Scanner inp = new Scanner(System.in);
  System.out.println("Enter the first number :");
  int a = inp.nextInt();
  System.out.println("Enter the second number :");
  int b = inp.nextInt();
  int sum = a + b;
  System.out.println("total sum is :" + sum);
  System.out.println("Enter your feedback too");
  String str = inp.next();
  System.out.println(str);
 }
}

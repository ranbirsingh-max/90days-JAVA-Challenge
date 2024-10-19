import java.util.Scanner;

public class Day3_video_6 {
    public static void main(String[] args) {
        System.out.println("Lets find the percentage of your marks");
        Scanner mar = new Scanner(System.in);
        System.out.println("Enter the max marks per subject:");
        int a = mar.nextInt();
        System.out.println("Enter your marks of five subjects :");
        float one = mar.nextFloat();
        float second = mar.nextFloat();
        float third = mar.nextFloat();
        float fourth = mar.nextFloat();
        float fifth = mar.nextFloat();
        float sum = one + second + third + fourth + fifth;
        System.out.println("Total marks of five subject are : " + sum);
        int totalmarks = a  * 5;
        System.out.println("So your percentage is " +  ((sum / totalmarks ) * 100)+"%");
    }

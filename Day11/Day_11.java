import java.util.Scanner;

public class Day_11_video_19 {
    public static void main(String[] args) {
        //Question 1
        int a = 10;
        if (a == 11){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        //Question 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of three subjects : ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        int sum =  math + science + english;
        int totalmarks = 300 ;
        double percentage =  (double)sum / totalmarks * 100;
        if (percentage >= 40 && math >=33 && science >=33 && english>=33){
            System.out.println("You are pass with total " + percentage+ "%");
        }else {
            System.out.println("Sorry you are failed");
        }

        // Question 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter number between 1 to 7 ");
        }


        //Question 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        


    }
}

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner marks=new Scanner(System.in);
        int total=500;
        System.out.println("Enter 1st subject  marks: ");
        int a = marks.nextInt();
        System.out.println("Enter 2nd subject  marks: ");
        int b = marks.nextInt();
        System.out.println("Enter 3rd subject marks: ");
        int c = marks.nextInt();
        System.out.println("Enter 4th subject marks: ");
        int d = marks.nextInt();
        System.out.println("Enter 5th subject  marks: ");
        int e = marks.nextInt();
        int sum= a+b+c+d+e;
        System.out.println(sum);
        System.out.println(total);
        System.out.println(((double) sum/total) * 100);
    }
}

import java.util.Scanner;

public class Video_5_Taking_Input_From_User {
    public static void main(String[] args) {
        System.out.println("Taking Input From The Users");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the Second number: ");
        float b = s.nextFloat();
        String str= s.next();
        String c = s.nextLine();
        float sum = a + b ;
        System.out.println(sum);
    }
}

import java.util.Scanner;

public class Video_18 {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are adult");
        } else if (age>50) {
            System.out.println("You are old: ");

        }
        else{
            System.out.println("You are baby: ");
        }


        int var = 6;
        switch (var) {
            case 1:
                System.out.println("False");
                break;
            case 6:
                System.out.println("True");
                break;
            default:
                System.out.println("Enjoy your life");
        }
    }
}

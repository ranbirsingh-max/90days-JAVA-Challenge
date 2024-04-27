import java.util.Scanner;

public class Video_16_if_else {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner age=new Scanner(System.in);
        int age1= age.nextInt();
        if(age1>18){
            System.out.println("You are able to fill driving license");
        }
        else {
            System.out.println("Sorry you are not eligible");
        }
    }
}

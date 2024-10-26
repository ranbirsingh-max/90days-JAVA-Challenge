import java.util.Scanner;

public class Day_9_Practiceset_3 {
    public static void main(String[] args) {
        //Problem_1
        String str = "RANBIR";
        String n = str.toLowerCase();
        System.out.println(n);

        //Problem_2
        String str1 ="Ranbir Singh Charak";
        String n1 = str1.replace(' ','_');
        System.out.println(n1);

        //Problem_3
        Scanner n3 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str2 = n3.nextLine();
        System.out.println("Dear " +str2+ " ,Thanks a lot :");

        //Problem_4
        String n4 = "My name  is    ranbir   singh";
        int str3 = n4.indexOf("  ");
        int str4 = n4.indexOf("   ");
        System.out.println(str3 );
        System.out.println(str4);

        //Problem_5

        System.out.println("Dear Ranbir, \nThis Java Course is nice. \nThanks");
    }
}

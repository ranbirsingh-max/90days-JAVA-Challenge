import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class PracticeTest_3 {
    public static void main(String[] args) {
        //Problem1

        Scanner n= new Scanner(System.in);
        String a= n.nextLine();
        a = a.toLowerCase();
        System.out.println(a);

        //Problem2
        String b="Ranbir  singh  charak";
        b = b.replace(' ','_');
        System.out.println(b);

        //Problem3
       String letter="Dear <|name|>, Thanks a lot!";
        letter=letter.replace("<|name|>","Ranbir");
        System.out.println(letter);

        //Problem4
        String detect="Detect double  and triplespace   ";
        System.out.println(detect.indexOf("  "));
        System.out.println(detect.indexOf("   "));
        System.out.println(detect.indexOf('d'));

        //Problem5
        String format="Dear Ranbir, This java course is nice thanks";
        format="Dear Ranbir \n\tThis java course is nice.\n\t\tThanks!";
        System.out.println(format);



    }
}

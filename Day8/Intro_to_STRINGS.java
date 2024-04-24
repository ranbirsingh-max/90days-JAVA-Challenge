import java.util.Scanner;

public class Ch3_Strings {
    public static void main(String[] args) {
        String str=new String("Ranbir");
        System.out.println(str);
        String a="ranbir";
        System.out.println(a);
        int num= 5;
        float num2=5.55f;
        System.out.printf("%d and %f",num,num2);
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String st=sc.nextLine();
        System.out.println(s);
        System.out.println(st);

    }
}

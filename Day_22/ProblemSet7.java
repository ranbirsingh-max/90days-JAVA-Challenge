import java.util.Scanner;

public class Day_22PracticeSet {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        int n = number1.nextInt();
       // System.out.println("Multiple table of number is " + multipleNumber(n));
       // star(n);
       reverseStar(n);
    }
    //Problem 1
    static int multipleNumber(int n) {
        int m1=1;
        for (int i = 1; i <= 10; i++) {
            m1=((n*i));
            System.out.println(n + " X "+ i+" = "+ (n*i));
        }
        return m1;
    }
    //Problem 2
    static void star(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    //Problem 3
    static  void reverseStar(int c){
        for(int i=1;i<=c;i++){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

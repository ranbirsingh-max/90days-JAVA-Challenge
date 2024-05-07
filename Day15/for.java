import java.util.Scanner;

public class video23 {
    public static void main(String[] args) {
       for (int i = 0; i<=10; i++){
            System.out.println(i);
        }
       // Print odd numbers
        int n = 10;
        for (int i =0; i<n; i++){
            System.out.println(2*i+1);
        }
        //Decremental for loop
        for(int i= 10; i !=0; i--){
        System.out.println(i);
    }
        //print natural number in reverse order
        Scanner nu = new Scanner(System.in);
        System.out.println("Enter the length of natural numbers:");
        int x= nu.nextInt();
        for( int i= x; i>0; i--)
            System.out.println(i);

    }}

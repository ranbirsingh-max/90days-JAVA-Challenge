import java.util.Scanner;

public class Practice_set4 {
    public static void main(String[] args) {
        //Question1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First subject marks: ");
        int num1= sc.nextInt();
        System.out.println("Enter your second subject marks: ");
        int num2=sc.nextInt();
        System.out.println("Enter your third subject marks: ");
        int num3= sc.nextInt();
        float sum= (num1+num2+num3)/300.0f * 100;
        System.out.println(sum);
        if(sum>40 && num1>=33 && num2>=33 && num3>=33){
            System.out.println("Pass");
        }else {
            System.out.println("Sorry you are fail");
        }

        //Question 2
        Scanner scc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int day = scc.nextInt();
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
                System.out.println("Wrong input");
        }

        //Problem3
        Scanner or=new Scanner(System.in);
        String ne=or.next();
        if(ne.endsWith(".org")){
            System.out.println("organisational website");
        } else if (ne.endsWith(".com")) {
            System.out.println("commercial website");
        }else {
            System.out.println("indian website");
        }
        //Problem4
        Scanner year1=new Scanner(System.in);
        System.out.println("Enter the year :");
        int year = year1.nextInt();
        if(year%100==0 && year%400==0 || year%100!=0 && year%4==0){
            System.out.println("Its leap year ");
        }else{
            System.out.println("Not a leap year");
        }

    }
}

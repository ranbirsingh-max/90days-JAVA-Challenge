import java.util.Scanner;

public class Day_12_rock_paper_scissor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your move number :");
        int move = in.nextInt();
        switch (move){
            case 1:
                System.out.println("You choose rock :");
                break;
            case 2:
                System.out.println("You choose Paper :");
                break;
            case 3:
                System.out.println("You choose Scissor :");
                break;
            default:
                System.out.println("Re-enter your move number ");
        }
        int randomNumber =  (int)(Math.random() * 3) + 1;
        switch (randomNumber){
            case 1:
                System.out.println("computer choose rock :");
                break;
            case 2:
                System.out.println("computer  choose Paper :");
                break;
            case 3:
                System.out.println("computer  choose Scissor :");
                break;

        }
        if (move == 1 && randomNumber == 2 || move == 3 && randomNumber == 1 || move == 2 && randomNumber == 3){
            System.out.println("You loose from computer !");
        } else if (move == 1 && randomNumber == 3 || move == 2 && randomNumber == 1 || move == 3 && randomNumber == 2) {
            System.out.println("You Won from computer !");
        } else if (move == randomNumber) {
            System.out.println("Tie");
        }

    }
}

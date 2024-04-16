public class Test {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner numb= new Scanner(System.in);

        boolean b = numb.hasNextInt();
        System.out.println(b);

    }
}

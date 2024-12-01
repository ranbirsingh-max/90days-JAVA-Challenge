public class Day_19_MethodsInJava {
    public static void main(String[] args) {
        name();

        name(20);

        name("Master");
        jokes();
    }
    static void name(){
        System.out.println("Hye Ranbir");
    }
    static void name(int a){
        System.out.println("Good Morning " + a + " times");
    }
    static void name(String arr){
        System.out.println("Good Morning " + arr + " Ranbir");
    }
    static void jokes(){
        System.out.println("HYY My Lady");
    }
}

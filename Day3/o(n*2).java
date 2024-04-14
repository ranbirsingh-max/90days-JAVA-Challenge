public class Main {
    public static void items(int n ) {
        for(int i=0; i<n; i++){
            for(int k=0; k<n; k++){
                System.out.println(i+" "+k);
            }
        }
    }

    public static void main(String[] args) {
        items(10);
    }

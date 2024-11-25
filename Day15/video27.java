public class Day_15_video27 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        //System.out.println(array1.length);
        System.out.println("Print array using for loop");
        for(int i=0; i<array1.length ; i++){
            System.out.println(array1[i]);
        }
        //  Reverse of An Array
        for(int i=array1.length - 1; i >=0 ; i--){
            System.out.println(array1[i]);
        }
        //Print array using for each loop
        for(int i:array1){
            System.out.println(i);
        }

    }
}

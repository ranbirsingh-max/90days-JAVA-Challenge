import java.util.Arrays;

public class Day_18 {
    public static void main(String[] args) {
       int[] array2 = {13, 2, 3, 4, 57};
       System.out.println(find_max(array2));
   }

       public static int find_max(int[] array2) {
           int max = 0;
           for (int element : array2) {
               if (element > max) {
                   max = element;
               } else {

                   max = max;
               }
           }
           return max;
       int index=array2[0];
       for(int e:array2){
           if(index < e){
               index=index;
           }else{
               index=e;
           }
       }
       System.out.println(index);
        int[] array3 = {1, 2, 3, 4, 57};
        boolean sorted= true;
       for(int i=0;i<array3.length-1;i++){
           if(array3[i]>array3[i+1]){
               sorted=false;
               break;
           }
       }
        System.out.println(sorted);
        }

    }

import java.util.ArrayList;
import java.util.Arrays;

public class Day_17_PracticeSet_6 {
    public static void main(String[] args) {
        //Problem Statement_1
       float[] array1={1f,2f,3f,4f,5.5f};
       float sum=0;
       for(float i : array1){
           sum = sum+ i;
       }
       System.out.println(sum);
      //Problem Statement_2
       int [] array2={1,2,3,4,5};
       int number=5;
       ArrayList<Integer> numbers = new ArrayList<>();
       for(int i:array2){
           numbers.add(i);
       }

       if(numbers.contains(number)){
           System.out.println("The number is present in array");
       }else{
           System.out.println("The number is not present in array");
       }
        //Problem Statement_3
       int sum =0;
       int[] marks={90,80,70,50,40};
       for(int element: marks){
           sum = sum+element;
       }
       int average = sum/marks.length;
       System.out.println("The total average of your marks is "+ average);

        //Problem Statement_4
        int [][] marks ={{1,2,3},
                          {4,5,6}};
        int [][] marks2 ={{7,8,9},
                          {4,5,6}};
        int [] [] result = {{0,0,0},
                           {0,0,0}};
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                result[i][j] = marks[i][j] + marks2[i][j];
            }
        }
        for(int[] element: result){
            System.out.println(Arrays.toString(element));
        }


    }
}

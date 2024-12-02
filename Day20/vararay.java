public class Day_20 {
    static int total_sum(int ...arr){
        int sum=0;
        for(int e:arr){
            sum +=e;
        }
        return sum;

    }
    //One variable is compulsory
    static int total_sum1(int a ,int ...arr1){
        int sum1=a;
        for(int e:arr1){
            sum1 +=e;
        }
        return sum1;

    }
    public static void main(String[] args) {
        System.out.println(total_sum(10,20));
        System.out.println(total_sum1(10,20));
    }
}

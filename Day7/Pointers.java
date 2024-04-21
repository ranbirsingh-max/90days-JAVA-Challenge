import java.util.HashMap;

public class pointers {
    public static void main(String[] args) {
       /*  when You Not Use Pointers
        int num1=22;
        int num2=num1;
        num1=33;
        System.out.println(num1);
        System.out.println(num2);*/
        //When You Use Pointers
        HashMap<String,Integer> map1 =new HashMap<>();
        HashMap<String,Integer> map2 =new HashMap<>();
        map1.put("val",11);
        map2=map1;
        System.out.println(map1);
        System.out.println(map2);
    }

}

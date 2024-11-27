public class Day_16_M_D {
    public static void main(String[] args) {
        int [][] flatrooms= new int[2][3];
        flatrooms[0][0]=101;
        flatrooms[0][1]=102;
        flatrooms[0][2]=103;
        flatrooms[1][0]=201;
        flatrooms[1][1]=202;
        flatrooms[1][2]=303;
        for (int[] flatroom : flatrooms) {
            for (int i : flatroom) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}

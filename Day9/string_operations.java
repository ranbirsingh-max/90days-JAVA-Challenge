public class Day_9_string_methods {
    public static void main(String[] args) {
        String name = "Ranbir";

        int value = name.length();
        System.out.println(value);

        String tlc = name.toLowerCase();
        System.out.println(tlc);

        String tuc = name.toUpperCase();
        System.out.println(tuc);

        String trimm = "    ranbir    ";
        String trimmed = trimm.trim();
        System.out.println(trimmed);

        System.out.println(name.substring(0,2));

        String re = name.replace('r','t');
        System.out.println(re);

        Boolean r = name.startsWith("Ra");
        System.out.println(r);

        System.out.println(name.charAt(2));

        int ind = name.indexOf('b');
        System.out.println(ind);

        int sn = name.indexOf('r',2);
        System.out.println(sn);

        System.out.println(name.lastIndexOf('r'));
        System.out.println(name.lastIndexOf('R',3));

        System.out.println("Hye my name is ranbir \'");
        System.out.println("Hye my name is ranbir \"");
        System.out.println("Hye my \n name is ranbir \t");



    }
}

public class Video_14Strings_Methods_ {
    public static void main(String[] args) {
        String name = "Ranbir";
        int ln = name.length();
        System.out.println(ln);
        System.out.println(name.trim());
        System.out.println(name.toLowerCase());
        String tlc= name.toLowerCase();
        System.out.println(tlc);
        String upc= name.toUpperCase();
        System.out.println(upc);
        System.out.println(name.length());
        String c1=name.replace('r','9');
        System.out.println(c1);
        System.out.println(name.replace("r", "bir"));
        System.out.println(name.startsWith("Ran"));
        System.out.println(name.endsWith("ir"));
        System.out.println(name.substring(1));
        String  c =name.substring(2);
        System.out.println(c);
        System.out.println(name.substring(1,6));
        String name="Rannbir is the best ";
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("t"));
        System.out.println(name.indexOf("n",2));
        System.out.println(name.lastIndexOf("n"));


    }
}

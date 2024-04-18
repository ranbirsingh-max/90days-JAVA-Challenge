import org.w3c.dom.ls.LSOutput;

public class classes {
    private String color;
    public classes(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class main_classes {
    public static void main(String[] args) {
        classes setcolor = new classes("blue");
        classes setcolor2 = new classes("green");

        System.out.println(setcolor.getColor());
        System.out.println(setcolor2.getColor());

    }

}

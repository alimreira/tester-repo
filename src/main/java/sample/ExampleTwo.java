package sample;

public class ExampleTwo {
    private int number;
    private String location;

    public ExampleTwo(){
        number = 36;
        location = "field";
        System.out.println("There are " + number + " children playing on the " + location);
    }

    public static void main(String[] args) {
        ExampleTwo obj = new ExampleTwo();
    }
}

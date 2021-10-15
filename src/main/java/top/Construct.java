package top;

public class Construct {
    private String name;



    public static void main(String[] args) {
        Construct obj = new Construct("Faith");

    }

    public Construct(String name) {
        this.name = name;
        System.out.println("Her name is "+ name);
    }
}

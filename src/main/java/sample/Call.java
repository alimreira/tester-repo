package sample;

public class Call {
    private int cost;
    private String item;

    public Call(int cost, String item) {
        this.cost = cost;
        this.item = item;
    }

    public static void main(String[] args) {
        Call obj = new Call(1234, "grains");

    }
}

package sample;

public class Examples {
    private int stock;
    private String commodity;

    Examples(int stock, String commodity){
        this.stock = stock;
        this.commodity = commodity;
        System.out.println("The "+ commodity + " cost " + stock);
    }

    public static void main(String[] args) {
        Examples obj = new Examples(3000,"oil");

    }
}

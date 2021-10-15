package middle;

public class Class {
    String entity = "bicycle";
    int cost = 3000;

    public String behaviour(String feature){
        return feature;
    }

    public static int price(int number, int cost){
        int hold = (number * cost);
        return hold;
    }

    public float measure(int size, float width){
        float hold = (size * width);
        return hold;
    }

    public static void main(String[] args) {
        Class sportBicycle = new Class();
        String hold = sportBicycle.behaviour("Ease of transportation");
        System.out.println(hold);

        int held = price(10, 2300);
        System.out.println(held);

        float holder = sportBicycle.measure(12, 23.5f);
        System.out.println(holder);
    }

}

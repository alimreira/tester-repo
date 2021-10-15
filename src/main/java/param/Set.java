package param;

public class Set {

    private int price;
    private String goods;

    public Set(int price, String goods) {
        this.price = price;
        this.goods = goods;
        System.out.println(price);
        System.out.println(goods);
    }

    public static void main(String[] args) {
        Set obj = new Set(100, "card");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }
}

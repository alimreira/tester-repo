package below;

public class DeFault {
    private int cost;
    private String goods;

    public DeFault(){
    }

    public DeFault(int cost, String goods) {
        this.cost = cost;
        this.goods = goods;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public static void main(String[] args) {
        DeFault obj = new DeFault();
        DeFault obj2 = new DeFault(300, "Cloth");

        System.out.println(obj.getCost());
        System.out.println(obj2.getGoods());
    }
}

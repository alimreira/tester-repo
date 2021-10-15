package top;

public class MethodOne {

    public int add(int one, int two){
        return (one + two);
    }

    public int add(int one, int two, int three){
        return (one + two +three);
    }



    public static void main(String[] args) {
        MethodOne obj = new MethodOne();
        int hold = obj.add(25 , 15);
        int hold1 = obj.add(25 , 15, 40);
        System.out.println(hold);
        System.out.println(hold1);
    }
}

package param;

public class That {
     int age;

    public That(int age) {
       this.age = age;
        //System.out.println(this);
    }

    public static void main(String[] args) {
        That obj = new That(17);
        //System.out.println(obj);
        System.out.println(obj.age);
    }
}

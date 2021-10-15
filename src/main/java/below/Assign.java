package below;

public class Assign{
    int a = 12;
    int g = 5;

    public static void main(String[] args) {
        Assign obj  = new Assign();
        obj.a += 5;
        System.out.println(obj.a);

        int b = 20;
        b+= 13;
        System.out.println(b);

        int c = 45;
        c-= 20;
        System.out.println(c);

        int d = 23;
        d*= 3;
        System.out.println(d);

        int e = 45;
        e/= 5;
        System.out.println(e);

        int f = 30;
        f %= 4;
        System.out.println(f);
    }

}

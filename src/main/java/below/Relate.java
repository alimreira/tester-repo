package below;

public class Relate {
    int age = 15;
    int AGE = 17;

    public static void main(String[] args) {
        Relate obj = new Relate();
        boolean hold = obj.age < obj.AGE;
        System.out.println(hold);

        int age= 10;
        int AGE  = 12;
        int ages = 28;
        boolean HOLD = (age == AGE);
        System.out.println(HOLD);
        boolean HOLD1 = (10 != 12);
        System.out.println(HOLD1);
        boolean HOLD2 = 10 > 12;
        System.out.println(HOLD2);
        boolean HOLD3 = 10 >= 12;
        System.out.println(HOLD3);
        boolean HOLD4 = 10 <= 12;
        System.out.println(HOLD4);

        boolean held = (age > AGE) || (ages < AGE);
        System.out.println(held);
        boolean held1 = (age < AGE) && (ages < AGE);
        System.out.println(held1);
        boolean held2 = (!(AGE> ages));
        System.out.println(held2);

        int holder = ++age;
        int holder2 = --age;
        System.out.println(holder);
        System.out.println(holder2);










    }
}

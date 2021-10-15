package middle;

public class Iterate {
    int hold = 12;

    public static void main(String[] args) {
        for(int i= 4; i<12; ++i){
            if(i>6 && i<9){
                continue;
            }
            System.out.println(i);
        }
    }
}

package below;

public class Control {
    int scores = 60;
    int arr[] = {20,30,40,50};

    public static void main(String[] args) {
        Control obj = new Control();
        if(obj.scores == 90){
            System.out.println("Excellent");
        }else if (obj.scores < 50){
            System.out.println("Fail");
        }else if(obj.scores == 70){
            System.out.println("Good");
        }else{
            System.out.println("Pass");
        }


        for(int i = 45; i<=obj.scores; ++i ){
            System.out.println(i);
        }

        for(int arr: obj.arr){
            System.out.println(arr);
        }

        for(int i = 0; i<obj.arr.length; ++i){
            System.out.println(obj.arr[i]);
        }
    }


}

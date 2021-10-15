package param;

public class ParamConstruct {
    private String course;
    private int score;

    public static void main(String[] args) {
         ParamConstruct obj = new ParamConstruct("Politics");
         ParamConstruct obj1 = new ParamConstruct("Religion");
         ParamConstruct obj2 = new ParamConstruct("Economy");

    }

    public ParamConstruct(String course) {
        this.course = course;
        System.out.println("He studies " + course);
    }
}

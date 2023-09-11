import java.util.List;

public class Application {
    /**
     * This main method is for manually testing your code.
     * No changes made here will affect the test results.
     * @param args
     */
    public static void main(String[] args) {
        Lab lab = new Lab();
        System.out.println("result when deserializing [2, 3, 5, 7]");
        List<Integer> list = lab.deserialize("[2, 3, 5, 7]");
        System.out.println(list);
        System.out.println("result when deserializing [2, 3, 5, 7]");
        list = lab.deserialize("[]");
        System.out.println(list);
    }
}

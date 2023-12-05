import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        SetDiTest set = new SetDiTest();
        HashSet<String> list = set.getSet();
        String obj = "Cookies";
        set.removeElementFromSet(list, obj);
        System.out.println(list);
        list.clear();
        System.out.println("The array is empty? " + list.isEmpty());
        System.out.println("Array: " + list);
    }
}

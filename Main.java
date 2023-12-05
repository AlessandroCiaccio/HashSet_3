import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SetDiTest set = new SetDiTest();
        HashSet<String> list = set.getSet();
        String obj = "Cookies";
        removeElementFromSet(list, obj);
        System.out.println(list);
        list.clear();
        System.out.println("The array is empty? " + list.isEmpty());
        System.out.println("Array: " + list);
    }

    public static void removeElementFromSet(HashSet<String> list, String obj) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (obj.equals(iterator.next())) {
                iterator.remove();
            }

        }
    }

}

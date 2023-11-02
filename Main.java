import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> list = filled();
        String obj = "Cookies";
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (obj.equals(iterator.next())) {
                iterator.remove();
            }

        }
        System.out.println(list);
        list.clear();
        System.out.println("The array is empty? " + list.isEmpty());
        System.out.println("Array: " + list);
    }

    public static HashSet<String> filled() {
        HashSet<String> array = new HashSet<String>();
        array.add("Milk");
        array.add("Bread");
        array.add("Cookies");
        return array;
    }
}

import java.util.HashSet;
import java.util.Iterator;

public class SetDiTest {
    private HashSet<String> set;

    public SetDiTest() {
        this.set = filled();
    }

    public void removeElementFromSet(HashSet<String> list, String obj) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (obj.equals(iterator.next())) {
                iterator.remove();
            }

        }
    }

    private HashSet<String> filled() {
        HashSet<String> array = new HashSet<String>();
        array.add("Milk");
        array.add("Bread");
        array.add("Cookies");
        return array;
    }

    public HashSet<String> getSet() {
        return set;
    }
}

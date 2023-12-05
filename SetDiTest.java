import java.util.HashSet;

public class SetDiTest {
    private HashSet<String> set;

    public SetDiTest() {
        this.set = filled();
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

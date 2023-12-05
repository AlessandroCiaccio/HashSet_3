import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MainTest {
    @Test
    public void testIfGiveMeASetDoesNotReturnEmptySet()
    {
        SetDiTest set = new SetDiTest();
        HashSet<String> list = set.getSet();
        assertFalse(list.isEmpty());
    }

    @Test
    public void testIfElementGetsRemoved()
    {
        SetDiTest list = new SetDiTest();
        HashSet<String> set = list.getSet();
        HashSet<String> setCopied = set;
        String elementToBeRemoved = "test";
        set.add(elementToBeRemoved);
        Main.removeElementFromSet(set, elementToBeRemoved);
        assertEquals(setCopied,set);
    }
}
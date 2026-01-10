import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DynamicStringListTests {
    @Test

    public void getTest(){
        // returns the string at a specific index
        DynamicStringList list = new DynamicStringList();

        String result = list.get(4);

        assertEquals("dog", result);
    }

    @Test
    public void setTest(){
        // replaces a string at a specific index
        DynamicStringList list = new DynamicStringList();

        list.set(3, "house");
        String result = list.get(3);

        assertEquals("house", result);
    }
}

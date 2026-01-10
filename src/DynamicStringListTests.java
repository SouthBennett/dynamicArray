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

    @Test
    public void addTest() {
        // add a string to the end of an array
        DynamicStringList list = new DynamicStringList();

        list.add("Bruhhh");

        assertEquals("Bruhhh", list.get(6));
    }

    @Test
    public void removeTest() {
        // remove a string at the specified index from the list.
        DynamicStringList list = new DynamicStringList();

        String removed = list.remove(0);

        assertEquals("hello", removed);
    }
}

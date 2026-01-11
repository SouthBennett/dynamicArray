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
    public void removeShiftAndShrinkTest() {
        // remove a string at the specified index from the list, shrink the size and shift remaining elements to the left.
        DynamicStringList list = new DynamicStringList();

        String removed = list.remove(0);

        assertEquals("hello", removed);
        assertEquals(5, list.size());
        assertEquals("goodbye", list.get(0));
        assertEquals("world", list.get(1));
        assertEquals("car", list.get(2));
        assertEquals("dog", list.get(3));
        assertEquals("cat", list.get(4));
    }

    @Test
    public void testSize() {
        // return the number of strings currently in the list
        DynamicStringList list = new DynamicStringList();

        int result = list.size();

        assertEquals(6, result);
    }

    @Test
    public void testSizeAfterAdd() {
        // return the size after a string has been added
        DynamicStringList list = new DynamicStringList();

        list.add("Duuuuuude");

        int result = list.size();

        assertEquals(7, result);

    }

    @Test
    public void testCapacity() {
        // Return the capacity or the length of the array
        DynamicStringList list = new DynamicStringList();

        int result = list.capacity();

        assertEquals(6, result);
    }


    @Test
    public void testCapacityAfterAdd (){
        //returns capacity of array after it has been doubled
        DynamicStringList list = new DynamicStringList();

        list.add("MORE!!!");

        int result = list.capacity();

        assertEquals(12, result);
    }
}

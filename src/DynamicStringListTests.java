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
}

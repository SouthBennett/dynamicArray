public class DynamicStringList implements StringList{

    @Override
    public String get(int index) {
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    @Override
    public void set(int index, String value) {
        
        throw new IndexOutOfBoundsException("Index out of bounds");
        
    }

    @Override
    public void add(String value) {
       
      
    }

    @Override
    public String remove(int index) {
        
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    @Override
    public int size() {
        return 0;
    
    }

    @Override
    public int capacity() {
        return 0;
       
    }
    
}
  

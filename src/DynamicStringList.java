public class DynamicStringList implements StringList{
    private  String[] words = {"hello", "goodbye", "world", "car", "dog", "cat"};

    @Override
    public String get(int index) {
        String word = words[index];
        if(words[index] != null){
            return word;
        }else{
        throw new IndexOutOfBoundsException("Index out of bounds");
        }
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
  

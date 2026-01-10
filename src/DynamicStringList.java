public class DynamicStringList implements StringList{
    
    private String[] words = {"hello", "goodbye", "world", "car", "dog", "cat"};
    int index;
    String value;
    int size = 6;



    public void main(int index, String value){
    index = 3;
    value = "house";
    }
    
  


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
        words[index] = value;
        if(index > words.length){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        
    }

    @Override
    public void add(String value) {
      //check if there's room in array
      if (size == words.length) {
        //create a new array twice the size
        String[] newWords = new String[words.length * 2];
        //loop through array
        for (int i = 0; i < words.length; i++) {
            //copy words from old array to new array
            newWords[i] = words[i];
        }
        //words points to newWords array now
        words = newWords;
      }
      //add the word to the end of the array
      words[size] = value;
      //increment 
      size++;
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
  

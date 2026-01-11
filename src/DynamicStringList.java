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
    // return a string at a specific index
    public String get(int index) {
        String word = words[index];
        if(words[index] != null){
            return word;
        }else{
        throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    @Override
    // Replaces a string at a specific index 
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
        //edge case
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        //Variable to hold the removed word
        String removedWord = words[index];
        //loop through the array - 1
        for (int i = index; i < size - 1; i++) {
            //shift elements from right to left 
            words[i] = words[i + 1];
        }
        //clear the last slot of the array
        words[size- 1] = null;
        //shrink the array size by 1
        size--;
        // return the string that was removed
        return removedWord;
    }

    @Override
    // returns the number of strings currently in the list
    public int size() {
        return size;
    
    }

    @Override
    //returns the capacity( length of the array. Not the items in it)
    public int capacity() {
        int capacity = words.length;
        return capacity;
       
    }

    
}
  

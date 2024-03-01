public class IntArray {
    private int[] array;
    private int size;
    private int index;
//  Constructor definition
    public IntArray(int size){
        this.size = size;
        this.index = 0;
        this.array = new int[size];
    }
//  Method for adding an item
    public boolean add(int item){
        if(index <= size-1){
            this.array[index] = item;
            this.index++;
            return true;
        }
        return false;
    }
//  Validate index method
    private boolean isIndexValid(int index){
//      Check if value of index is between 0 and size)
        if(index >= 0 && index <= this.size - 1){
            return true;
        }
        return false;
    }
//  Method for retrieving an item
    public int get(int index){
        if(isIndexValid(index)){
            return this.array[index];
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
//  Method for removing an item at a specified index
    public void removeIndex(int index){
        if(isIndexValid(index)){
            this.array[index] = 0;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
//  Overloaded Method for finding an item and returning its index, and returning -1 if not found
    public int find(int item){
        return find(item, 0);
    }
//  Method for finding at item starting from a specified index value
    public int find(int item, int startIndex){
        if(isIndexValid(startIndex)){
            for(int index = startIndex; index <= size -1; index++){
                if(this.array[index] == item){
                    return index;
                }
            }
        }
        return -1;
    }
//  Method for finding multiple occurrence of an item and returns an array
//  of indexes at which the item was found, returns [-1] if not found.
//  This function uses the find() method and builds a csv string of indexes at
//  which the item was found. The csv string is then converted to an integer array
//  using csvToArray() method.
    public int[] findMultiple(int item){
        String indexString = "";
        int startIndex = 0;
        int index = find(item,startIndex);
        if(index == -1) {
            System.out.println("Item not found, returning [-1]");
            return new int[]{-1};
        }
        indexString += index;
        while(index != -1){
            System.out.println("Found at index: "+index);
            startIndex = index + 1;
            index = find(item,startIndex);
            if(index != -1) {
                indexString += "," + index;
            }
        }
        return csvToArray(indexString);
    }
//  This is a supporting method for find multiple, its just prepares the return value
    private int[] csvToArray(String csv){
        String[] stringElements = csv.split(",");
        int[] intElements = new int[stringElements.length];
        for(int i = 0; i < intElements.length; i++){
            intElements[i] = Integer.parseInt(stringElements[i]);
        }
        return intElements;
    }
}

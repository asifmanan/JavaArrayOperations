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
    private boolean indexIsValid(int index){
//      Check if value of index is between 0 and size)
        if(index >= 0 && index <= this.size - 1){
            return true;
        }
        return false;
    }
//  Method for retrieving an item
    public int get(int index){
        if(indexIsValid(index)){
            return this.array[index];
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
//  Method for removing an item at a specified index
    public void removeIndex(int index){
        if(indexIsValid(index)){
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
        if(indexIsValid(startIndex)){
            for(int index = startIndex; index <= size -1; index++){
                if(this.array[index] == item){
                    return index;
                }
            }
        }
        return -1;
    }
}

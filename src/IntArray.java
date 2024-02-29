public class IntArray {
    private int[] array;
    private int size;
    private int index;

    public IntArray(int size){
        this.size = size;
        this.index = 0;
        this.array = new int[size];
    }

    public boolean add(int item){
        if(index <= size-1){
            this.array[index] = item;
            this.index++;
            return true;
        }
        return false;

    }
    public int get(int index){
        if(index >= 0 && index <= this.size - 1){
            return this.array[index];
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    public void removeIndex(int index){
        if(index >= 0 && index <= this.size - 1){
            this.array[index] = 0;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    public int find(int item){
        for(int index = 0; index <= size - 1; index++){
            if(this.array[index] == item){
                return index;
            }
        }
        return -1;
    }
}

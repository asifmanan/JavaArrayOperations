import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        System.out.println("*".repeat(8)+" Add Method Test "+"*".repeat(8));
        addMethodTest();
        System.out.println("#".repeat(4));

        System.out.println("*".repeat(8)+" Remove Method Test "+"*".repeat(8));
        removeMethodTest();
        System.out.println("#".repeat(4));

        System.out.println("*".repeat(8)+" Find Method Test "+"*".repeat(8));
        findMethodTest();
        System.out.println("#".repeat(4));

        System.out.println("*".repeat(8)+" FindMultiple Test "+"*".repeat(8));
        findMultipleTest();
        System.out.println("#".repeat(4));
    }

    public static void addMethodTest(){
        IntArray arr = new IntArray(2);
        arr.add(1);
        arr.add(2);
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
    }

    public static void removeMethodTest(){
        IntArray arr = new IntArray(5);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr.get(1));
        arr.removeIndex(1);
        System.out.println(arr.get(1));
    }
    public static void findMethodTest(){
        IntArray arr = new IntArray(3);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        System.out.println("Item at index(2): " + arr.get(2));
        System.out.println("Found at index: " + arr.find(2));
        System.out.println("Found at index (From startIndex 1): " + arr.find(0,1));
    }
    public static void findMultipleTest(){
        IntArray arr = new IntArray(5);
        arr.add(3);
        arr.add(1);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        int[] result = arr.findMultiple(3);
        System.out.println(Arrays.toString(result));
        result = arr.findMultiple(1);
        System.out.println(Arrays.toString(result));
        result = arr.findMultiple(2);
        System.out.println(Arrays.toString(result));
    }


}

public class Runner {
    public static void main(String[] args) {
        findMethodTest();
    }

    public static void addMethodTest(){
        IntArray arr = new IntArray(2);
//        arr.add(1);
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
    }


}

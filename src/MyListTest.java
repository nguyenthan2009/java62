public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> myList = new MyList<Integer>();
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        System.out.print(myList.get(0));
        System.out.print(myList.get(1));
        System.out.print(myList.get(2));
        System.out.print(myList.get(3));
        System.out.println("\n");
        myList.remove(2);
        System.out.println("Value index 2: " + myList.get(2));
        System.out.println("Value index 1: "+ myList.get(1));
        System.out.println(myList.contains(1));

    }
}

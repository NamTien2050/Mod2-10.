package aclasslist;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println("element 4: " + myList.get(3));
        System.out.println("element 1: " + myList.get(0));
        System.out.println("element 2: " + myList.get(1));
        System.out.println("element 3: " + myList.get(2));
//        myList.get(6);
//        System.out.println("element -1: "+myList.get(6));
        myList.get(-1);
        System.out.println("element -1: "+myList.get(-1));
    }
}

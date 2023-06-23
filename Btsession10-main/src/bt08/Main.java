package bt08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(2);

        System.out.println("Mảng 1: " + list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println("Mảng 2 trước khi gộp: " + list2);
        list2.addAll(list1);
        System.out.println("Mảng 2 khi gộp" + list2);
    }
}

package bt02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) Math.ceil(Math.random() * 10));
        }
        System.out.println("Mảng cũ: " + listNum);
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = listNum.size() - 1; i >= 0; i--) {
            newList.add(listNum.get(i));
        }
        System.out.println("Mảng mới: " + newList);
    }
}

package bt04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        String str = "Xin chào mọi người tôi tên là Huy";
        String[] arrStr = str.split(" ");

        for (String s : arrStr) {
            if (s.length() > 4) {
                listString.add(s);
            }
        }
        System.out.println("Mảng chuỗi: " + listString);
    }
}

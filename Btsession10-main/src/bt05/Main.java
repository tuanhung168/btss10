package bt05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str = "Xin chào mọi người tôi tên là Huy";
        String[] list = str.split(" ");
        String Min = list[0];
        for (String s : list) {
            if (Min.length() > s.length()) {
                Min = s;
            }
        }
        System.out.println("Chuỗi nhỏ nhất: " + Min);
    }
}

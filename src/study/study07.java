package study;

import java.util.Random;
import java.util.Scanner;

//打乱字符串的内容
public class study07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        char[] arr = str.toCharArray();
        Random r = new Random();
        char c = ' ';
        for(int i = 0; i < arr.length; i++){
            int number = r.nextInt(arr.length);
            c = arr[i];
            arr[i] = arr[number];
            arr[number] = c;
        }
        String str1 = new String(arr);
        System.out.println(str1);

    }
}

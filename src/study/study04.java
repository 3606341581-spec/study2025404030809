package study;

import java.util.Scanner;

public class study04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = new StringBuilder().append(str).reverse().toString();
        if(str.equals(result)){
            System.out.println("该字符串是对称字符串");
        }else{
            System.out.println("该字符串不是对称字符串");
        }

    }
}

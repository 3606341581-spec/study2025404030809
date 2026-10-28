package study;
//判断字符串是否相等
import java.util.Scanner;

public class study {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if(n.equalsIgnoreCase("abc")){
            System.out.println("xiangdeng");
        }else{
            System.out.println("buxangdeng");
        }

    }
}

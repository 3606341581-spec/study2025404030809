package test.com.switc;
import java.util.Scanner;
public class www {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1 ->  System.out.println("周一");
            case 2 ->  System.out.println("周二");
            case 3 ->  System.out.println("周三");
            case 4 ->  System.out.println("周四");
            case 5 ->  System.out.println("周五");
            case 6 ->  System.out.println("周六");
            case 7 ->  System.out.println("周日");
            default -> System.out.println("无");
        }

    }
}

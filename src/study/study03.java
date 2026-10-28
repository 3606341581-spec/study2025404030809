package study;
//设置屏蔽词
import java.util.Scanner;

public class study03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要说的话");
        String say = sc.nextLine();
        String[] arr = {"tmd","nmb","cnm"};
        for(int i = 0; i < arr.length; i++){
            say = say.replaceAll("(?i)" + arr[i],"***");
        }
        System.out.println(say);
    }
}

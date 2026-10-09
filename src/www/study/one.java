package www.study;
import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean flag = true;
        for(int i=2;i<number-1;i++){
            if(number%i==0){
                flag = false;
                break;
            }
            }
        if(flag){
            System.out.print(number+"是一个质数");
        }else{
            System.out.println(number+"不是一个质数");
        }



    }
}

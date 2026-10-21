package www.study;
import java.util.Scanner;
public class five {
    public static void main(String[] args){
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            Scanner sc = new Scanner(System.in);
            System.out.printf("请输入第%d个元素%n",i+1);
            arr[i] = sc.nextInt();
        }
        int big = arr[0],small = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>big){
                big = arr[i];
            }
            if(arr[i]<small){
                small = arr[i];
            }

        }
        System.out.println("最大值为："+big);
        System.out.println("最小值为："+small);
    }
}

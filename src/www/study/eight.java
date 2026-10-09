package www.study;
import java.util.Scanner;

public class eight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        for(int i = 0;i<6;i++){
            System.out.println("请输入评分");
            arr[i] = sc.nextInt();
        }
        int big = arr[0],small = arr[0],sum = 0;
        for(int i=0;i<6;i++){
            if(arr[i]>big){
                big = arr[i];
            }
            if(arr[i]<small){
                small = arr[i];
            }
            sum += arr[i];


        }
        sum = (sum-big-small)/(6-2);
        System.out.println("平均分为："+sum);

    }
}

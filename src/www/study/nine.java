package www.study;
import java.util.Random;
import java.util.Scanner;
public class nine {
    public static void main(String[] args) {
        int[] userarr = usernumber();
        for(int i = 0;i<userarr.length;i++){
            System.out.print(userarr[i]+" ");
        }
    }

    public static int[] usernumber(){
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 6;){
            System.out.println("请输入第"+(i+1)+"个数字");
            int number = sc.nextInt();
            if(number>0&&number<=33){
                boolean flag = contains(arr,number);
                if(!flag){
                    arr[i] = number;
                    i++;
                }else{
                    System.out.println("数字重复");
                }
            }else{
                System.out.println("数字不符要求");
            }

        }
        while (true) {
            System.out.println("请输入蓝色号码");
            int bluenumber = sc.nextInt();
            if(bluenumber>0&&bluenumber<=16){
                arr[arr.length-1] = bluenumber;
                break;
            }else{
                System.out.println("不符要求");
            }
        }

        return arr;
    }




    public static int[] creatnumber(){
        int[] arr = new int[7];
        Random r = new Random();
        for(int i = 0;i<6;){
            int rednumber = r.nextInt(33)+1;
            boolean flag = contains(arr,rednumber);
            if(!flag){
                arr[i] = rednumber;
                i++;
            }
        }
        int bluenumber = r.nextInt(16)+1;
        arr[arr.length-1] = bluenumber;
        return arr;
    }

    public static boolean contains(int[] arr,int number){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }

}
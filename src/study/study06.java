package study;
//将字符串A的首字母放到字符串末尾,进行有限次循环并与B对比

public class study06 {
    static void main(String[] args) {
        String strA = "acdeb";
        String strB = "debac";
        boolean flag = check(strA,strB);
        System.out.println(flag);
    }

    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;

    }

    public static String rotate(String str){
        char first = str.charAt(0);
        String end = str.substring(1);
        return end + first;
    }
}

package www.study;
import java.util.Random;
public class seven {
    public static void main(String[] args) {
        char arr[] = new char[52];
        char ch = 'a';
        for (int i = 0; i < arr.length; i++) {
            if (i < 26) {
                arr[i] = (char) (97 + i);
            } else {
                arr[i] = (char) (65 + i - 26);
            }
        }
        String result = "";
        Random r = new Random();
        for (int j = 0; j < 4; j++) {

            int index = r.nextInt(arr.length);
            result = result + arr[index];

        }
        System.out.println(result);
int number = r.nextInt(10);
result = result + number;
System.out.println(result);
    }
}
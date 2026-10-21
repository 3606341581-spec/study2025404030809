public class Exam05 {
    public static void main(String[] args){
        char[][] arr = new char[4][];
        for(int i = 0;i < 4;i++){
            int n = (i*2+1);
            arr[i] = new char[n];
            for(int j = 0;j < n;j++){
                if(j % 2 == 0){
                    arr[i][j] = '*';
                }else{
                    arr[i][j] = ' ';
                }
            }
        }

        for(int i = 0;i < 4;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }

}

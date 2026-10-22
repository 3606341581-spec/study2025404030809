package Exam;

public class StudentTest1 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student("李四", 15, 1);
        Student stu2 = new Student("张三", 16, 2);
        Student stu3 = new Student("王五", 17, 3);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //通过判断学号是否重复来决定是否录入
        Student stu4 = new Student("赵六",18,4);
        //如果学号重复,则提示学号重复,无法录入;如果不重复,则加入到arr数组

        if(idd(arr,stu4)){
            System.out.println("学号 " + stu4.getId() + " 重复，无法录入");
        }else{
            //对比数组中的非空位置的数量与数组长度
            int count = getCount(arr);
            if(count == arr.length) {
                arr = newArr(arr);
            }
                arr[count] = stu4 ;
                print(arr);
            }


    }

    //建造方法,判断学号是否重复
    public static boolean idd(Student arr[],Student student){
     for(int i = 0; i < arr.length; i++) {
         Student stu = arr[i];
         if (stu != null && stu.getId() == student.getId()){
             return true;
         }
     }
     return false;
    }

    //建造方法判断数组里面是否有空位置
    public static int getCount(Student arr[]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }

    //建造方法打印数组
    public static void print(Student arr[]){
        int count = getCount(arr);
        for(int i = 0; i < count; i++){
            Student student = arr[i];
            System.out.println(student.getName()+" "+student.getAge()+" "+student.getId());
        }
    }

    //创建新数组
    public static Student[] newArr(Student[] arr){
        Student[] newArr = new Student[arr.length+1];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
}

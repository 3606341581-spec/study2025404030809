package Exam;

public class StudentTest2 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student("李四", 15, 1);
        Student stu2 = new Student("张三", 16, 2);
        Student stu3 = new Student("王五", 17, 3);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        remove(arr,2);
        print(arr);
    }
    //判断数组中是否有和id相等的学号
    public static int getIndex(Student[] arr,int id){
        for(int i = 0; i < arr.length; i++){
            Student stu = arr[i];
            if(stu != null){
                if(stu.getId() == id){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void print(Student arr[]) {
        int count = getCount(arr);
        for (int i = 0; i < count; i++) {
            Student student = arr[i];
                System.out.println(student.getName() + " " + student.getAge() + " " + student.getId());
        }
    }

    public static int getCount(Student arr[]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }

    public static void remove(Student[] arr, int id) {
        int index = getIndex(arr, id);
        if (index < 0) {
            System.out.println("当前id不存在,删除失败");
            return;
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];       // 后面的往前挪一格
        }
        arr[arr.length - 1] = null;    // 最后一位清空
    }

}

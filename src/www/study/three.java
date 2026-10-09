package www.study;

public class three {
    public static void main(String[] args) {
        compare((byte) 100, (byte) 200);
    }


    public static void compare(byte a1, byte b1) {
        System.out.println(a1 == b1);
    }

    public static void compare(int a2, int b2) {
        System.out.println(a2 == b2);
    }

    public static void compare(long a3, long b3) {
        System.out.println(a3 == b3);
    }

    public static void compare(short a4, short b4) {
        System.out.println(a4 == b4);
    }

}
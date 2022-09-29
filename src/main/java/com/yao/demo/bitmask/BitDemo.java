package com.yao.demo.bitmask;
/*
 * @author Jack
 * @date 2022/8/12
 * https://www.delftstack.com/zh-tw/howto/java/java-bitmask/
 * */

public class BitDemo {
    public static final int MAX_LEN = 1; // :0
    public static final int DIGIT = 2;
    public static final int BIT = 4;//1000
    public static final int MAX_VALUE = 8; // :3   10000
    public static final int DATE = 16;
    public static final int TIMESTAMP = 32;//100000
    public static final int NOT_NULL = 64;//1000000
    public static final int EMAIL = 128;
    public static final int TYPE_9 = 256;
    private static int typeBitsRep;

    public static void main(String[] args) {
        BitDemo bitDemo = new BitDemo();

        int typeBitsRep1 = 2;
        int typeBitsRep2 = 64;
//        System.out.println((typeBitsRep1&NOT_NULL) );
//        System.out.println((typeBitsRep2&NOT_NULL) );
        System.out.println("-----------------------------1");
//        System.out.println(2&64);
//        System.out.println(4&64);
//        System.out.println((8&64));
//        System.out.println((16&64));
//        System.out.println((64&64));
//        System.out.println((96&123));
        System.out.println(9&8);
        System.out.println("-----------------------------2");
//        System.out.println((64&NOT_NULL));
//        System.out.println((8&NOT_NULL));
//        System.out.println((16&NOT_NULL));
//        System.out.println((123&NOT_NULL));
//        System.out.println((32&NOT_NULL));
//        System.out.println((64&NOT_NULL));
//        System.out.println((8&NOT_NULL));
        if ((typeBitsRep&NOT_NULL) == NOT_NULL) {
            //bitmask就進來做判斷，用bitmask是省資源
        }
    }
}








package com.yht.test;

/**
 * 2018/9/22 22:22
 **/
public class Hello {
    public static  void m(){
        System.out.println("m///");
        System.out.println(new Hello());
    }



    public Hello() {
        System.out.println(6778);
    }

    static {
        System.out.println(12345);
    }
    public static void main(String[] args) {
        System.out.println(13);
        for (int i=0;i<2;i++){
            new Thread(()->{
                m();
            }).start();
        }
    }
}

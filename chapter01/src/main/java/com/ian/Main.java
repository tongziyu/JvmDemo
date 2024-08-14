package com.ian;

/**
 * @Description:
 * @Author: Tong Ziyu
 * @Date: 2024/8/12 14:59
 */
public class Main {
    public static int num = 1;

    static {
        num = 2;
        number1 = 20;
    }

    public static int number1 = 10;
    public static void main(String[] args) {
        System.out.println(Main.num);
        System.out.println(Main.number1);
    }
}

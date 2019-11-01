package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入第一個時間ex:xx:xx:xx");
        String s1 = sc.next();
        System.out.println("輸入第二個時間ex:xx:xx:xx");
        String s2 = sc.next();

        String ar1 []= s1.split(":");
        String ar2 []= s2.split(":");

        int hr1 = Integer.parseInt(ar1[0]); // 第一個時
        int hr2 = Integer.parseInt(ar2[0]); // 第二個時
        int hr3 = Math.abs(hr1-hr2); //總差時
        int mm1 = Integer.parseInt(ar1[1]); // 第一個分
        int mm2 = Integer.parseInt(ar2[1]); // 第二個分
        int mm3 = Math.abs(mm1-mm2); //總差分
        int ss1 = Integer.parseInt(ar1[2]); // 第一個分
        int ss2 = Integer.parseInt(ar2[2]); // 第二個分
        int ss3 = Math.abs(ss1-ss2); //總差分
        int sum = hr3*3600+mm3*60+ss3;

        System.out.println("總共相差"+sum+"秒");
    }
    
}

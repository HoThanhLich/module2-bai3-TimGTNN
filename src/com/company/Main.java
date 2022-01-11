package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khai bao bien voi size phan tu
        int size;
        System.out.println(" nhap size ");
        size = sc.nextInt();
        int mang[] = new int[size];
        // nhap gia tri cho mang tu ban phim
        System.out.println("Nhap gia tri cho mang:");
        for (int i = 0; i < size; i++) {
            System.out.printf("tai index %d: ", i);
            mang[i] = sc.nextInt();
        }
        // tim gia tri nho nhat cua mang
        int min = mang[0];
        for (int i = 0; i < size; i++) {
            if (min > mang[i]) {
                min = mang[i];
            }
        }
        System.out.println("GTNN cua mang: " + min);
    }
}

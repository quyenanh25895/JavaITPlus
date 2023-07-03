/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caclenhcoban;

import java.util.Scanner;

/**
 *
 * @author quyen
 */
public class CacLenhCoBan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello");
        int a, b, c;
        float x, x1, x2;
        System.out.println("Nhap a:");
        a = sc.nextInt();
        System.out.println("Nhap b:");
        b = sc.nextInt();
        System.out.println("Nhap c:");
        c = sc.nextInt();
        if (a == 0) {
            System.out.println("Khong phai la phuong trinh bac 2!");
            x = (float) -c / b;
        } else {
            System.out.println("La phuong trinh bac 2!");
            float delta = (float) b * b - 4 * a * c;
            if (delta > 0) {
                System.out.println("Phuong trinh co 2 nghiem phan biet!");
                x1 = (float) (-b + Math.sqrt(delta) / 2 * a);
                x2 = (float) (-b - Math.sqrt(delta) / 2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem duy nhat");
                x = (float) -b / 2 * a;
                System.out.println("x = " + x);                
            } else {
                System.out.println("Phuong trinh co nghiem ao");
            }
        }
    }

}

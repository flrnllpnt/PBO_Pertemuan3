package com.pboreg;
import java.util.Scanner;

public class latihanScanner {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int i = 0;
        int jmlLoop;
        System.out.print("Masukkan jumlah loop: ");
        jmlLoop = myScan.nextInt();
        while (i < jmlLoop){
            System.out.print(i + " ");
            i++;
        }

    }
}

package com.pboreg;

public class ContohBreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i == 4){
                break;
    // kalau mau lewatin angka 4 bisa pakai continue
            }
            System.out.println(i);
        }
    }
}

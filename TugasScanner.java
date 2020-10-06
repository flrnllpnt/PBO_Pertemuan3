package com.pboreg;
import java.util.Scanner;

public class TugasScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        boolean kondisi = true;

        while (kondisi) {

            if (username.equals("florentinalalapenta31@gmail.com") && password.equals("Banyak_mau2")) {
                System.out.println("USERNAME DAN PASSWORD BENAR");
            } else {
                System.out.println("USERNAME ATAU PASSWORD SALAH");
                System.out.println("SILAHKAN COBA LAGI");
                break;
            }
            if (username.equals("florentinalalapenta31@gmail.com") && password.equals("Banyak_mau2")) {
                kondisi = false;
            }
        }
    }
}

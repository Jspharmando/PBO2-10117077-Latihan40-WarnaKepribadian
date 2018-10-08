package com.company;

/**
 * @author
 * Nama : Joseph Armando Carvallo
 * NIM  : 10117077
 **/

import java.util.Scanner;

public class Main {
    //    konstanta warna text
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    //    konstanta warna background
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {
        Warna warna1 = new Warna();
        Nama nama1 = new Nama();
        Scanner scn = new Scanner(System.in);



        //text//
        System.out.print(ANSI_RED+"YUK "+ANSI_RESET);
        System.out.print(ANSI_GREEN+"CEK "+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"KEPRIBADIANMU "+ANSI_RESET);
        System.out.print(ANSI_CYAN+"DARI "+ANSI_RESET);
        System.out.print(ANSI_PURPLE+"WARNA "+ANSI_RESET);
        System.out.print(ANSI_BLUE+"FAVORITMU "+ANSI_RESET+"\n");

        //text + background//
        System.out.print("\n"+ANSI_RED_BACKGROUND+ANSI_WHITE+"\t MERAH \t\t\n"+ANSI_RESET);
        System.out.print(ANSI_GREEN_BACKGROUND+ANSI_WHITE+"\t HIJAU \t\t\n"+ANSI_RESET);
        System.out.print(ANSI_YELLOW_BACKGROUND+ANSI_WHITE+"\t KUNING \t\n"+ANSI_RESET);
        System.out.print(ANSI_BLUE_BACKGROUND+ANSI_WHITE+"\t BIRU \t\t\n"+ANSI_RESET);
        System.out.print(ANSI_PURPLE_BACKGROUND+ANSI_WHITE+"\t UNGU \t\t\n\n"+ANSI_RESET);

        //input//
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna1.warnamu = scn.next();
        System.out.print("NAMA KAMU : ");
        nama1.namaMu = scn.next();

        nama1.tampilNama(nama1.namaMu);
        warna1.hasilTest(warna1.warnamu);
    }
}

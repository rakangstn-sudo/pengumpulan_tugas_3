/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan3;

/**
 *
 * @author Lenovo
 */


public class Pertemuan3 {

    // ===================== IF SATU BARIS =====================
    static void demoIfSatuBaris() {
        int p=5, q=15;

        if ( p < q )
            System.out.println("P lebih kecil dari Q");
        System.out.println("Program Selesai");
    }

    // ===================== IF BLOK =====================
    static void demoIfBlock() {
        int p=15, q=15;

        if ( p < q ){
            System.out.println("P lebih kecil dari Q");
            System.out.println("Q lebih besar dari P");
        }
        System.out.println("Program Selesai");
    }

    // ===================== IF-ELSE SATU BARIS =====================
    static void demoIfElseSatuBaris() {
        int t=4, r=9;

        if (t>r)
            System.out.println("T lebih besar dari R");
        else
            System.out.println("R lebih besar atau sama dengan dari T");
        System.out.println("Program Selesai");
    }

    // ===================== IF-ELSE-IF SATU BARIS (versi 1) =====================
    static void demoIfElseIfSatuBaris1() {
        int nilai = 60;
        char grade;

        if(nilai >= 85 && nilai <= 100)
            grade = 'A';
        else if(nilai >= 75 && nilai < 85)
            grade = 'B';
        else if(nilai >= 60 && nilai < 60)
            grade = 'C';
        else if(nilai >= 35 && nilai <60)
            grade = 'D';
        else
            grade = 'E';

        System.out.println("Nilai = " + nilai);
        System.out.println("Grade Anda " + grade);
    }

    // ===================== IF-ELSE-IF SATU BARIS (versi 2) =====================
    static void demoIfElseIfSatuBaris2() {
        int nilai = 60;
        char grade;

        if(nilai >= 85 && nilai <= 100)
            grade = 'A';
        else
            if(nilai >= 75 && nilai < 85)
                grade = 'B';
            else
                if(nilai >= 60 && nilai < 60)
                    grade = 'C';
                else
                    if(nilai >= 35 && nilai <60)
                        grade = 'D';
                    else
                        grade = 'E';

        System.out.println("Nilai = " + nilai);
        System.out.println("Grade Anda " + grade);
    }

    // ===================== IF-ELSE-IF BLOK =====================
    static void demoIfElseIfBlock() {
        int nilai = 60;
        char grade;

        if(nilai >= 85 && nilai <= 100){
            grade = 'A';
            System.out.println("Nilai = " + nilai);
        }
        else if(nilai >= 75 && nilai < 85){
            grade = 'B';
            System.out.println("Nilai = " + nilai);
        }
        else if(nilai >= 60 && nilai < 60){
            grade = 'C';
            System.out.println("Nilai = " + nilai);
        }
        else if(nilai >= 35 && nilai <60){
            grade = 'D';
            System.out.println("Nilai = " + nilai);
        }
        else{
            grade = 'E';
            System.out.println("Nilai = " + nilai);
        }

        System.out.println("Grade Anda " + grade);
    }

    // ===================== SWITCH =====================
    static void demoSwitch() {
        char grade = 'B';

        //KONDISI SWITCH ... CASE
        switch(grade){
            case 'A':
                System.out.println("Predikat Sangat memuaskan");
                break;
            case 'B':
                System.out.println("Predikat memuaskan");
                break;
            case 'C':
                System.out.println("Predikat Baik");
                break;
            case 'D':
                System.out.println("Grade Cukup");
                break;
            case 'E':
                System.out.println(" ---- ");
                break;
            default:
                System.out.println("Tidak memiliki grade");
                break;
        }
    }

    // ===================== WHILE =====================
    static void demoWhile() {
        int h = 1;

        while(h <= 5){
            System.out.println("Perulangan menggunakan WHILE ke-:" + h);
            h++;
        }
    }

    // ===================== DO-WHILE =====================
    static void demoDoWhile() {
        int r = 1;

        do{
            System.out.println("Perulangan DO ... WHILE ke-:" + r);
            r++;
        } while (r<=5);
    }

    // ===================== FOR =====================
    static void demoFor() {
        int h;

        for(h=0; h <=5; h++){
            System.out.println("Perulangan dengan FOR ke-:" + h);
        }
    }

    // ===================== BREAK =====================
    static void demoBreak() {
        int s;
        for(s=0; s<=10; s++){
            System.out.println("Nilai S : " + s);
            if(s == 5 ){
                break;
            }
        }
    }

    // ===================== CONTINUE =====================
    static void demoContinue() {
        int s;
        System.out.println("Cetak bilangan ganjil");
        for(s=0; s<=10; s++){
            if(s%2 == 0){
                continue;
            }
            System.out.println(s);
        }
    }

    // ===================== CLASS STRING =====================
    static void demoString() {
        String abc = new String("Saya Suka Belajar Java");
        System.out.println("Panjang data String " + abc.length());
        System.out.println("Penggabungan data String " + abc.concat(" di LABKOM"));
        System.out.println("Perbandingan data String abc dengan data: " + abc.equals("saya suka java"));
        System.out.println("Perbandingan data String abc dengan data: " + abc.equals("Saya Suka Belajar Java"));
        System.out.println("Pergantian data String untuk Karakter: " + abc.replace('S', 'D'));
        System.out.println("Pergantian data String untuk Semua Kata: " + abc.replaceAll("Saya Suka Belajar Java","Kami Senang Belajar"));
        System.out.println("Pergantian dta String untuk 1 kata dalam kalimat: " + abc.replaceFirst("Saya", "Kami"));
        System.out.println("Kapitalisme data String (menjadi huruf kecil semua): " + abc.toLowerCase() );
        System.out.println("Kapitalisme data String (menjadi huruf besar semua): " + abc.toUpperCase());
        System.out.println("Sub-String data String mulai dari index ke 5: " + abc.substring(5) );
        System.out.println("Sub-String data String mulai dari index ke 5 sampai huruf ke 9: " + abc.substring(5,9) );
        System.out.println("Operasi Character mengambil index ke-5: " + abc.charAt(5) );
        System.out.println("Operasi Character : " + abc.toCharArray());
        System.out.println("Konversi: " + String.valueOf(abc));
        System.out.println("Konversi: " + abc.toString());
    }

    // ===================== CLASS STRINGBUFFER =====================
    static void demoStringBuffer() {
        StringBuffer abc = new StringBuffer("Saya Suka Belajar Java");
        System.out.println("panjang data StringBuffer: " + abc.length());
        System.out.println("penggantian data StringBuffer: " + abc.replace(0, 4, "Kami"));
        System.out.println("Sub-String:" + abc.indexOf("a"));
        System.out.println("Sub-String:" + abc.charAt(2));
        System.out.println("Sub-String:" + abc.deleteCharAt(2));

        // panjang sebuah buffer bisa diubah, data yang ada tidak hilang
        // jika perubahan ukuran lebih panjang
        // berbeda dengan string, data menjadi gilang karena mengadopsi konsep array

        abc.setLength(60);
        System.out.println("Panjang data StringBuffer : " + abc.length());
        System.out.println("Panjang data StringBuffer : " + abc);
    }

    // ===================== CLASS CHARACTER =====================
    static void demoCharacter() {
        Character abc = new Character('a');
        System.out.println("Character berjenis bilangan ? " + Character.isDigit(abc));
        System.out.println("Character berjenis huruf ? " + Character.isLetter(abc));
        System.out.println("Character berjenis bilangan atau huruf ? " + Character.isLetterOrDigit(abc));
        System.out.println("Character berjenis spasi ? " + Character.isWhitespace(abc));
        System.out.println("Character berjenis huruf kecil ? " + Character.isLowerCase(abc));
        System.out.println("Character berjenis huruf besar ? " + Character.isUpperCase(abc));
        System.out.println("Konversi ke huruf besar : " + Character.toUpperCase(abc));
        System.out.println("Konversi ke huruf kecil : " + Character.toLowerCase(abc));
        System.out.println("Konversi ke String : " + Character.toString(abc));
        System.out.println("Konversi ke String : " + abc.toString());
    }

    // ===================== MAIN =====================
    public static void main(String[] args) {
        demoIfSatuBaris();
        demoIfBlock();
        demoIfElseSatuBaris();
        demoIfElseIfSatuBaris1();
        demoIfElseIfSatuBaris2();
        demoIfElseIfBlock();
        demoSwitch();
        demoWhile();
        demoDoWhile();
        demoFor();
        demoBreak();
        demoContinue();
        demoString();
        demoStringBuffer();
        demoCharacter();
    }
}
package com.amazing.ruangcoding.kuis;

public class Question {
    public String mQuestions[] = {
                       "1. Apa yang dimaksud dengan data...",
                       "2. Apa yang dimaksud dengan basis data...",
                       "3. Komponen basis data dibagi menjadi sebagai berikut:\n" +
                               "1)\tPerangkat Keras\n" +
                               "2)\tSistem Operasi\n" +
                               "3)\tData\n" +
                               "4)\tByte\n" +
                               "5)\tUser\n" +
                               "Komponen basis data yang benar adalah...",
                       "4. Contoh dari Database Management System atau DBMS yang benar adalah...",
                       "5. Dalam memroses basis data menggunakan perintah dalam Bahasa...",
                       "6. Bagian terkecil yang dapat dialamatkan dalam memori disebut...",
                       "7. Kumpulan dari beberapa tabel disebut...",
                       "8. Data yang terletak didalam satu kolom disebut...",
                       "9. Data yang terletak di dalam satu baris dan mewakili satu objek disebut...",
                       "10. Perintah yang digunakan untuk memanipulasi data adalah...",
                       "11. Suatu sistem angka biner yang terdiri atas dua macam nilai saja disebut...",
                       "12. Urutan hierarki basis data dari terkecil yang benar adalah...",
                       "13. Gambar dibawah ini adalah...",
                       "14. Gambar dibawah ini adalah...",
                       "15. Disebut apakah huruf  “B+” yang terdapat di dalam Grade pada gambar dibawah...",

    };

    private String mChoices[][] = {
            {"A. Data adalah kumpulan karakter, symbol, angka atau dalam bentuk lainnya yang memiliki arti dan memerlukan suatu pengolahan.","B. Data adalah kumpulan karakter, symbol, angka atau dalam bentuk lainnya yang belum memiliki arti dan memerlukan suatu pengolahan.","C. Data adalah hasil pengolahan yang memiliki nilai tertentu dan bisa digunakan pengambilan suatu keputusan","D. Data adalah kumpulan karakter yang memiliki nilai tertentu dan bisa digunakan pengambilan suatu keputusan","E. Data adalah kumpulan angka yang memiliki nilai tertentu "},
            {"A. Basis Data adalah sekumpulan karakter, symbol, angka atau dalam bentuk lainnya yang belum memiliki arti dan memerlukan suatu pengolahan.","B. Basis Data adalah sekumpulan data yang memiliki hubungan secara logika dan diatur dengan susunan tertentu serta disimpan dalam media penyimpanan komputer.","C. Basis Data adalah sekumpulan informasi yang tidak memiliki hubungan secara logika dan diatur dengan susunan tertentu.","D. Basis Data adalah sekumpulan data yang memiliki hubungan secara logika dan tidak bersusun.","E. Basis Data adalah kumpulan karakter yang memiliki nilai tertentu dan bisa digunakan pengambilan suatu keputusan"},
            {"A. 1,2,3,4","B. 1,2,3,5","C. 1,3,4,5","D. 1,2,4,5","E. 2,3,4,5"},
            {"A. Microsoft Access, MySql, Oracle database","B. Sybase, Borland-Interbasi, Microsoft Word","C. Borland-Interbasi, Microsoft Word, MySql","D. MySql, Microsoft Access, Command Prompt","E. MySql, Microsoft Access, notepad"},
            {"A. Structured Query Language","B. Java","C. PHP","D. C++","E. Command Prompt"},

            {"A. Field","B. Record","C. Database","D. File","E. Byte"},
            {"A. Field","B. Record","C. Database","D. File","E. Byte"},
            {"A. Field","B. Record","C. DBMS","D. Tabel","E. Bit"},
            {"A. Field","B. Record","C. DBMS","D. Tabel","E. Database"},
            {"A. Report","B. Query","C. Form","D. Tabel","E. Record"},

            {"A. Field","B. Record","C. Database","D. File","E. Bit"},
            {"A. Bit-Byte-Field-Record-File-Basis Data","B. Byte-Bit-Field-Record-File-Basis Data","C. Record-Byte-Bit-Field-File-Basis Data","D. File-Field-Bit-Byte-Record-Basis Data","E. Field-File- Bit-Byte-Record-Basis Data"},
            {"A. Field","B. Record","C. Database","D. File","E. Bit"},
            {"A. Field","B. Record","C. Database","D. File","E. Bit"},
            {"A. Field","B. Record","C. Database","D. File","E. Bit"},

    };
    private String mCorrectAnswer[] = {
            "B. Data adalah kumpulan karakter, symbol, angka atau dalam bentuk lainnya yang belum memiliki arti dan memerlukan suatu pengolahan.",
            "B. Basis Data adalah sekumpulan data yang memiliki hubungan secara logika dan diatur dengan susunan tertentu serta disimpan dalam media penyimpanan komputer.",
            "B. 1,2,3,5",
            "A. Microsoft Access, MySql, Oracle database",
            "A. Structured Query Language",

            "E. Byte",
            "C. Database",
            "A. Field",
            "B. Record",
            "B. Query",

            "E. Bit",
            "A. Bit-Byte-Field-Record-File-Basis Data",
            "B. Record",
            "D. File",
            "A. Field",

    };

    public int getLength() {
        return mQuestions.length;
    }

    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getChoice5(int a) {
        String choice = mChoices[a][4];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}

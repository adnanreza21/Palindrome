package com.covid.ruangcoding.kuis;

public class Question {
    public String mQuestions[] = {
                       "1. DBMS merupakan program aplikasi khusus yang dirancang untuk membuat dan juga mengelola database yang tersedia. Di dalam DBMS umumnya memiliki sejumlah komponen fungsional. Komponen yang dapat mengelola alokasi ruang dan struktur data yang di pakai untuk menpresentasikan informasi yang disimpan dalam disk adalah...",
                       "2. Software yang berperan dalam mengelola, menyimpan, dan mengambil data kembali disebut dengan DBMS. Adapun mekanisme yang digunakan sebagai pelengkap adalah pengaman data, konsistensi data, dan pengguna data bersama. Microsoft Access, Database Oracle, MySQL adalah salah satu program aplikasi  dari DBMS. Apakah kepanjangan dari DBMS...",
                       "3. Sebuah basis data terdiri dari berbagai komponen. Salah satu diantaranya adalah pemakai atau biasa disebut dengan user. User adalah komponen database yang memiliki fungsi untuk  berinteraksi secara langsung dengan database. Di bawah ini yang bukan pemakai atau user dari database adalah...",
                       "4. Field  atau kolom adalah unit terkecil yang disebut data. Field merupakan sekumpulan byte yang mempunyai makna. Dalam struktur hirarki basis data field merupakan salah satu rangkaian data tentang permodelan basis data. Urutan herarki basis data setelah field dari yang terkecil yaitu...",
                       "5. Basis data sering digunakan untuk melakukan proses terhadap data-data tersebut untuk menghasilkan informasi. Informasi tersebut dapat diperoleh dari software pemroses basis data dengan memberikan perintah dalam suatu bahasa. Bahasa yang digunakan untuk perintah dalam memroses basis data  yaitu...",
                       "6. Hirarki basis data adalah serangkaian data tentang permodelan dalam basis data. Hirarki basis data dibagi menjadi enam hirarki. Salah satu hirarki yang disebut sebagai suatu sistem angka biner yang terdiri atas dua macam nilai dan merupakan dasar dasar yang dapat digunakan untuk komunikasi antara manusia dan mesin (komputer) yang merupakan sekumpulan komponen elektronik dan hanya dapat membedakan dua keadaan saja (on dan off) disebut dengan...",
                       "7. Data adalah kumpulan karakter, symbol, angka atau dalam bentuk lainnya yang belum memiliki arti dan memerlukan suatu pengolahan. Data-data yang belum memiliki arti tersebut selanjutnya diproses untuk menghasilkan informasi tertentu dengan menggunakan basis data. Berdasarkan uraian tersebut, pengertian basis data adalah...",
                       "8. Hirarki basis data dibagi menjadi enam hirarki. Berdasarkan urutan hirarki dari yang kecil hingga besar yang benar dibawah ini adalah...",
                       "9. Sistem operasi merupakan salah satu komponen penting dalam sebuah basis data. Windows, Unix, Linuk merupakan jenis-jenis sistem operasi  yang dapat digunakan dalam mengakses basis data. Salah satu fungsi sistem operasi sebagai salah satu komponen basis data yaitu untuk...",
                       "10. Dalam menggunakan basis data digunakan sebuah perintah yang digunakan untuk memanipulasi data, disebut apakah perintah yang digunakan di dalam basis data...",
                       "11. Komponen basis data dibagi menjadi sebagai berikut:\n" +
                               "1) Perangkat Keras\n" +
                               "2) Sistem Operasi\n" +
                               "3) Data\n" +
                               "4) Byte\n" +
                               "5) User\n" +
                               "Komponen basis data yang benar adalah...",
                       "12. Mekanisme yang digunakan dalam DBMS yaitu sebagai pelengkap adalah pengaman data, konsistensi data dan pengguna data bersama. DBMS memiliki sejumlah komponen fungsional. Berikut ini yang bukan merupakan komponen fungsional DBMS adalah...",
                       "13. Basis data umumnya berisi elemen-elemen data yang disusun ke dalam file-file yang diorganisasikan berdasarkan sebuah skema atau struktur tertentu, tersimpan di hardware komputer dan dengan software untuk melakukan manipulasi data untuk kegunaan tertentu. Dalam penggunaannya,basis data memiliki banyak keuntungan. Di bawah ini yang bukan termasuk keuntungan basis data adalah...",
                       "14. Gambar dibawah ini merupakan  salah satu contoh dari file atau table nilai mata kuliah Basis Data. File atau tabel adalah kumpulan record yang sejenis dan secara logika berhubungan. Dari gambar diatas disebut apakah huruf  “B+” yang terdapat di dalam Grade...",
                       "15. diatas merupakan salah satu contoh record. Record atau baris adalah kumpulan item yang secara logic saling berhubungan, sehingga record dapat diibaratkan sebagai kumpulan kata yang membentuk satu kalimat. Berdasarkan gambar record diatas merupakan interpretasi dari kalimat...",

    };

    private String mChoices[][] = {

            {"A. Database manager","B. DML precompiler","C. Querty processor","D. File manager","E. DDL compiler"},
            {"A. Database Multiple System","B. Database Management System","C. Database Manipulation Supply","D. Database Management Supply","E. Database Manipulation System"},
            {"A. Progammer","B. End User","C. Casual User","D. Specialized User","E. Random User"},
            {"A. Bit","B. Byte","C. File","D. Record","E. Basis data"},
            {"A. Java Script","B. Structured Query Language","C. PHP Hypertext Pre-processor","D. Action Script","E. Command Prompt"},

            {"A. Byt","B. Bit","C. Bite","D. Byte","E. Numerik"},
            {"A. Basis Data adalah sekumpulan karakter, symbol, angka atau dalam bentuk lainnya yang belum memiliki arti dan memerlukan suatu pengolahan.","B. Basis Data adalah sekumpulan data yang memiliki hubungan secara logika dan diatur dengan susunan tertentu serta disimpan dalam media penyimpanan komputer.","C. Basis Data adalah sekumpulan informasi yang tidak memiliki hubungan secara logika dan diatur dengan susunan tertentu.","D. Basis Data adalah sekumpulan data yang memiliki hubungan secara logika dan tidak bersusun.","E. Basis Data adalah kumpulan karakter yang memiliki nilai tertentu dan bisa digunakan pengambilan suatu keputusan."},
            {"A. Bit-Byte-File-Record-Field-Basis Data","B. Bit-Byte-Field-Record-File-Basis Data","C. Byte-Bit-File-Record-Field-Basis Data","D. Byte-Bit-Field-Record-File-Basis Data","E. Bite-Byt-File-Field-Record-Basis Data"},
            {"A. Mengelola, menyimpan, dan mengambil data kembali","B. Membuat dan juga mengelola database yang tersedia","C. Berinteraksi secara langsung dengan database","D. Mengaktifkan sistem komputer dan mengendalikan seluruh sumber daya yang ada di dalamnya termasuk operasi- operasi dasar komputer","E. Melakukan pengisian, pengubahan atau pengambilan data yang mudah dalam pemakaianya"},
            {"A. Report","B. Query","C. Form","D. Tabel","E. Record"},

            {"A. 1,2,3,4","B. 1,2,3,5","C. 1,3,4,5","D. 1,2,4,5","E. 2,3,4,5"},
            {"A. DKL Sistem","B. DML precompiler","C. DDL compiler","D. Query Prosessor","E. File Manage"},
            {"A. Kebersamaan","B. Keamanaan","C. Kesenjangan","D. Keakuratan","E. Space"},
            {"A. Field","B. Record","C. Database","D. File","E. Bit"},
            {"A. Joni menempuh mata kuliah Basis Data (kode IS101) dengan nilai A.","B. Joni menempuh mata kuliah Basis Data (kode IS101) berada dalam kelas A.","C. Joni izin pada mata kuliah Basis Data (kode IS101) dengan tanpa keterangan (Alpha).","D. Joni mengerjakan soal Basis Data (kode IS1011) dengan nilai A.","E. Joni menempuh mata kuliah Basis Data (kode IS1001) dengan nilai A."},



    };
    private String mCorrectAnswer[] = {

            "D. File manager",
            "B. Database Management System",
            "E. Random User",
            "D. Record",
            "B. Structured Query Language",

            "B. Bit",
            "B. Basis Data adalah sekumpulan data yang memiliki hubungan secara logika dan diatur dengan susunan tertentu serta disimpan dalam media penyimpanan komputer.",
            "B. Bit-Byte-Field-Record-File-Basis Data",
            "D. Mengaktifkan sistem komputer dan mengendalikan seluruh sumber daya yang ada di dalamnya termasuk operasi- operasi dasar komputer",
            "B. Query",

            "B. 1,2,3,5",
            "A. DKL Sistem",
            "C. Kesenjangan",
            "A. Field",
            "A. Joni menempuh mata kuliah Basis Data (kode IS101) dengan nilai A.",


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

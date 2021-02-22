package projectmahasiswa22022021;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import static projectmahasiswa22022021.Reguler.entryReguler;
import static projectmahasiswa22022021.Reguler.hitungReguler;

public class Mahasiswa {
    
    static String nama, nim;
    static int tahun, prodi;
    public static void main(String[] args) {
        headerAplikasi();
        informasiUmum();
        inputMahasiswa();
        entryReguler();
        hitungReguler();
    }
    
    public static void inputMahasiswa(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("B. Input Data Mahasiswa : ");
        
        System.out.print  ("   Masukkan Nama Mahasiswa           : ");
        nama = input.nextLine();
        
        System.out.print("   Masukkan NIM Mahasiswa            : ");
        nim = input.nextLine();
        
        System.out.print("   Masukkan Tahun Angkatan Mahasiswa : ");
        tahun = input.nextInt();
        
//        System.out.print("   Masukkan Kode Prodi Mahasiswa     : ");
//        prodi = input.nextInt();
        
        System.out.println("===============================================");
    }
    
    public static void informasiUmum(){
        System.out.println("===============================================");
        System.out.println("A. Rincian Biaya :"); 
        System.out.println("   - Biaya Daftar Ulang              = Rp.   250.000,00");
        System.out.println("   - Biaya Operasional               = Rp. 2.000.000,00");
        System.out.println("   - Biaya Dana Kemahasiswaan        = Rp.   750.000,00");
        System.out.println("   - Biaya SKS                       = Rp.    75.000,00");
        System.out.println("   - Diskon 5% jika biaya melebihi   = Rp. 4.500.000,00");
        System.out.println("===============================================");
    }
    
    public static void headerAplikasi(){
        System.out.println("===============================================");
        System.out.println("========= Selamat Datang di Aplikasi ==========");
        System.out.println("======= Administrasi Mahasiswa UNUSIDA ========");
    }
}

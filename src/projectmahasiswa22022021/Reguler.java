package projectmahasiswa22022021;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Reguler extends Mahasiswa {
    
    static int semester;
    static int biayaDaftarUlang = 250000;
    static int danaKemahasiswaan = 750000; 
    static int BOP = 2000000; 
    static int jumlahSKS;
    
    static int biayaSKS = 75000;
    static int uangSKS;
    static int pembayaran = 0;
    static int totalPembayaran;
    
    static int diskon, diskonAwal;
    
    public static void entryReguler(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("C. Input Pembayaran : ");
        System.out.print("   Masukkan Jumlah SKS               = ");
        jumlahSKS = input.nextInt();
    }
    
    public static void hitungReguler(){
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        if(jumlahSKS > 24){
            System.out.println("Maaf, input SKS Maksimal 24 SKS");
            
        } else {
            uangSKS = jumlahSKS * biayaSKS;
            System.out.println("   Jumlah Total Uang SKS             = " + kursIndonesia.format(uangSKS));
            System.out.println("   Jumlah Biaya Daftar Ulang         = " + kursIndonesia.format(biayaDaftarUlang));
            System.out.println("   Jumlah Dana Kemahasiswaan         = " + kursIndonesia.format(danaKemahasiswaan));
            System.out.println("   Jumlah BOP Mahasiswa              = " + kursIndonesia.format(BOP));
            System.out.println("   ============================================ + ");
            totalPembayaran = biayaDaftarUlang + uangSKS + danaKemahasiswaan + BOP;
            System.out.println("   Jumlah Pembayaran                 = " + kursIndonesia.format(totalPembayaran));

            if(totalPembayaran >= 4500000){
                diskonAwal = totalPembayaran * 5 / 100;
                diskon = (totalPembayaran - ((totalPembayaran * 5) / 100));
                System.out.println("   Diskon 5%                         = " + kursIndonesia.format(diskonAwal));
                System.out.println("   ============================================ -");
                System.out.println("   Total yang harus dibayar adalah   = " + kursIndonesia.format(diskon));
            } else {
                System.out.println("   Diskon 5%                         = " + kursIndonesia.format(diskon));
                System.out.println("   ============================================ -");
                System.out.println("   Total yang harus dibayar adalah   = " + kursIndonesia.format(totalPembayaran));
            }
        }
    }
}

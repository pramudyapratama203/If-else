import java.util.Scanner;

public class ProgramDiskon {
    
    public static void main(String[] args) {
        
        // Deklarasi variabel
        int pilih, harga, jumlah;
        double diskon, totalBiaya;
        totalBiaya = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================");
        System.out.println("Program Diskon");
        System.out.println("1. Sandal [50000][5%]");
        System.out.println("2. Sepatu [150000][10%]");
        System.out.println("3. Tas [100000][15%]");
        System.out.println("=====================");
        System.out.print("Pilih barang yang ingin dibeli = "); pilih=sc.nextInt();

            switch(pilih){
                case 1:
                harga = 50000;
                System.out.print("Jumlah barang yang ingin dibeli = "); jumlah=sc.nextInt();
                totalBiaya = harga*jumlah;
                System.out.println("Total = " + totalBiaya);
                diskon = 0.05*totalBiaya;
                System.out.println("Diskon = " + diskon);
                totalBiaya = totalBiaya - diskon;
                System.out.println("Total Akhir = " + totalBiaya);
                System.out.println("=====================");
                break;

                case 2:
                harga = 150000;
                System.out.print("Jumlah barang yang ingin dibeli = "); jumlah=sc.nextInt();
                totalBiaya = harga*jumlah;
                System.out.println("Total = " + totalBiaya);
                diskon = 0.1*totalBiaya;
                System.out.println("Diskon = " + diskon);
                totalBiaya = totalBiaya - diskon;
                System.out.println("Total Akhir = " + totalBiaya);
                System.out.println("=====================");
                break;

                case 3: 
                harga = 100000;
                System.out.print("Jumlah barang yang ingin dibeli = "); jumlah=sc.nextInt();
                totalBiaya = harga*jumlah;
                System.out.println("Total = " + totalBiaya);
                diskon = 0.15*totalBiaya;
                System.out.println("Diskon = " + diskon);
                totalBiaya = totalBiaya - diskon;
                System.out.println("Total Akhir = " + totalBiaya);
                System.out.println("=====================");
                break;

                default: 
                System.out.println("Maaf, pilihan tidak ada");
            }

        if (totalBiaya < 100000) {
            diskon = 0 * totalBiaya;
            totalBiaya = totalBiaya - diskon;
            System.out.println("Diskon = " + diskon);
            System.out.println("Anda tidak mendapatkan diskon tambahan");
            System.out.println("Total akhir = " + totalBiaya);
            System.out.println("=====================");
        } else if(totalBiaya >= 100001 && totalBiaya <= 200000) {
            diskon = 0.05 * totalBiaya;
            totalBiaya = totalBiaya - diskon;
            System.out.println("Diskon = " + diskon);
            System.out.println("Anda mendapatkan diskon tambahan");
            System.out.println("Total akhir = " + totalBiaya);
            System.out.println("=====================");
        } else if(totalBiaya >= 200001 && totalBiaya <= 300000) {
            diskon = 0.1 * totalBiaya;
            totalBiaya = totalBiaya - diskon;
            System.out.println("Diskon = " + diskon);
            System.out.println("Anda mendapatkan diskon tambahan");
            System.out.println("Total akhir = " + totalBiaya);
            System.out.println("=====================");
        } else if(totalBiaya >= 300001 && totalBiaya <= 400000) {
            diskon = 0.15 * totalBiaya;
            totalBiaya = totalBiaya - diskon;
            System.out.println("Diskon = " + diskon);
            System.out.println("Anda mendapatkan diskon tambahan");
            System.out.println("Total akhir = " + totalBiaya);
            System.out.println("=====================");
        } else if(totalBiaya >= 400001 && totalBiaya <= 500000) {
            diskon = 0.2 * totalBiaya;
            totalBiaya = totalBiaya - diskon;
            System.out.println("Diskon = " + diskon);
            System.out.println("Anda mendapatkan diskon tambahan");
            System.out.println("Total akhir = " + totalBiaya);
            System.out.println("=====================");
        } else if(totalBiaya > 500000) {
            diskon = 0.25 * totalBiaya;
            totalBiaya = totalBiaya - diskon;
            System.out.println("Diskon = " + diskon);
            System.out.println("Anda mendapatkan diskon tambahan");
            System.out.println("Total akhir = " + totalBiaya);
            System.out.println("=====================");
        }
        
        double uangKembalian, uangTerima;
        System.out.print("Uang yang diterima = "); uangTerima=sc.nextDouble();
        System.out.println("=====================");
        
        uangKembalian = uangTerima - totalBiaya;
        System.out.println("Uang kembalian yang didapat = " + uangKembalian);
        System.out.println("Program selesai");
        System.out.println("Credit : Putu Pramudya Pratama");
        System.out.println("=====================");



        
    }
}

/* PUTU PRAMUDYA PRATAMA
 * 24082010113
 * 1C
 */

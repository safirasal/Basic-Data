package belanja;

import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
      double Bayar,TotalPembelian,DapatPotongan = 25.000;
     Scanner input = new Scanner (System.in);
     
     System.out.print ("Total Pembelian = ");
     TotalPembelian = input.nextDouble();
     
     System.out.print("Total Pembayaran =");
     Bayar = input.nextDouble();
     
     double Kembalian = TotalPembelian - Bayar;
     
     if (TotalPembelian < DapatPotongan){
         System.out.println("TotalPembelian = " + TotalPembelian);
         System.out.println("TotalPembayaran = " + Bayar);
         System.out.println("Kembalian = " + Kembalian);
         
     }else{
         System.out.println("TotalPembelian = " + (TotalPembelian*0.2-TotalPembelian));
         System.out.println("TotalPembayaran = " + Bayar);
         System.out.println("Kembalian = " + Kembalian);      
     }
     
     
     
     
    }
    
}

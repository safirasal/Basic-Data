package saranmenu1;
import java.util.Scanner;
public class SaranMenu1 {
    public static void main(String[] args) {
       String identitas = ("Safira Salsabila Bramanti / X RPL 6 / 35");
        System.out.println("Identitas:"+ identitas);
        
          System.out.print("\n<<<<<Saran Menu Sal's cafe >>>>>>\n");
          Scanner io = new Scanner (System.in);
          
          System.out.println ("Pilihan1: ");
          System.out.println ("1. Paket A ");
          System.out.println ("2. Paket B ");
          System.out.print ("Masukkan no pilihan Anda : ");
          int pilihan1 = io.nextInt();
        
         if(pilihan1== 1 || pilihan1== 2)
       {
           System.out.println("Pilihan2:");
         if (pilihan1 == 1)   {
            System.out.println ("1. Paket Combo ");
            System.out.println ("2. Peket Happy Meal ");
            System.out.println ("3. Tidak ada");
            
        }else{
            System.out.println ("1. Dessert");
            System.out.println ("2. Drink ");
            System.out.println ("3. Tidak ada");
        }
         System.out.print ("Masukkan no pilihan Anda : ");
        }else
           System.out.println ("Mohon maaf, pilihan tidak ditemukan,"+"cari pilihan lain");
       int pilihan2 = io.nextInt();
       if(pilihan2 >= 1 && pilihan2 <=3){
           if (pilihan1==1)
               switch(pilihan2)
               {
                   case 1 : System.out.println(
                           "Anda dapat memesan Cheese Croissant"); break;
                   case 2 : System.out.println(
                           "Anda dapat memesan Iced Hazelnut Latte"); break;
                   case 3 : System.out.println(
                           "Anda dapat memesan menu lain seperti Banana Muffin, Mango Peach Frappe dan lain-lain ");
               }
           else
               switch (pilihan2){
                case 1 : System.out.println(
                           "Anda dapat memesan Cheese Cake "); break;
                case 2 : System.out.println(
                           "Anda dapat mememesan Cappucino"); break;
                case 3 : System.out.println(
                           "Anda dapat memesan menu lain seperti paket special atau paket family");   
               }
       }else 
           System.out.println("Mohon maaf, pilihan tidak ditemukan,"
                               + "tidak dapat menemukan opsi lain");
       
    }
       
    
    
}

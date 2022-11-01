
package biodataanda;
import java.util.Scanner;
public class BiodataAnda {
    public static void main(String[] args) {
        String namalengkap, namaakrab, tempattanggallahir, asalkota, asalSMP, hobi, kalimatmotivasi, prestasi;
       
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("------BIODATA ANDA------");
        System.out.print("Nama lengkap: ");
        namalengkap = keyboard.nextLine();
        System.out.print("Nama Akrab: ");
        namaakrab = keyboard.nextLine();
        System.out.print("Tempat Tanggal Lahir: ");
        tempattanggallahir = keyboard.nextLine();
        System.out.print("Asal Kota: ");
        asalkota = keyboard.nextLine();
        System.out.print("Asal SMP: ");
        asalSMP = keyboard.nextLine();
        System.out.print("Hobi: ");
        hobi = keyboard.nextLine();
        System.out.print("Kalimat Motivasi: ");
        kalimatmotivasi = keyboard.nextLine();
        System.out.print("Prestasi: ");
        prestasi = keyboard.nextLine();
     
           
        System.out.println("--------------------");
        System.out.println("Nama Lengkap: " + namalengkap);
        System.out.println("Nama Akrab: " + namaakrab);
        System.out.println("Tempat Tanggal Lahir: " + tempattanggallahir);
        System.out.println("Asal Kota: Kota " + asalkota);
        System.out.println("Asal SMP: " + asalSMP);
        System.out.println("Hobi: " + hobi);
        System.out.println("Kalimat Motivasi: " + kalimatmotivasi);
        System.out.println("Prestasi: " + prestasi);
        
    }
    
}

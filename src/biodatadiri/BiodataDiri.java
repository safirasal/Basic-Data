
package biodatadiri;
import java.util.Scanner;
public class BiodataDiri {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama, nis, tempat, tanggal, gender, alamat, motto;
        
        System.out.println();
        System.out.println("====================");
        System.out.println("Program menampilkan biodata diri");
        System.out.println("====================");
        System.out.println();
        System.out.print("Nama Lengkap :");
        nama = input.nextLine();
        System.out.print("NIS :");
        nis =  input.nextLine();
        System.out.print("Tempat Lahir :");
        tempat = input.nextLine();
        System.out.print("Tanggal Lahir :");
        tanggal = input.nextLine();
        System.out.print("Jenis Kelamin :");
        gender = input.nextLine();
        System.out.print("Alamat di Malang :");
        alamat = input.nextLine();
        System.out.print("Motto Hidup :");
        motto = input.nextLine();
        System.out.println("=======================");
        System.out.println ("Nama : "+nama);
        System.out.println ("NIS : "+nis);
        System.out.println ("Tempat/Tanggal lahir :"+tempat+","+tanggal);
        System.out.println ("Jenis Kelamin : "+gender);
        System.out.println ("Alamat di Malang : "+alamat);
        System.out.println ("Motto HIdup : "+ motto);
        
    }
    
}

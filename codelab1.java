import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Period;

public class codelab1 {
    public static void main(String[] args){

        Scanner data_diri = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = data_diri.nextLine();

        System.out.print("Masukkan jenis kelamin (L/P): ");
        char jenisKelamin = data_diri.next().charAt(0);

        System.out.println("Tanggal Lahir (yyyy-MM-dd) : ");
        String tanggalLahirStr = data_diri.next();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr, formatter);
        LocalDate waktuSekarang = LocalDate.now();
        Period umur = Period.between(tanggalLahir, waktuSekarang);


        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Tanggal Lahir: " + formatter.format(tanggalLahir));
        System.out.println("Umur anda: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan " + umur.getDays() + " hari");

        data_diri.close();
    }

}
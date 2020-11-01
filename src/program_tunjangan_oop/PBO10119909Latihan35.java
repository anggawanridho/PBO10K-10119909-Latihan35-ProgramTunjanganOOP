package program_tunjangan_oop;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10119909Latihan35 {

    public static void main(String[] args) {
	User karyawan = new User();
	System.out.println("==========Program Tunjangan==========");
	Double gajipokokKaryawan = karyawan.getGajipokok();
	String statusKaryawan = karyawan.getStatus();
    Double tunjanganKaryawan = karyawan.hitungTunjangan(statusKaryawan);
    Double totalGaji = karyawan.setTotal();
    System.out.println("\n========Hasil Perhitungan Gaji Anda========");
    System.out.printf("Gaji Pokok\t\t: Rp %.1f%n",gajipokokKaryawan);
    System.out.printf("Tunjangan\t\t: Rp %.1f%n",tunjanganKaryawan);
    System.out.printf("Total Gaji\t\t: Rp %.1f%n",totalGaji);
    System.out.println("(Developed by: Anggawan Ridho)");

    }
}

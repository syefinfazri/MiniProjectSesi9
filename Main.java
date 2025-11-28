import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

class Mahasiswa {
    String nim, nama;
    double nilai;

    Mahasiswa(String nim, String nama, double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Nilai: " + nilai;
    }
}

public class Main {
    static LinkedList<Mahasiswa> list = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n===== MENU SISTEM MAHASISWA =====");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Update Nilai");
            System.out.println("5. Tampilkan Semua");
            System.out.println("6. Hitung Jumlah");
            System.out.println("7. Nilai Rata-rata");
            System.out.println("8. Urutkan Nama");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");

            // Hindari error input selain angka
            try {
                pilihan = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                pilihan = -1;
            }

            switch (pilihan) {
                case 1 -> tambahMahasiswa();
                case 2 -> hapusMahasiswa();
                case 3 -> cariMahasiswa();
                case 4 -> updateNilai();
                case 5 -> tampilkanSemua();
                case 6 -> hitungJumlah();
                case 7 -> nilaiRataRata();
                case 8 -> urutkanNama();
                case 9 -> System.out.println("Terima kasih, program selesai!");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 9);
    }

    static void tambahMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Nilai: ");
        double nilai = Double.parseDouble(sc.nextLine());

        list.add(new Mahasiswa(nim, nama, nilai));
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    static void hapusMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
        String nim = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).nim.equals(nim)) {
                list.remove(i);
                found = true;
                System.out.println("Data mahasiswa berhasil dihapus!");
                break;
            }
        }
        if (!found) System.out.println("Data tidak ditemukan!");
    }

    static void cariMahasiswa() {
        System.out.print("Masukkan nama mahasiswa yang dicari: ");
        String nama = sc.nextLine();

        for (Mahasiswa m : list) {
            if (m.nama.equalsIgnoreCase(nama)) {
                System.out.println("Data ditemukan: " + m);
                return;
            }
        }
        System.out.println("Data tidak ditemukan!");
    }

    static void updateNilai() {
        System.out.print("Masukkan NIM mahasiswa yang akan diupdate: ");
        String nim = sc.nextLine();

        for (Mahasiswa m : list) {
            if (m.nim.equals(nim)) {
                System.out.print("Masukkan nilai baru: ");
                m.nilai = Double.parseDouble(sc.nextLine());
                System.out.println("Nilai berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Data tidak ditemukan!");
    }

    static void tampilkanSemua() {
        if (list.isEmpty()) {
            System.out.println("Belum ada data.");
            return;
        }

        System.out.println("\n=== Daftar Mahasiswa ===");
        for (Mahasiswa m : list) {
            System.out.println(m);
        }
    }

    static void hitungJumlah() {
        System.out.println("Jumlah mahasiswa dalam list: " + list.size());
    }

    static void nilaiRataRata() {
        if (list.isEmpty()) {
            System.out.println("Belum ada data.");
            return;
        }

        double total = 0;
        for (Mahasiswa m : list) {
            total += m.nilai;
        }
        System.out.println("Nilai rata-rata: " + (total / list.size()));
    }

    static void urutkanNama() {
        if (list.isEmpty()) {
            System.out.println("Belum ada data.");
            return;
        }

        Collections.sort(list, (a, b) -> a.nama.compareToIgnoreCase(b.nama));
        System.out.println("Data berhasil diurutkan berdasarkan nama!");
        tampilkanSemua();
    }
}
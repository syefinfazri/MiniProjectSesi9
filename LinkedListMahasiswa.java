import java.util.LinkedList;

class LinkedListMahasiswa {
    LinkedList<Mahasiswa> list = new LinkedList<>();

    // Tambah mahasiswa
    public void tambah(String nim, String nama, double nilai) {
        list.add(new Mahasiswa(nim, nama, nilai));
    }

    // Cari mahasiswa
    public Mahasiswa cari(String nama) {
        for (Mahasiswa m : list) {
            if (m.nama.equalsIgnoreCase(nama)) {
                return m;
            }
        }
        return null;
    }

    // Update nilai
    public boolean update(String nama, double nilaiBaru) {
        Mahasiswa m = cari(nama);
        if (m != null) {
            m.nilai = nilaiBaru;
            return true;
        }
        return false;
    }

    // Hapus mahasiswa
    public boolean hapus(String nama) {
        Mahasiswa m = cari(nama);
        if (m != null) {
            list.remove(m);
            return true;
        }
        return false;
    }

    // Tampilkan semua
    public void tampilkan() {
        if (list.isEmpty()) {
            System.out.println("Data kosong.");
        } else {
            System.out.println("\nDaftar Mahasiswa:");
            for (Mahasiswa m : list) {
                System.out.println(m);
            }
        }
    }

    // Hitung jumlah mahasiswa
    public int hitungJumlah() {
        return list.size();
    }

    // Hitung rata-rata nilai
    public double rataRata() {
        if (list.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa m : list) {
            total += m.nilai;
        }
        return total / list.size();
    }

    // Urutkan berdasarkan nama
    public void urutkanNama() {
        list.sort((a, b) -> a.nama.compareToIgnoreCase(b.nama));
    }
}

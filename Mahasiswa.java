class Mahasiswa {
    String nim;
    String nama;
    double nilai;

    Mahasiswa(String nim, String nama, double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return nim + " | " + nama + " | " + nilai;
    }
}

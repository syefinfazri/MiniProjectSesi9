# Mini Project Sesi 9 – Linked List

* **Nama:** Syefin Fazri Nugraha
* **NIM:** 20210040097
* **Kelas:** TI25F
* **Mata Kuliah:** Algoritma dan Struktur Data
* **Dosen Pengampu:** Shinta Ayuningtias, S.Kom., M.Kom

---

## Penjelasan Singkat

Mini project ini bertujuan untuk memahami dan mengimplementasikan **struktur data Linked List** dalam bahasa Java. Program dirancang untuk mengelola data mahasiswa secara dinamis, di mana setiap data disimpan dalam node yang saling terhubung. Linked List digunakan karena mampu menambah dan menghapus data tanpa batasan ukuran seperti array statis.

---

## Struktur Data yang Digunakan

* **LinkedList (Single Linked List)**

  * Menyimpan data mahasiswa berupa NIM, nama, dan nilai
  * Setiap node memiliki data dan pointer ke node berikutnya

---

## Fitur Program

Program menyediakan menu interaktif dengan fitur sebagai berikut:

1. **Tambah Mahasiswa**
   Menambahkan data mahasiswa baru ke dalam Linked List

2. **Hapus Mahasiswa**
   Menghapus data mahasiswa berdasarkan NIM tertentu

3. **Cari Mahasiswa**
   Mencari data mahasiswa berdasarkan nama

4. **Update Nilai Mahasiswa**
   Memperbarui nilai mahasiswa berdasarkan NIM

5. **Tampilkan Seluruh Mahasiswa**
   Menampilkan seluruh data mahasiswa yang tersimpan dalam Linked List

6. **Hitung Jumlah Mahasiswa**
   Menghitung total node (data mahasiswa) yang ada dalam Linked List

7. **Nilai Rata-rata**
   Menghitung rata-rata nilai dari seluruh mahasiswa

8. **Urutkan Berdasarkan Nama**
   Mengurutkan data mahasiswa berdasarkan nama secara alfabet (A–Z)

9. **Keluar Program**
   Mengakhiri program

---

## Aktivitas Praktikum

### Aktivitas 1 – Penambahan dan Penampilan Data

Program berhasil menambahkan beberapa data mahasiswa ke dalam Linked List dan menampilkannya secara berurutan sesuai urutan input.

**Kesimpulan:**
Linked List memungkinkan penambahan data secara fleksibel tanpa harus menggeser elemen lain.

---

### Aktivitas 2 – Pencarian dan Penghapusan Data

Program dapat mencari mahasiswa berdasarkan nama dan menghapus mahasiswa berdasarkan NIM.

**Kesimpulan:**
Proses pencarian dilakukan dengan traversal node satu per satu dari head hingga data ditemukan atau list berakhir.

---

### Aktivitas 3 – Update dan Perhitungan Data

Program mampu:

* Memperbarui nilai mahasiswa
* Menghitung jumlah mahasiswa
* Menghitung nilai rata-rata

**Kesimpulan:**
Linked List dapat digunakan tidak hanya untuk penyimpanan data, tetapi juga untuk pengolahan data secara dinamis.

---

### Aktivitas 4 – Pengurutan Data

Data mahasiswa dapat diurutkan berdasarkan nama menggunakan perbandingan string.

**Kesimpulan:**
Pengurutan pada Linked List dapat dilakukan dengan membandingkan isi node tanpa harus mengubah struktur pointer.

---

## File Program

| Nama File        | Keterangan                                      |
| ---------------- | ----------------------------------------------- |
| `Main.java`      | Program utama dengan menu dan fitur Linked List |
| `Mahasiswa.java` | Class data mahasiswa                            |
| `Node.java`      | Class node untuk Linked List                    |

---

## Contoh Output

Program menampilkan menu seperti berikut:

```
===== MENU SISTEM MAHASISWA =====
1. Tambah Mahasiswa
2. Hapus Mahasiswa
3. Cari Mahasiswa
4. Update Nilai
5. Tampilkan Semua
6. Hitung Jumlah
7. Nilai Rata-rata
8. Urutkan Nama
9. Keluar

```

## Kesimpulan Akhir

Linked List merupakan struktur data dinamis yang sangat efektif untuk pengelolaan data yang sering mengalami penambahan dan penghapusan. Mini project ini membuktikan bahwa Linked List cocok digunakan untuk sistem manajemen data sederhana seperti data mahasiswa. Dibandingkan array, Linked List lebih fleksibel karena tidak memiliki batas ukuran tetap.

---

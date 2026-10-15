# Sistem Pendataan UMKM pada Event

**Nama:** Aulia Sheva Savitri  
**NIM:** 2509116001

## Deskripsi Program

Sistem Pendataan UMKM pada Event merupakan program berbasis Java yang digunakan untuk mengelola data UMKM yang mengikuti sebuah event. Program ini dikembangkan menggunakan konsep Pemrograman Berorientasi Objek (PBO) dan pola arsitektur Model-View-Controller (MVC).

Pada Mini Project 4, program dikembangkan dengan menghubungkan aplikasi Java ke database MySQL menggunakan JDBC (*Java Database Connectivity*). Dengan adanya database, data UMKM dapat disimpan secara permanen dan tidak hanya tersimpan selama program berjalan.

Program memiliki fitur CRUD (*Create, Read, Update, Delete*) untuk menambah, menampilkan, mengubah, dan menghapus data UMKM. Proses pengolahan database dilakukan menggunakan `PreparedStatement` dan dipisahkan melalui class DAO (*Data Access Object*).

## Fitur Program

Fitur yang tersedia dalam program meliputi:

1. Menambahkan data UMKM.
2. Menampilkan data UMKM dari database.
3. Mencari data UMKM berdasarkan ID.
4. Mengubah data UMKM.
5. Menghapus data UMKM.
6. Melakukan validasi input pengguna.
7. Memilih jenis usaha Kuliner dan Fashion.
8. Menampilkan informasi UMKM secara lengkap dan singkat.
9. Menghubungkan aplikasi Java dengan MySQL menggunakan JDBC.
10. Menjalankan perintah SQL menggunakan `PreparedStatement`.
11. Menyediakan file SQL untuk membuat tabel dan memasukkan data awal.

## Teknologi yang Digunakan

- **Java** sebagai bahasa pemrograman.
- **NetBeans** sebagai IDE untuk mengembangkan dan menjalankan program.
- **MySQL** sebagai sistem manajemen database.
- **JDBC** untuk menghubungkan aplikasi Java dengan MySQL.
- **PreparedStatement** untuk menjalankan perintah SQL dengan parameter.
- **MVC** untuk memisahkan bagian Model, View, dan Controller.
- **DAO** untuk memisahkan proses akses database dari bagian program lainnya.
- **GitHub** untuk menyimpan source code dan dokumentasi proyek.




## Alur Program

Program dimulai melalui class `Pendataan_UMKM.java`. Class ini membuat objek event, Controller, dan View sebelum menampilkan menu utama kepada pengguna.

Alur pengolahan data adalah sebagai berikut:

1. `UMKMView` menampilkan menu dan menerima input pengguna.
2. `UMKMController` menerima permintaan dari View.
3. `UMKMController` memanggil method yang sesuai pada `UMKMDAO`.
4. `UMKMDAO` menjalankan perintah SQL melalui JDBC dan `PreparedStatement`.
5. MySQL memproses permintaan dan menyimpan atau mengembalikan data.
6. Hasil pengolahan diteruskan kembali untuk ditampilkan kepada pengguna.

Dengan alur ini, bagian tampilan, pengaturan alur program, dan pengolahan database memiliki tugas masing-masing.

## Database MySQL

Program menggunakan database bernama `pendataan_umkm`. Database ini memiliki dua tabel utama, yaitu `event` dan `umkm`.

### 1. Tabel `event`

Tabel `event` digunakan untuk menyimpan informasi event.

| Atribut | Keterangan |
|---|---|
| `id_event` | Primary key event |
| `nama_event` | Nama event |
| `lokasi` | Lokasi event |

### 2. Tabel `umkm`

Tabel `umkm` digunakan untuk menyimpan data UMKM yang mengikuti event.

| Atribut | Keterangan |
|---|---|
| `id_umkm` | Primary key UMKM |
| `nama_usaha` | Nama usaha |
| `nama_pemilik` | Nama pemilik usaha |
| `jenis_usaha` | Jenis usaha |
| `id_event` | Foreign key yang menghubungkan UMKM dengan event |

Relasi kedua tabel menggunakan atribut `id_event`. Satu event dapat diikuti oleh beberapa UMKM.

## Koneksi Database Menggunakan JDBC

JDBC digunakan untuk menghubungkan program Java dengan database MySQL. Pada proyek ini, koneksi diatur melalui class `DatabaseConnection.java` yang berada di package `database`.

Class tersebut menggunakan `DriverManager.getConnection()` dengan URL database, username, dan password yang sesuai dengan konfigurasi MySQL.

Pemisahan koneksi ke dalam satu class memudahkan pengaturan database dan memungkinkan class DAO menggunakan koneksi yang sama tanpa menuliskan konfigurasi berulang kali.

## Penggunaan PreparedStatement

`PreparedStatement` digunakan untuk menjalankan perintah SQL dengan parameter yang diisi melalui program Java.

Pada program ini, `PreparedStatement` digunakan dalam operasi CRUD, yaitu `INSERT`, `SELECT`, `UPDATE`, dan `DELETE`.

Penggunaan parameter membantu memisahkan perintah SQL dari nilai input pengguna. Selain membuat query lebih terstruktur, cara ini membantu mengurangi risiko SQL injection dibandingkan menggabungkan input pengguna langsung ke dalam teks query.

## Penerapan DAO

DAO (*Data Access Object*) merupakan bagian program yang menangani akses ke database. Pada proyek ini, proses tersebut dilakukan oleh class `UMKMDAO.java`.

Method utama yang digunakan meliputi:

- `tampilkanSemua()` untuk mengambil data UMKM dari database.
- `tambah()` untuk menambahkan data UMKM.
- `ubah()` untuk memperbarui data UMKM.
- `hapus()` untuk menghapus data UMKM.

Method `tampilkanSemua()` mengambil hasil query dan menampungnya sementara ke dalam `ArrayList<UMKM>`. ArrayList tersebut digunakan untuk membawa hasil query ke Controller dan View, sedangkan penyimpanan permanen tetap dilakukan oleh MySQL.

Dengan adanya DAO, proses pengolahan SQL tidak perlu ditulis langsung di bagian View.

## Penerapan CRUD

CRUD merupakan proses utama untuk mengelola data dalam aplikasi.

| Operasi | Perintah SQL | Fungsi |
|---|---|---|
| Create | `INSERT` | Menambahkan data UMKM |
| Read | `SELECT` | Mengambil dan menampilkan data UMKM |
| Update | `UPDATE` | Memperbarui data UMKM |
| Delete | `DELETE` | Menghapus data UMKM |

Seluruh operasi tersebut dilakukan melalui Controller dan DAO. Data yang berhasil ditambahkan atau diubah akan disimpan ke database sehingga dapat diakses kembali ketika program dijalankan.

## File SQL dan Data Awal

File `pendataan_umkm.sql` disediakan untuk menyiapkan database sebelum aplikasi dijalankan. File ini berisi perintah untuk membuat database, membuat tabel, menentukan relasi, dan memasukkan data awal.

Contoh data awal yang digunakan:

- Event: Bazar UMKM Samarinda 2026.
- UMKM: Dapur Aulia.
- UMKM: Samarinda Fashion.

Data tersebut digunakan untuk mempermudah pengujian fitur tampil, ubah, dan hapus. Data awal dimasukkan ke MySQL melalui file SQL, bukan hanya disimpan dalam objek Java.

## Cara Menjalankan Program

1. Siapkan JDK, NetBeans, dan MySQL.
2. Jalankan layanan MySQL.
3. Buka phpMyAdmin atau klien MySQL yang digunakan.
4. Jalankan file `pendataan_umkm.sql` untuk membuat database, tabel, dan data awal.
5. Pastikan konfigurasi pada `DatabaseConnection.java` sesuai dengan port, nama database, username, dan password MySQL.
6. Pastikan MySQL JDBC Driver sudah tersedia di proyek.
7. Buka proyek di NetBeans.
8. Jalankan class `Pendataan_UMKM.java`.
9. Gunakan menu yang tersedia untuk mengelola data UMKM.

## Pengujian Program

Pengujian dilakukan untuk memastikan aplikasi terhubung dengan database dan operasi CRUD berjalan sesuai fungsinya.

Pengujian yang dilakukan meliputi:

1. Menguji koneksi aplikasi ke MySQL.
2. Menampilkan data awal yang tersimpan di database.
3. Menambahkan data UMKM baru dan memeriksa hasilnya.
4. Mengubah data UMKM dan memeriksa apakah perubahan tersimpan.
5. Menghapus data UMKM dan memastikan data tersebut tidak lagi ditampilkan.
6. Menjalankan kembali program untuk memeriksa apakah data yang tersimpan tetap tersedia.

### Dokumentasi Pengujian


**1. Struktur Project**

<img width="254" height="227" alt="image" src="https://github.com/user-attachments/assets/54394cf1-f3e8-4cef-ac9b-5446e8dea403" />




**2. Koneksi Database**

<img width="394" height="260" alt="image" src="https://github.com/user-attachments/assets/3f72d608-dd27-4d8e-9d9e-5c81b492ee31" />

<img width="393" height="250" alt="image" src="https://github.com/user-attachments/assets/8d86103f-bec4-456a-9022-c0efa8cb0526" />

<img width="449" height="239" alt="image" src="https://github.com/user-attachments/assets/91a5d013-b3a1-4053-9196-a6783b694c9a" />

**3. Database MySQL**

Tampilkan tabel `event` dan `umkm`, termasuk data awal yang telah dimasukkan.

**4. Hasil Tambah Data**

Tampilkan proses penambahan UMKM dan hasil data yang tersimpan.

**5. Hasil Tampil Data**

Tampilkan daftar UMKM yang diambil dari database.

**6. Hasil Ubah Data**

Tampilkan data sebelum dan sesudah perubahan.

**7. Hasil Hapus Data**

Tampilkan proses penghapusan dan hasil pemeriksaan setelah data dihapus.

*Screenshot diisi dengan hasil pengujian dari program yang dijalankan sendiri.*

## Kesimpulan

Mini Project 4 mengembangkan Sistem Pendataan UMKM pada Event dengan menambahkan integrasi database MySQL menggunakan JDBC. Penggunaan `PreparedStatement` membantu pelaksanaan perintah SQL dengan parameter, sedangkan DAO memisahkan proses akses database dari bagian tampilan dan pengaturan alur program.

Melalui penerapan CRUD, pengguna dapat menambahkan, menampilkan, mengubah, dan menghapus data UMKM. Penggunaan MySQL sebagai penyimpanan utama membuat data dapat disimpan secara permanen dan digunakan kembali ketika program dijalankan.

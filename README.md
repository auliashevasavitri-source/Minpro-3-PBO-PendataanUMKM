# Sistem-Pendataan-UMKM

AULIA SHEVA SAVITRI | 2509116001

## Deskripsi Program

**Sistem Pendataan UMKM** merupakan program yang digunakan untuk mengelola data UMKM yang mengikuti sebuah event. Program ini merupakan pengembangan dari Mini Project 1 dengan menambahkan beberapa konsep Pemrograman Berorientasi Objek (PBO).

Program dapat digunakan untuk menambah, menampilkan, mengubah, dan menghapus data UMKM. Data yang disimpan terdiri dari ID UMKM, nama usaha, nama pemilik, jenis usaha, dan event yang diikuti.

Pada Mini Project 3 ini, program dikembangkan dari Mini Project 2 dengan menambahkan konsep polymorphism, abstraction, dan interface. Konsep sebelumnya seperti access modifier, encapsulation, inheritance, input validation, dummy data, dan MVC tetap digunakan dalam program.

---

## Fitur Program

Program memiliki beberapa fitur utama:

1. Menambah data UMKM
2. Menampilkan data UMKM
3. Mengubah data UMKM
4. Menghapus data UMKM
5. Validasi input pengguna
6. Pemilihan jenis usaha Kuliner dan Fashion
7. Dummy data sebagai data awal
8. Menampilkan data UMKM secara lengkap dan singkat
9. Penerapan polymorphism melalui overloading dan overriding
10. Penerapan abstraction pada jenis usaha
11. Penerapan interface untuk menampilkan informasi UMKM

---

## Alur Program

Cara kerja program dimulai dari file `Pendataan_UMKM.java` sebagai class utama. Program membuat data event terlebih dahulu, kemudian membuat `UMKMController` untuk mengelola data UMKM.

Setelah itu, program membuat satu dummy data UMKM dengan nama usaha "Dapur Aulia". Data tersebut dimasukkan ke dalam `ArrayList` melalui `UMKMController`. Dummy data digunakan agar program sudah memiliki data ketika pertama kali dijalankan.

Setelah data awal tersedia, program menjalankan `UMKMView` untuk menampilkan menu utama kepada pengguna.

Cara kerja setiap menu dalam program adalah sebagai berikut:

1. **Tambah Data UMKM**  
   Pengguna memasukkan ID, nama usaha, nama pemilik, dan jenis usaha. Program melakukan validasi pada input yang dimasukkan. Jika ID sudah digunakan atau input tidak sesuai, program akan memberikan pesan dan meminta input kembali. Jika semua data sesuai, data UMKM akan dibuat dan disimpan ke dalam `ArrayList`.

2. **Tampilkan Data UMKM**  
   Pengguna dapat memilih jenis tampilan data yang ingin ditampilkan.

   - **Data Lengkap** digunakan untuk menampilkan ID UMKM, nama usaha, nama pemilik, jenis usaha, kategori, event, dan lokasi.
   - **Data Singkat** digunakan untuk menampilkan ID UMKM, nama usaha, nama pemilik, dan jenis usaha.

   Pemilihan tampilan ini menggunakan method `tampilkanInfo()` dan `tampilkanInfo(boolean)` pada class `UMKM`.

3. **Ubah Data UMKM**  
   Pengguna memasukkan ID UMKM yang ingin diubah. Program mencari data berdasarkan ID tersebut. Jika data ditemukan, pengguna dapat memasukkan nama usaha, nama pemilik, dan jenis usaha yang baru. Data tersebut kemudian diperbarui menggunakan setter.

4. **Hapus Data UMKM**  
   Pengguna memasukkan ID UMKM yang ingin dihapus. Program mencari data berdasarkan ID tersebut. Jika ditemukan, data akan dihapus dari `ArrayList`. Jika tidak ditemukan, program akan memberikan pesan bahwa data tidak tersedia.

5. **Keluar**  
   Jika pengguna memilih menu keluar, program akan menghentikan menu dan menampilkan pesan bahwa program telah selesai.

Selama program berjalan, validasi input digunakan untuk mencegah kesalahan seperti memasukkan huruf pada input angka, memasukkan angka kurang dari atau sama dengan 0, atau membiarkan input teks kosong. Selain itu, program menggunakan polymorphism untuk menampilkan data UMKM dengan bentuk yang berbeda melalui overloading. Polymorphism juga digunakan melalui overriding untuk menentukan kategori pada masing-masing jenis usaha.

### Screenshot Alur Program

<img width="326" height="140" alt="image" src="https://github.com/user-attachments/assets/03862ba2-abe3-4002-a72b-742d01ef6ee2" />



# Struktur Project
Program dibagi menjadi beberapa package agar setiap bagian memiliki tugas yang berbeda.
Package yang digunakan terdiri dari:

- `model` digunakan untuk class yang berhubungan dengan data. `InfoUMKM.java` digunakan sebagai interface yang menentukan method `tampilkanInfo()` untuk class yang menerapkannya.
- `controller` digunakan untuk mengelola data UMKM.
- `view` digunakan untuk tampilan dan input pengguna.
- `com.mycompany.pendataan_umkm` berisi class utama untuk menjalankan program.
  
<img width="647" height="348" alt="image" src="https://github.com/user-attachments/assets/c95206a5-0fe9-4f16-bd5b-806ad7797d2c" />


# Penerapan Konsep PBO

## 1. Access Modifier

Pada program ini, atribut dalam class dibuat menggunakan access modifier `private`.

Contohnya pada class `UMKM`:

<img width="438" height="119" alt="image" src="https://github.com/user-attachments/assets/12a341e8-dcd8-4c3e-ac74-b4006e7905c0" />
### Alasan Menggunakan Access Modifier

`private` digunakan agar atribut pada object UMKM tidak dapat diakses dan diubah secara langsung dari class lain.

Data seperti nama usaha, nama pemilik, dan jenis usaha perlu dikontrol ketika akan diubah. Oleh karena itu, data tersebut tidak dibuat `public`.

Data tersebut nantinya diakses menggunakan getter dan setter.

Dengan menggunakan access modifier, data di dalam class menjadi lebih terkontrol dan tidak dapat diubah secara langsung dari luar class.

## 2. Encapsulation

Encapsulation diterapkan dengan membuat atribut menjadi `private`, kemudian menyediakan getter dan setter untuk mengakses atau mengubah data.

Contohnya:

<img width="441" height="299" alt="image" src="https://github.com/user-attachments/assets/6ff314ae-7c05-4464-bcd7-f47d2ea193f4" />

### Alasan Menggunakan Encapsulation

Encapsulation digunakan karena program memiliki data UMKM yang perlu disimpan dan dapat diubah melalui menu program.

Jika atribut dibuat `public`, class lain dapat mengubah data secara langsung. Dengan encapsulation, data tidak dapat diubah secara langsung dan harus melalui method yang sudah disediakan.

Contohnya ketika pengguna memilih menu **Ubah Data UMKM**, program menggunakan:

<img width="539" height="82" alt="image" src="https://github.com/user-attachments/assets/9f4b75ba-51f7-4093-88c9-c1c216146fdc" />


Dengan cara tersebut, pengelolaan data menjadi lebih teratur dan data yang ada di dalam object tetap terkontrol.

### Screenshot Encapsulation

<img width="679" height="519" alt="image" src="https://github.com/user-attachments/assets/1658b045-7b80-44d6-b9b9-0254be6fad9a" />

## 3. Inheritance

Inheritance digunakan pada bagian jenis usaha.

Program memiliki satu superclass yaitu `JenisUsaha` dan dua subclass yaitu `JenisKuliner` dan `JenisFashion`.

Contoh penerapan pada class :

<img width="526" height="351" alt="image" src="https://github.com/user-attachments/assets/12393b3d-b07b-423b-a42a-d7ecffe35748" />


<img width="519" height="161" alt="image" src="https://github.com/user-attachments/assets/4699c3a6-2908-4bd9-b6b8-50a87d903dcb" />


<img width="533" height="174" alt="image" src="https://github.com/user-attachments/assets/23970156-cbe7-4829-ac1f-6fea6ca9f85d" />


### Alasan Menggunakan Inheritance

Inheritance digunakan karena Kuliner dan Fashion merupakan jenis dari usaha.

`JenisUsaha` digunakan sebagai class induk yang mewakili jenis usaha secara umum. Kemudian `JenisKuliner` dan `JenisFashion` dibuat sebagai turunannya.

Dengan cara ini, hubungan antar-class menjadi lebih jelas. Selain itu, penerapan ini memenuhi ketentuan Mini Project 2 yang meminta minimal satu superclass dan dua subclass.

Inheritance tidak diterapkan pada class `UMKM` karena Kuliner dan Fashion lebih sesuai menjadi turunan dari `JenisUsaha`, bukan turunan dari UMKM.


## 4. Polymorphism

Polymorphism diterapkan pada program melalui **overloading** dan **overriding**. Penerapannya digunakan agar method dapat digunakan dengan cara yang berbeda sesuai dengan kebutuhan program.

### a. Overloading

Overloading diterapkan pada class `UMKM` melalui dua method `tampilkanInfo()` yang memiliki parameter berbeda.

Contohnya:

<img width="367" height="225" alt="image" src="https://github.com/user-attachments/assets/51a4a9af-bec2-4aa3-bd77-5e00e54916ea" />


Kedua method tersebut memiliki nama yang sama tetapi parameter yang berbeda.

Method `tampilkanInfo()` digunakan untuk menampilkan data UMKM secara lengkap. Sedangkan `tampilkanInfo(boolean detail)` digunakan untuk menentukan tampilan data berdasarkan nilai `detail`.

Pada menu **Tampilkan Data UMKM**, pengguna dapat memilih:

1. Tampilkan Data Lengkap
2. Tampilkan Data Singkat

Jika pengguna memilih **Data Lengkap**, program menggunakan:

```java
InfoUMKM info = umkm;
info.tampilkanInfo();
```

Sedangkan untuk **Data Singkat**, program menggunakan:

```java
umkm.tampilkanInfo(false);
```

Dengan demikian, overloading pada program tidak hanya dibuat sebagai tambahan method, tetapi benar-benar digunakan untuk memberikan pilihan tampilan data UMKM kepada pengguna.

### b. Overriding

Overriding diterapkan pada class `JenisKuliner` dan `JenisFashion`.

Kedua class tersebut mengimplementasikan kembali method `getKategori()` yang berasal dari abstract class `JenisUsaha`.

Pada `JenisKuliner`, method `getKategori()` menghasilkan kategori **Kuliner**:


<img width="244" height="131" alt="image" src="https://github.com/user-attachments/assets/2c47692b-4076-4527-acd7-d40f68ffc8ae" />


Sedangkan pada `JenisFashion`, method tersebut menghasilkan kategori **Fashion**:


<img width="266" height="129" alt="image" src="https://github.com/user-attachments/assets/2c00b9a0-cf27-40a8-a539-063dd68b39ea" />


Dengan overriding, masing-masing subclass dapat memberikan hasil yang sesuai dengan jenis usahanya.

### Alasan Menggunakan Polymorphism

Polymorphism digunakan karena program membutuhkan method yang dapat digunakan dengan bentuk yang berbeda. Overloading digunakan untuk memberikan pilihan tampilan data UMKM, sedangkan overriding digunakan agar setiap jenis usaha dapat menentukan kategori sesuai dengan class masing-masing.

### Screenshot Polymorphism

**Overloading pada `UMKM.java`:**

![Overloading UMKM](dokumentasi/overloading-umkm.png)

**Overriding pada `JenisKuliner.java`:**

![Overriding Jenis Kuliner](dokumentasi/overriding-kuliner.png)

**Overriding pada `JenisFashion.java`:**

![Overriding Jenis Fashion](dokumentasi/overriding-fashion.png)

**Hasil Data Lengkap:**

![Data Lengkap](dokumentasi/data-lengkap.png)

**Hasil Data Singkat:**

![Data Singkat](dokumentasi/data-singkat.png)


## 5. Abstraction

Abstraction diterapkan dengan mengubah class `JenisUsaha` menjadi **abstract class**.

`JenisUsaha` digunakan sebagai class umum untuk jenis usaha dan memiliki abstract method `getKategori()`.

Contohnya:

```java
public abstract class JenisUsaha {

    private String namaJenis;

    public JenisUsaha(String namaJenis) {
        this.namaJenis = namaJenis;
    }

    public String getNamaJenis() {
        return namaJenis;
    }

    public void setNamaJenis(String namaJenis) {
        this.namaJenis = namaJenis;
    }

    public abstract String getKategori();
}
```

Abstract method `getKategori()` tidak memiliki isi pada class `JenisUsaha`. Method tersebut kemudian harus diimplementasikan oleh subclass seperti `JenisKuliner` dan `JenisFashion`.

### Alasan Menggunakan Abstraction

Abstraction digunakan agar `JenisUsaha` dapat menjadi dasar untuk berbagai jenis usaha tanpa menentukan kategori secara langsung pada class induk.

Kategori usaha kemudian ditentukan oleh masing-masing subclass melalui method `getKategori()`. Dengan cara ini, `JenisKuliner` dapat menghasilkan kategori **Kuliner** dan `JenisFashion` dapat menghasilkan kategori **Fashion**.

### Screenshot Abstraction

**Abstract class `JenisUsaha.java`:**

![Abstract Class Jenis Usaha](dokumentasi/abstract-jenis-usaha.png)

**Subclass `JenisKuliner.java`:**

![Jenis Kuliner](dokumentasi/jenis-kuliner.png)

**Subclass `JenisFashion.java`:**

![Jenis Fashion](dokumentasi/jenis-fashion.png)


## 6. Input Validation

Program menggunakan validasi input untuk memastikan data yang dimasukkan pengguna sesuai dengan kebutuhan program.

Contoh validasi input angka:

<img width="589" height="335" alt="image" src="https://github.com/user-attachments/assets/23cf5008-8e65-4ac2-b3af-4c84f60e7388" />


Program juga melakukan validasi untuk input teks:

<img width="517" height="112" alt="image" src="https://github.com/user-attachments/assets/e2dcdfa3-56fb-40f8-adc0-f8783c786b7a" />


Program juga melakukan pengecekan ID agar tidak terdapat dua UMKM dengan ID yang sama.

### Alasan Menggunakan Input Validation

Input validation digunakan karena program menerima data secara langsung dari pengguna.

Pengguna dapat memasukkan data yang salah, misalnya memasukkan huruf ketika program meminta ID. Jika tidak dilakukan validasi, input tersebut dapat menyebabkan error pada program.

Oleh karena itu, validasi digunakan agar program dapat menangani input yang tidak sesuai dan memberikan pesan kepada pengguna tanpa membuat program langsung berhenti.

### Screenshot Input Validation

<img width="395" height="242" alt="image" src="https://github.com/user-attachments/assets/d2e96eb5-b476-4d59-b8b1-c334658c008b" />


## 7. Dummy Data

Program memiliki satu dummy data yang dimasukkan ketika program pertama kali dijalankan.

Data yang digunakan:

<img width="469" height="167" alt="image" src="https://github.com/user-attachments/assets/b98a1a97-9c3d-44dd-9698-f366cafface6" />

### Alasan Menggunakan Dummy Data

Dummy data digunakan agar program tidak dimulai dalam keadaan kosong.

Dengan adanya dummy data, ketika pengguna memilih menu **Tampilkan Data UMKM**, sudah terdapat data yang dapat ditampilkan.

Dummy data juga memudahkan proses pengujian karena fitur tampil, ubah, dan hapus dapat langsung dicoba tanpa harus memasukkan data terlebih dahulu.

Penggunaan dummy data juga memenuhi ketentuan Mini Project 2 yang meminta minimal satu data awal dalam `ArrayList`.

### Screenshot Dummy Data

<img width="378" height="201" alt="image" src="https://github.com/user-attachments/assets/5526bf08-5b5c-495a-9adc-441329cbaf2c" />

## MVC (Model View Controller)

Sebagai nilai tambah, program menerapkan konsep **MVC (Model View Controller)**.

MVC digunakan untuk memisahkan bagian program berdasarkan tugasnya. Dalam program ini, bagian data, tampilan, dan proses pengolahan data ditempatkan pada package yang berbeda.

Struktur MVC pada program:

<img width="373" height="257" alt="image" src="https://github.com/user-attachments/assets/a5573c36-ae8e-4e6a-9d09-c99422555637" />

## 8. Interface

Interface diterapkan dengan membuat `InfoUMKM.java`.

Interface `InfoUMKM` memiliki method `tampilkanInfo()` yang menjadi aturan bagi class yang menerapkannya.

Contohnya:

```java
public interface InfoUMKM {

    void tampilkanInfo();
}
```

Class `UMKM` kemudian menerapkan interface tersebut menggunakan:

```java
public class UMKM implements InfoUMKM
```

Method `tampilkanInfo()` pada class `UMKM` menggunakan `@Override` karena method tersebut berasal dari interface `InfoUMKM`.

Contohnya:

```java
@Override
public void tampilkanInfo() {

    System.out.println("ID UMKM      : " + idUMKM);
    System.out.println("Nama Usaha   : " + namaUsaha);
    System.out.println("Nama Pemilik : " + namaPemilik);
    System.out.println("Jenis Usaha  : " + jenisUsaha.getNamaJenis());
    System.out.println("Kategori     : " + jenisUsaha.getKategori());
    System.out.println("Event        : " + event.getNamaEvent());
    System.out.println("Lokasi       : " + event.getLokasi());
}
```

Interface tersebut juga benar-benar digunakan pada saat program menampilkan data. Pada `UMKMView`, object `UMKM` digunakan melalui referensi bertipe `InfoUMKM`.

Contohnya:

```java
InfoUMKM info = umkm;
info.tampilkanInfo();
```

### Alasan Menggunakan Interface

Interface digunakan untuk menentukan method yang harus dimiliki oleh class yang menerapkannya. Pada program ini, `InfoUMKM` digunakan agar class `UMKM` memiliki method `tampilkanInfo()` yang dapat digunakan untuk menampilkan informasi UMKM.

Penerapan interface juga membuat penggunaan method lebih terstruktur karena `UMKMView` dapat memanggil method melalui tipe `InfoUMKM`.

### Screenshot Interface

**Interface `InfoUMKM.java`:**

![Interface Info UMKM](dokumentasi/info-umkm.png)

**Class `UMKM.java` menggunakan interface:**

![UMKM Implements InfoUMKM](dokumentasi/umkm-interface.png)

**Method `tampilkanInfo()` menggunakan `@Override`:**

![Override Interface](dokumentasi/override-interface.png)

**Penggunaan interface pada `UMKMView.java`:**

![Penggunaan Interface](dokumentasi/penggunaan-interface.png)


## 1. Model

Package `model` berisi class yang berhubungan dengan data program.

Class yang terdapat dalam package `model` yaitu:

<img width="373" height="110" alt="image" src="https://github.com/user-attachments/assets/02e4b6fd-9f32-490f-847c-1e444096a39b" />

Contohnya, `UMKM.java` digunakan untuk menyimpan data seperti ID UMKM, nama usaha, nama pemilik, jenis usaha, dan event.

### Alasan Menggunakan Model

Model digunakan agar bagian yang menyimpan data dipisahkan dari tampilan dan proses program.

Dengan pemisahan ini, class seperti `UMKM` dapat fokus pada data yang dimiliki oleh object UMKM tanpa harus mengatur menu atau input pengguna.

Hal ini membuat kode lebih mudah dibaca dan memudahkan jika data UMKM nantinya ingin dikembangkan.

## 2. View

Package `view` berisi class `UMKMView.java`.

View digunakan untuk menampilkan menu dan menerima input dari pengguna.

Contohnya:

<img width="451" height="212" alt="image" src="https://github.com/user-attachments/assets/67f2a070-c2f3-4984-a3d5-5c7c02a9fd18" />

### Alasan Menggunakan View

View digunakan agar bagian tampilan dan input pengguna tidak bercampur dengan bagian pengolahan data.

Dengan pemisahan ini, jika tampilan menu ingin diubah, bagian yang mengatur data UMKM tidak perlu ikut diubah.

Hal ini membuat kode program lebih teratur karena bagian View hanya berfokus pada interaksi dengan pengguna.

### Screenshot View

<img width="834" height="526" alt="image" src="https://github.com/user-attachments/assets/01d75b80-cf74-4fea-aca9-f52b3914dff3" />

<img width="707" height="532" alt="image" src="https://github.com/user-attachments/assets/f76142a7-48fa-4c99-b0c9-e0b49fb31a66" />

## 3. Controller

Package `controller` berisi class `UMKMController.java`.

Controller digunakan untuk mengatur proses pengelolaan data UMKM, seperti:

- Menambahkan data.
- Mencari data berdasarkan ID.
- Menghapus data.
- Mengakses daftar UMKM.

Contohnya:

<img width="663" height="523" alt="image" src="https://github.com/user-attachments/assets/8c49609f-ec57-4389-a263-7ecc3919756e" />

### Alasan Menggunakan Controller

Controller digunakan agar proses pengelolaan data tidak dilakukan langsung oleh bagian tampilan.

Contohnya ketika pengguna memilih menu tambah data, `UMKMView` menerima input dari pengguna. Setelah data dibuat menjadi object `UMKM`, data tersebut diberikan kepada `UMKMController` untuk dimasukkan ke dalam `ArrayList`.

Dengan begitu, View hanya berfokus pada tampilan dan input, sedangkan Controller menangani proses pengelolaan data.


## Alasan Menggunakan MVC

MVC dipilih sebagai nilai tambah karena program memiliki beberapa class dan fitur CRUD sehingga kode program mulai memiliki beberapa bagian yang berbeda.

Jika semua kode diletakkan dalam satu class, kode akan menjadi panjang dan lebih sulit untuk dibaca.

Dengan menggunakan MVC, setiap bagian program memiliki tugas yang lebih jelas. `Model` menangani data, `View` menangani tampilan dan input pengguna, sedangkan `Controller` menangani proses pengelolaan data.

Contohnya pada proses tambah data:

1. Pengguna memasukkan data melalui `UMKMView`.
2. `UMKMView` membuat object `UMKM`.
3. Data diberikan kepada `UMKMController`.
4. `UMKMController` menyimpan data ke dalam `ArrayList`.
5. Data dapat ditampilkan kembali melalui `UMKMView`.

MVC digunakan agar kode program lebih terstruktur, lebih mudah dibaca, dan lebih mudah dikembangkan jika nantinya ingin menambahkan fitur baru.

# Tampilan Program

## 1. Menu Utama

<img width="430" height="197" alt="image" src="https://github.com/user-attachments/assets/fe5a6039-ff00-4f0d-ae56-d74afdf51ca2" />

## 2. Tambah Data UMKM

<img width="506" height="241" alt="image" src="https://github.com/user-attachments/assets/1e3b3cfe-c073-4ff7-8d46-aab6c83594d8" />

## 3. Tampilkan Data UMKM
## 3. Tampilkan Data UMKM

### Data Lengkap

Screenshot hasil ketika pengguna memilih `1. Tampilkan Data Lengkap`.

### Data Singkat

Screenshot hasil ketika pengguna memilih `2. Tampilkan Data Singkat`.

<img width="380" height="318" alt="image" src="https://github.com/user-attachments/assets/31f234bd-10fd-4486-a7cc-76dad99564b5" />


## 4. Ubah Data UMKM

<img width="513" height="235" alt="image" src="https://github.com/user-attachments/assets/1010c759-7447-4c46-94b7-f73ea627f56a" />


## 5. Hapus Data UMKM

<img width="423" height="132" alt="image" src="https://github.com/user-attachments/assets/992e2190-8bc2-4f31-b193-ebbfa89f74e1" />


# Kesimpulan

Pada Mini Project 3 ini, Sistem Pendataan UMKM dikembangkan dari Mini Project 2 dengan mempertahankan konsep access modifier, encapsulation, inheritance, input validation, dummy data, dan MVC. Pada pengembangan kali ini ditambahkan konsep polymorphism, abstraction, dan interface. Polymorphism diterapkan melalui overloading pada method `tampilkanInfo()` dan overriding pada method `getKategori()`. Abstraction diterapkan melalui abstract class `JenisUsaha`, sedangkan interface diterapkan melalui `InfoUMKM` yang digunakan oleh class `UMKM`.

Setiap konsep yang diterapkan memiliki fungsi dalam program. Overloading digunakan untuk menampilkan data UMKM secara lengkap atau singkat, overriding digunakan untuk menentukan kategori sesuai jenis usaha, abstraction digunakan sebagai dasar untuk jenis usaha, dan interface digunakan sebagai aturan method untuk menampilkan informasi UMKM. Dengan penerapan konsep tersebut, program tidak hanya dapat melakukan proses CRUD, tetapi juga memiliki struktur kode yang lebih sesuai dengan konsep Pemrograman Berorientasi Objek.

# 📝 Heterogen Employee Management Java

**Sistem Pengelolaan Gaji Karyawan Heterogen berbasis Java**  
Aplikasi yang menggunakan koleksi heterogen untuk mengelola karyawan tetap dan kontrak dengan perhitungan gaji/upah menggunakan **polimorfisme**.

---

## 📖 Deskripsi Proyek

Proyek Java yang mengimplementasikan sistem pengelolaan gaji karyawan menggunakan konsep **pewarisan (inheritance)** dan **polimorfisme**. Proyek ini mencakup:

- **Karyawan.java** – Kelas dasar untuk karyawan dengan atribut NPP, nama, jumlah anak, dan metode untuk menghitung tunjangan anak.  
- **KaryawanTetap.java** – Karyawan tetap dengan gaji pokok dan perhitungan gaji total.  
- **KaryawanKontrak.java** – Karyawan kontrak dengan upah harian, jumlah hari masuk, dan perhitungan upah total.  
- **Mainheterogen.java** – Kelas utama untuk menguji koleksi heterogen menggunakan array Karyawan, mengisi data karyawan tetap dan kontrak, serta menampilkan gaji/upah total.
---

## 🧠 Teknologi
- **Java 11+**

---

## 📂 Struktur Direktori

```
Heterogeneous_Employee_Management_Java/
├── src/Latihan/
├── Mainheterogen.java       # 🛠️ Kelas utama untuk pengujian
├── Karyawan.java            # 📊 Kelas dasar karyawan
├── KaryawanKontrak.java     # 🔍 Karyawan kontrak
├── KaryawanTetap.java       # 📈 Karyawan tetap
```
---

## 🟢 Catatan

- Menggunakan **array Karyawan** untuk menyimpan objek karyawan tetap dan kontrak secara heterogen.  
- **Polimorfisme diterapkan** dengan `instanceof` untuk memanggil metode perhitungan gaji/upah yang sesuai.  
- **Tunjangan anak:** Rp100.000 per anak untuk kedua jenis karyawan.  

---

## 📈 Contoh Output

```
Karyawan Kontrak: Budi, Upah Total: 1000000.0
Karyawan Tetap: Susi, Gaji Total: 1100000.0
Karyawan Tetap: Ani, Gaji Total: 800000.0
```

---

## 👨‍💻 Pengembang
**MBAHSINGO22**  
🔗 [GitHub Profile](https://github.com/MBAHSINGO22)

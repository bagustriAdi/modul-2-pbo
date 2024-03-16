import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }
}

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Mahasiswa mahasiswa;

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Menu Peminjaman Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahDataMahasiswa();
                    break;
                case 2:
                    tampilkanDataMahasiswa();
                    break;
                case 3:
                    menuPeminjamanBuku();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (pilihan != 4);
    }

    static void tambahDataMahasiswa() {
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim;
        do {
            nim = scanner.nextLine();
            if (nim.length() != 15)
                System.out.println("Nim harus 15 Digit!!!");
        } while (nim.length() != 15);
        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = scanner.nextLine();

        mahasiswa = new Mahasiswa(nama, nim, jurusan);
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    static void tampilkanDataMahasiswa() {
        if (mahasiswa != null) {
            System.out.println("Data Mahasiswa:");
            mahasiswa.tampilDataMahasiswa();
        } else {
            System.out.println("Belum ada data mahasiswa yang ditambahkan.");
        }
    }

    static void menuPeminjamanBuku() {
        System.out.println("===== Tabel Buku =====");
        System.out.println("|| No. || Id Buku || Nama Buku || Author || Category || Stock ||");
        System.out.println("|| 1   || 388c-e681-9152 || title  || author || Sejarah  || 4 ||");
        System.out.println("|| 2   || ed90-be30-5cdb || title  || author || Sejarah  || 0 ||");
        System.out.println("|| 3   || d95e-0c4a-9523 || title  || author || Sejarah  || 2 ||");

        System.out.println("Input Id buku yang ingin dipinjam (input 99 untuk kembali)");
        System.out.print("Input: ");
        int inputBuku = scanner.nextInt();
        if (inputBuku == 99) {
            System.out.println("Kembali ke menu awal...");
        } else {
            System.out.println("Student Menu");
            System.out.println("1. Buku terpinjam");
            System.out.println("2. Pinjam buku");
            System.out.println("3. Pinjam Buku atau Logout Choose option (1-3): 3 System logout...");
        }
    }
}
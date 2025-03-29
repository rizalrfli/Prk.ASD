public class DosenMain01 {
    public static void main(String[] args) {
        DataDosen01 dsn = new DataDosen01();
        Dosen01 dsn1 = new Dosen01("D001", "Asep", true, 28);
        Dosen01 dsn2 = new Dosen01("D002", "Budi", true, 25);
        Dosen01 dsn3 = new Dosen01("D003", "Cici", false, 30);
        Dosen01 dsn4 = new Dosen01("D004", "Dedi", true, 27);
        Dosen01 dsn5 = new Dosen01("D005", "Eka", false, 29);
        Dosen01 dsn6 = new Dosen01("D006", "Feri", true, 31);
        Dosen01 dsn7 = new Dosen01("D007", "Gita", false, 26);
        Dosen01 dsn8 = new Dosen01("D008", "Hadi", true, 24);
        Dosen01 dsn9 = new Dosen01("D009", "Icha", false, 23);
        Dosen01 dsn10 = new Dosen01("D010", "Joko", true, 22);

        dsn.tambah(dsn1);
        dsn.tambah(dsn2);
        dsn.tambah(dsn3);
        dsn.tambah(dsn4);
        dsn.tambah(dsn5);
        dsn.tambah(dsn6);
        dsn.tambah(dsn7);
        dsn.tambah(dsn8);
        dsn.tambah(dsn9);
        dsn.tambah(dsn10);
        System.out.println("Data Dosen Sebelum sorting: ");
        dsn.tampil();
        System.out.println("Data yang sudah terurut menggunakan SORTING ASC: ");
        dsn.SortingASC();
        dsn.tampil();
        System.out.println("Data yang sudah terurut menggunakan SORTING DSC: ");
        dsn.SortingDSC();
        dsn.tampil();
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        dsn.insertionSort();
        dsn.tampil();
        System.out.println("=== Pencarian Data Dosen Berdasarkan Nama (Sequential Search) ===");
        dsn.PencarianDataSequential1("Budi");

        System.out.println("=== Pencarian Data Dosen Berdasarkan Usia (Binary Search) ===");
        dsn.PencarianDataBinary1(30);
    }
}

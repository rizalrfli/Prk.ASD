public class DosenMain {
    public static void main(String[] args) {
        DataDosen dsn = new DataDosen();
        Dosen dsn1 = new Dosen("D001", "Asep", true, 28);
        Dosen dsn2 = new Dosen("D002", "Budi", true, 25);
        Dosen dsn3 = new Dosen("D003", "Cici", false, 30);
        Dosen dsn4 = new Dosen("D004", "Dedi", true, 27);
        Dosen dsn5 = new Dosen("D005", "Eka", false, 29);
        Dosen dsn6 = new Dosen("D006", "Feri", true, 31);
        Dosen dsn7 = new Dosen("D007", "Gita", false, 26);
        Dosen dsn8 = new Dosen("D008", "Hadi", true, 24);
        Dosen dsn9 = new Dosen("D009", "Icha", false, 23);
        Dosen dsn10 = new Dosen("D010", "Joko", true, 22);

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
    }
}

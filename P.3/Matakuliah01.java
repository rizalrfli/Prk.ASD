public class Matakuliah01 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void cetakInfo() {
        System.out.println("Kode\t: " + kode);
        System.out.println("Nama\t: " + nama);
        System.out.println("Sks\t: " + sks);
        System.out.println("Jumlah Jam\t: " + jumlahJam);
        System.out.println("------------------------------------");
    }
    //default constructor
    public Matakuliah01 () {

    }
    //parameter constructor
    public Matakuliah01 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}

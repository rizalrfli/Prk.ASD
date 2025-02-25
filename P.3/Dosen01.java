public class Dosen01 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;
    public Dosen01(String kode, String nama, boolean jenisKelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    void cetakInfo() {
        System.out.println("Kode Dosen  : " + kode);
        System.out.println("Nama Dosen  : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "laki-laki" : "perempuan"));
        System.out.println("Usia        : " + usia + " tahun");
        System.out.println("--------------------------------------");
    }
}

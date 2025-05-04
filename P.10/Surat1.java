public class Surat1 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    public Surat1() {
    }

    public Surat1(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void print() {
        System.out.println("ID Surat     : " + idSurat);
        System.out.println("Nama         : " + namaMahasiswa);
        System.out.println("Kelas        : " + kelas);
        System.out.println("Jenis Izin   : " + jenisIzin);
        System.out.println("Durasi Izin  : " + durasi + " hari");
        System.out.println("-----------------------------");
    }
}

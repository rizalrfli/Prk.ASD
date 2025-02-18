public class Mahasiswa01 {
    String nama, nim, kelas;
    double ipk;

    void tampilInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru){
        ipk = ipkBaru;
    }
    String nilaiKinerja (){
        if (ipk >= 3.5){
            return "Kinejera sangat baik";
        } else if (ipk >= 3.0){
            return "Kinerja baik";
        } else if (ipk >= 2.0){
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    public Mahasiswa01() {
        
    }
    public Mahasiswa01(String nm, String nim, String kls, double ipk) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
}

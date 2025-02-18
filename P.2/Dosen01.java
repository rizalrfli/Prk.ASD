public class Dosen01 {
    //atribut
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;
    //method
    void tampilInformasi(){
        System.out.println("ID unik dosen: " + idDosen);
        System.out.println("Nama dosen: " + nama);
        System.out.println("Apakah dosen tersebut aktif: " + statusAktif);
        System.out.println("Tahun bergabung dosen: " + tahunBergabung);
        System.out.println("Bidang keahlian dosen: " + bidangKeahlian);
    }
    void setStatusAktif(boolean status){
        statusAktif = status;
        if (status == true){
            System.out.println("Dosen aktif");
        } else {
            System.out.println("Dosen tidak aktif");
        }
    }

    int hitungMasaKerja(int thnSkrg){
        int tahunKerja = thnSkrg - tahunBergabung;
        return tahunKerja;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
    //Konstruktor Default
    public Dosen01(){

    }
    //Konstruktor berparameter
    public Dosen01(String uid, String nm, boolean st, int tb, String bk){
        idDosen = uid;
        nama = nm;
        statusAktif = st;
        tahunBergabung = tb;
        bidangKeahlian = bk;
    }
}

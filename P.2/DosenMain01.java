public class DosenMain01 {
    public static void main(String[] args) {
        //atribut object dosen01
        Dosen01 dosen01 = new Dosen01();
        dosen01.idDosen = "1R";
        dosen01.nama = "Fajar P.hd";
        dosen01.statusAktif = true;
        dosen01.tahunBergabung = 2008;
        dosen01.bidangKeahlian = "Pemrograman";
        //method object dosen01
        dosen01.tampilInformasi();
        dosen01.setStatusAktif(true);
        System.out.println("Masa kerja : " + dosen01.hitungMasaKerja(2024) + " tahun" );
        dosen01.ubahKeahlian("mtk");
        dosen01.tampilInformasi();
        //object dosen02 menggunakan kontruktor berparameter
        Dosen01 dosen02 = new Dosen01("2K", "Samidin", true, 2009, "ipa");
        dosen02.tampilInformasi();
        dosen02.setStatusAktif(true);
        System.out.println("Masa kerja : " + dosen02.hitungMasaKerja(2024) + " tahun" );
        dosen02.ubahKeahlian("ips");
        dosen02.tampilInformasi();
    }
}
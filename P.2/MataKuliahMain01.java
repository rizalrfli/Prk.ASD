public class MataKuliahMain01 {
    public static void main(String[] args) {
        //Membuat Object mk1
        MataKuliah01 mk1 = new MataKuliah01();
        //Memberi atribut pada object mk1 menggunakan konstruktor default
        mk1.kodeMK = "1FRZ0";
        mk1.nama = "Dasar Pemrograman";
        mk1.sks = 4;
        mk1.jumlahJam = 8;
        //Memberi method pada object mk1
        mk1.tampilInformasi();
        mk1.ubahSks(3);
        mk1.tambahJam(4);
        mk1.kurangiJam(5);
        mk1.tampilInformasi();
        //Membuat object mk2 menggunakan konstruktor berparameter
        MataKuliah01 mk2 = new MataKuliah01("1JHJ9", "MTK", 5, 10);
        //Memberi method pada object mk2
        mk2.tampilInformasi();
        mk2.ubahSks(4);
        mk2.tambahJam(0);
        mk2.kurangiJam(5);
        mk2.tampilInformasi();
    }
}

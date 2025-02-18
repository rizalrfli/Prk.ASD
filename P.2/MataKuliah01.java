public class MataKuliah01 {
    //atribut
    String kodeMK, nama;
    int sks, jumlahJam;
    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah total jam pertemuan per minggu untuk Mata Kuliah: " + jumlahJam);
    }
    //method
    void ubahSks(int sksBaru){
        sks = sksBaru;
    }
    void tambahJam (int jam){
        jumlahJam += jam;
    }
    void kurangiJam (int jam){
        if (jumlahJam < jam ){
            System.out.println("Pengurangan Tidak dapat dilakukan");
        }else{
            jumlahJam -= jam;
        }
    }
    //konstruktor default
    public MataKuliah01(){

    }
    //konstruktor berparameter
    public MataKuliah01(String mk, String nm, int sks, int jm){
        kodeMK = mk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jm;
    }
}

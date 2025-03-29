public class Dosen01 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;
    public Dosen01(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    void tampilI(){
        System.out.println("Kode Dosen : "+kode);
        System.out.println("Nama Dosen : "+nama);
        if (jenisKelamin == true){
            System.out.println("Jenis Kelamin : Laki-Laki");
        } else {
            System.out.println("Jenis Kelamin : Perempuan");
        }
        System.out.println("Usia : "+usia);
    }
}

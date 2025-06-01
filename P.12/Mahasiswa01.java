public class Mahasiswa01{
    String nim,nama,kelas;
    double ipk;
    public Mahasiswa01(){
        
    }
    Mahasiswa01(String nm, String name, String kls, double ip){
        nm = nim;
        name = nama;
        kelas = kelas;
        ip = ipk;
    }
    void tampilInformasi(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
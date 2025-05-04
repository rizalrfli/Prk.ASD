public class mahasiswa1 {
    String nim, nama, kelas;
    int nilai;
    mahasiswa1(){

    }
    mahasiswa1(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }
    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}
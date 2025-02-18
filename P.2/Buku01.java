public class Buku01 {
    String judul, pengarang;
    int halaman, stok, harga;
    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
    }
    void terjual(int jml){
        stok -= jml;
    }
    void restok(int jml){
        stok += jml;
    }
    void gantiHarga (int hrg){
        harga = hrg;
    }
}

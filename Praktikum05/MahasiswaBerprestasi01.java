public class MahasiswaBerprestasi01 {
    Mahasiswa01 [] listMhs = new Mahasiswa01 [5];
    int idx;
    void tambah (Mahasiswa01 m) {
        if (idx < listMhs.length){
        listMhs[idx] = m;
        idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil () {
        if (idx == 0) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            if (listMhs[i] != null) {
                listMhs[i].tampilInformasi();
                System.out.println("----------------------------------");
            }
        }
    }
    void bubbleSort(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j] != null && listMhs[j + 1] != null) {
                    if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                        Mahasiswa01 tmp = listMhs[j];
                        listMhs[j] = listMhs[j + 1];
                        listMhs[j + 1] = tmp;
                    }
                }
            }
        }
    }
    void selectionSort(){
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[j] != null && listMhs[idxMax] != null) {
                    if (listMhs[j].ipk > listMhs[idxMax].ipk) {
                        idxMax = j;
                    }
                }
            }
            if (listMhs[idxMax] != null && listMhs[i] != null) {
                Mahasiswa01 tmp = listMhs[idxMax];
                listMhs[idxMax] = listMhs[i];
                listMhs[i] = tmp;
            }
        }
    }
    void insertionSort(){
        for (int i = 1; i < idx; i++) {
            Mahasiswa01 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1] != null && temp != null && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++){
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    void tampilPosisi(double x, int pos){
        if (pos!=-1){
            System.out.println("data mahasiswa dengan IPK: " + x + " ditemukan pada indeks" + pos);
        }
        else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + listMhs[pos].ipk);
        }
        else {
            System.out.println("data mahaiswa dengan ipk " + x + " tidak ditemukan");
        }
    }
    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right>=left) {
            mid = (left+right) / 2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            }
            else if (listMhs[mid].ipk < cari) {
                return findBinarySearch(cari, left, mid - 1);
            }
            else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}

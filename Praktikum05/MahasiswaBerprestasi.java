public class MahasiswaBerprestasi {
    Mahasiswa [] listMhs = new Mahasiswa [5];
    int idx;
    void tambah (Mahasiswa m) {
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
                        Mahasiswa tmp = listMhs[j];
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
                Mahasiswa tmp = listMhs[idxMax];
                listMhs[idxMax] = listMhs[i];
                listMhs[i] = tmp;
            }
        }
    }
    void insertionSort(){
        for (int i = 1; i < idx; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1] != null && temp != null && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}

public class DataDosen {
    Dosen [] dataDosen = new Dosen [10];
    int idx;
    void tambah(Dosen d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil() {
       for (Dosen d : dataDosen) {
           d.tampilI();
           System.out.println("----------------------------------");
       }
    }
    void SortingASC(){
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }        
    }
    void SortingDSC(){
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
    void insertionSort(){
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen tmp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j-1].usia < tmp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = tmp;
        }
    }
}

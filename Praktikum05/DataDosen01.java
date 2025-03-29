public class DataDosen01 {
    Dosen01 [] dataDosen = new Dosen01 [10];
    int idx;
    void tambah(Dosen01 d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil() {
       for (Dosen01 d : dataDosen) {
           d.tampilI();
           System.out.println("----------------------------------");
       }
    }
    void SortingASC(){
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen01 tmp = dataDosen[j];
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
            Dosen01 tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
    void insertionSort(){
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen01 tmp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j-1].usia < tmp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = tmp;
        }
    }
    void PencarianDataSequential1(String nama) {
        boolean ketemu = false;
        int jumlahHasil = 0;
        for (Dosen01 d : dataDosen) {
            if (d != null && d.nama.equalsIgnoreCase(nama)) {
                d.tampilI();
                ketemu = true;
                jumlahHasil++;
            }
        }
        if (!ketemu) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (jumlahHasil > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu dosen dengan nama " + nama);
        }
    }

    int PencarianDataBinary1(int usia) {
    SortingASC();
    int left = 0, right = idx - 1;
    boolean ketemu = false;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (dataDosen[mid].usia == usia) {
            System.out.println("Dosen dengan usia " + usia + " ditemukan:");
            int temp = mid;
            while (temp >= 0 && dataDosen[temp].usia == usia) {
                dataDosen[temp].tampilI();
                temp--;
            }
            temp = mid + 1;
            while (temp < idx && dataDosen[temp].usia == usia) {
                dataDosen[temp].tampilI();
                temp++;
            }
            ketemu = true;
            break;
            } else if (dataDosen[mid].usia < usia) {
            left = mid + 1;
            } else {
            right = mid - 1;
            }
        }
        if (!ketemu) {
            System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
        }
        return ketemu ? 1 : 0;
    }
}

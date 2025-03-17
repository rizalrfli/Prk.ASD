public class DataMhs {
    Mahasiswa1[] mahasiswa;
    int maxUTS, minUTS;
    double rataRataUAS;

    DataMhs(Mahasiswa1[] mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    int hitungMaxUTS(int l, int r) {
        if (l == r) {
            if (maxUTS < mahasiswa[l].nilaiUTS) maxUTS = mahasiswa[l].nilaiUTS;
        } else {
            int mid = (l + r) / 2;
            hitungMaxUTS(l, mid);
            hitungMaxUTS(mid + 1, r);
        }
        return maxUTS;
    }

    int hitungMinUTS(int l, int r) {
        if (l == r) {
            if (minUTS > mahasiswa[l].nilaiUTS) minUTS = mahasiswa[l].nilaiUTS;
        } else {
            int mid = (l + r) / 2;
            hitungMinUTS(l, mid);
            hitungMinUTS(mid + 1, r);
        }
        return minUTS;
    }
    int hitungRataRataUAS() {
        double total = 0;
        for (Mahasiswa1 m : mahasiswa) {
            total += m.nilaiUAS;
        }
        rataRataUAS = total / mahasiswa.length;
        return (int) rataRataUAS;
    }
}

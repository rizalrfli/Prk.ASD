public class MainDatMhs {
    public static void main (String [] args) {
        Mahasiswa1[] data = {
            new Mahasiswa1("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa1("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa1("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa1("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa1("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa1("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa1("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa1("Hadi", "220101008", 2020, 82, 84)
        };

        DataMhs dm = new DataMhs(data);
        
        dm.maxUTS = data[0].nilaiUTS;
        dm.minUTS = data[0].nilaiUTS;
        dm.hitungMaxUTS(0, data.length - 1);
        dm.hitungMinUTS(0, data.length - 1);
        dm.hitungRataRataUAS();
        
        System.out.println("Nilai UTS tertinggi: " + dm.maxUTS);
        System.out.println("Nilai UTS terendah: " + dm.minUTS);
        System.out.println("Rata-rata nilai UAS: " + dm.rataRataUAS);
    }
}


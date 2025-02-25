public class DataDosen01 {
    void dataSemuaDosen(Dosen01 [] daftarDosen) {
        for (Dosen01 dosen : daftarDosen) {
            dosen.cetakInfo();
            System.out.println("--------------------------------------");
        }
    }
    void jumlahDosenPerJenisKelamin(Dosen01 [] daftarDosen) {
        int lakiLaki = 0, perempuan = 0;
        for (Dosen01 dosen : daftarDosen) {
            if (dosen.jenisKelamin == true) {
                lakiLaki += 1;
            } else {
                perempuan += 1;
            }
        }
        System.out.println("Jumlah dosen laki-laki: " + lakiLaki + " orang");
        System.out.println("Jumlah dosen perempuan: " + perempuan + " orang");
        System.out.println("--------------------------------------");
    }
    void rerataUsiaDosenPerJenisKelamin(Dosen01 [] daftarDosen) {
        int lakiLaki = 0, perempuan = 0, totPria = 0, totWanita = 0;
        for (Dosen01 dosen : daftarDosen) {
            if (dosen.jenisKelamin == true) {
                lakiLaki += dosen.usia;
                totPria++;
            } else {
                perempuan += dosen.usia;
                totWanita++;
            }
        }
        double rataPria = (totPria == 0) ? 0 : (double) lakiLaki / totPria;
        double rataWanita = (totWanita == 0) ? 0 : (double) perempuan / totWanita;
        System.out.println("Rerata usia dosen laki-laki: " + rataPria + " tahun");
        System.out.println("Rerata usia dosen perempuan: " + rataWanita + " tahun");
        System.out.println("--------------------------------------");
    }
    void infoDosenPalingTua(Dosen01 [] daftarDosen) {
        int usiaTerbesar = 0,index = 0;
        for (int i = 0; i < daftarDosen.length; i++) {
            if (daftarDosen[i].usia > usiaTerbesar) {
                usiaTerbesar = daftarDosen[i].usia;
                index = i;
            }
        }
        System.out.println("Dosen paling tua: " + daftarDosen[index].usia + " tahun");
        System.out.println("Nama: " + daftarDosen[index].nama);
        System.out.println("--------------------------------------");
    }
    void infoDosenPalingMuda(Dosen01 [] daftarDosen) {
        int usiaTerkecil = 100, index = 0;
        for (int i = 0; i < daftarDosen.length; i++) {
            if (daftarDosen[i].usia < usiaTerkecil) {
                usiaTerkecil = daftarDosen[i].usia;
                index = i;
            }
        }
        System.out.println("Dosen paling muda: " + daftarDosen[index].usia + " tahun");
        System.out.println("Nama: " + daftarDosen[index].nama);
        System.out.println("--------------------------------------");
    }
}

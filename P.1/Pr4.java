public class Pr4 {
    public static void main(String[] args) {
        
        int[][] stokBunga = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        int[] stokMati = {-1, -2, 0, -5};
        tampilkanPendapatan(stokBunga, hargaBunga);
        tampilkanStokRG4(stokBunga, stokMati);
    }
    public static void tampilkanPendapatan(int[][] stokBunga, int[] hargaBunga) {
    System.out.println("Pendapatan tiap cabang jika semua bunga terjual habis:");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatan += stokBunga[i][j] * hargaBunga[j];
            }
    System.out.println("Royal Garden " + (i + 1) + ": Rp " + pendapatan);
            }
    }
        
    public static void tampilkanStokRG4(int[][] stokBunga, int[] stokMati) {
        System.out.println("\nStok bunga di RoyalGarden 4 sebelum pengurangan:");
        int[] stokRG4 = stokBunga[3];
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        
        for (int i = 0; i < stokRG4.length; i++) {
            System.out.println(namaBunga[i] + ": " + stokRG4[i]);
            }
        
        System.out.println("\nStok bunga di RoyalGarden 4 setelah pengurangan:");
        for (int i = 0; i < stokRG4.length; i++) {
            stokRG4[i] += stokMati[i];
            if (stokRG4[i] < 0) stokRG4[i] = 0;
            System.out.println(namaBunga[i] + ": " + stokRG4[i]);
        }
    }
}

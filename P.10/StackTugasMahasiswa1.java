public class StackTugasMahasiswa1 {
    mahasiswa1[] stack;
    int top;
    int size;
    public StackTugasMahasiswa1(int size) {
        this.size = size;
        stack = new mahasiswa1[size];
        top = -1;
    }
    public boolean isFull() {
        if (top == size - 1){
            return true;
        }
        return false;
    }
    public boolean isEmpty() {
        if (top == -1){
            return true;
        }
        return false;
    }
    public void push(mahasiswa1 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public mahasiswa1 pop() {
        if (!isEmpty()) {
            mahasiswa1 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public mahasiswa1 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    public void print() {
        System.out.println("Daftar Tugas Mahasiswa:");
        for (int i = top; i >= 0; i--) {
            System.out.println("NIM: " + stack[i].nim + ", Nama: " + stack[i].nama + ", Kelas: " + stack[i].kelas + ", Nilai: " + stack[i].nilai);
        }
    } 
    public void lihatTugasPalingBawah() {
        if (!isEmpty()) {
            mahasiswa1 bawah = stack[0];
            System.out.println("Tugas Mahasiswa Paling Bawah:");
            System.out.println("NIM: " + bawah.nim + ", Nama: " + bawah.nama + ", Kelas: " + bawah.kelas + ", Nilai: " + bawah.nilai);
        } else {
            System.out.println("Stack kosong, tidak ada data.");
        }
    }
    public int hitungJumlahTugas() {
        return top + 1;
    }
    
    
    public String konversiDesimalKeBiner(int kode){
        StackKonversi1 stack = new StackKonversi1();
        while(kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while(!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}

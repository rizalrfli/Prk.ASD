public class AntrianLayanan {
Mahasiswa01 [] data;
int front ;
int rear;
int size;
int max;
    public AntrianLayanan(int max){
    this.max = max;
    data = new Mahasiswa01[max];
    front = 0;
    rear = -1;
    size = 0;
    }
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void tambahAntrian(Mahasiswa01 mhs){
        if (isFull()){
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
            }
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println("Mahasiswa " + mhs.nim + " telah ditambahkan ke antrian");
    }
    public Mahasiswa01 layaniMahasiswa(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa01 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    public void lihatTerdepan(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }
    public void tampilkanSemua(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
            return;
        }
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for(int i =0; i < size; i++){
                int index = (front + i) % max;
                data[index].tampilkanData();
        }
    }    
    public int getJumlahAntrian(){
        return size;
    }
    public void clear(){
        if (!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("----------------");
    }
    public void LihatAkhir() {
    if (!isEmpty()) {
        System.out.println("Data antrian paling belakang:");
        data[rear].tampilkanData();
    } else {
        System.out.println("Antrian kosong!");
    }
}


}
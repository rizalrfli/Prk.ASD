
public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int jumlahSudahKRS;

    public AntrianKRS(int kapasitas) {
        max = kapasitas;
        data = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
        jumlahSudahKRS = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa m) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = m;
        size++;
    }

    public void dequeue() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa");
            return;
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Memproses:");
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahSudahKRS++;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        int i = front;
        System.out.println("Daftar Antrian:");
        for (int j = 0; j < size; j++) {
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Dua Antrian Terdepan:");
            data[front].tampilkanData();
            if (size > 1)
                data[(front + 1) % max].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian paling akhir:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void clear() {
        front = rear = -1;
        size = jumlahSudahKRS = 0;
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahKRS() {
        return jumlahSudahKRS;
    }

    public int getJumlahBelumKRS() {
        return 90 - jumlahSudahKRS;
    }
}

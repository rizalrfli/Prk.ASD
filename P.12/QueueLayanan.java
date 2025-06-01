public class QueueLayanan {
    NodeQueue front, rear;
    int size;
    public QueueLayanan() {
        front = rear = null;
        size = 0;
    }
    public boolean isEmpty() {
        return front == null;
    }
    public void enqueue(Mahasiswa mhs) {
        NodeQueue newNode = new NodeQueue(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Antrian ditambahkan: " + mhs.nama);
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");
        } else {
            System.out.println("Memanggil: " + front.data.nama);
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }
    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampilData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampilData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian:");
            NodeQueue current = front;
            while (current != null) {
                current.data.tampilData();
                current = current.next;
            }
        }
    }
    public int getSize() {
        return size;
    }
    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }
}

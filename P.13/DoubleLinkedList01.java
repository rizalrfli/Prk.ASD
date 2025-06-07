public class DoubleLinkedList01 {
    private Node01 head;
    private Node01 tail;

    public DoubleLinkedList01 () {
        this.head = null;
        this.tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(Mahasiswa01 data, String nim) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(nim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + nim + " tidak ditemukan.");
            return;
        }
        Node01 newNode = new Node01(data);

        if (current == tail) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node dengan NIM " + nim + " telah ditambahkan setelah node tersebut.");      
    }

    void print(){
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        Node01 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return;
        }

        Mahasiswa01 deletedData = head.data;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:- " + deletedData.nim + " - " + deletedData.nama);
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Node terakhir telah dihapus.");
    }

    void removeAfter(String nim) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(nim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Node dengan NIM " + nim + " tidak ditemukan atau tidak ada node setelahnya.");
            return;
        } else {
            Node01 toDelete = current.next;
            current.next = toDelete.next;
            if (toDelete.next != null) {
                toDelete.next.prev = current;
            }
            if (toDelete == tail) {
                tail = current;
            }
            System.out.println("Node dengan NIM " + toDelete.data.nim + " telah dihapus.");
        }
    }

    Node01 search(String nim) {
        Node01 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    void removeIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node01 current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Index di luar batas.");
            return;
        }

        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.println("Node dengan index " + index + " telah dihapus.");
        }
    }

    public Node01 getFirst() {
        return head;
    }

    public Node01 getLast() {
        return tail;
    }

    public Node01 getIndex(int index) {
        if (isEmpty()) {
            return null;
        }
        Node01 current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        if (current == null) {
            return null;
        }
        return current;
    }

    public int size() {
        int count = 0;
        Node01 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

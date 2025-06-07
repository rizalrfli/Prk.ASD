
public class DoubleLinkedList01 {
    Node01 head;
    Node01 tail;
    int size;

    public DoubleLinkedList01() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(Mahasiswa01 data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node01 newNode = new Node01(data);
            Node01 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Node pertama telah dihapus.");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Node terakhir telah dihapus.");
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node01 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Node pada indeks " + index + " telah dihapus.");
        }
    }

    public void removeAfter(String nim) {
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
            size--;
            System.out.println("Node setelah NIM " + nim + " telah dihapus.");
        }
    }

    public Node01 search(String nim) {
        Node01 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void print() {
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

    public Mahasiswa01 getFirst() {
        return head != null ? head.data : null;
    }

    public Mahasiswa01 getLast() {
        return tail != null ? tail.data : null;
    }

    public Mahasiswa01 getIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node01 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int getSize() {
        return size;
    }
}

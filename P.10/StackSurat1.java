public class StackSurat1 {
    Surat1[] stack;
    int top;
    int size;
    public StackSurat1(int size) {
        this.size = size;
        stack = new Surat1[size];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public void push(Surat1 srt) {
        if (!isFull()) {
            stack[++top] = srt;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack surat penuh!");
        }
    }
    public Surat1 pop() {
        if (!isEmpty()) {
            System.out.println("Surat berhasil diproses.");
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }
    public Surat1 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].print();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
        }
    }
}

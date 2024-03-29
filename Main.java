import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ToDoList<String> toDoList = new ToDoList<>();

        while (true) {
            System.out.println("1. Tambah nama pekerjaan");
            System.out.println("2. Tampilkan pekerjaan selanjutnya");
            System.out.println("3. Selesaikan pekerjaan");
            System.out.println("4. Tampilkan seluruh pekerjaan");
            System.out.println("5. Keluar");
            int pilihan = s.nextInt(); s.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan nama pekerjaan:");
                    String pekerjaan = s.nextLine();
                    toDoList.enqueue(pekerjaan);
                    break;
                case 2:
                    toDoList.first();
                    break;
                case 3:
                    toDoList.dequeue();
                    break;
                case 4:
                    toDoList.print();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class ToDoList<E> {

    Queue<E> todo;

    public ToDoList() {
        todo = new LinkedList<>();
    }

    public void enqueue(E pekerjaan) {
        todo.add(pekerjaan);
    }

    public void first() {
        if (!todo.isEmpty()) {
            System.out.println(todo.peek());
        } else {
            System.out.println("List Kosong");
        }
    }

    public void dequeue() {
        if (!todo.isEmpty()) {
            System.out.println(todo.remove() + " Berhasil dihapus");
        } else {
            System.out.println("List Kosong");
        }
    }

    public void print() {
        Iterator<E> iterator = todo.iterator();
        while (iterator.hasNext()) {
            E value = iterator.next();
            System.out.print(value + " - ");
        }
        System.out.println();
    }
}

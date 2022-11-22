public class Main {
    public static void main(String[] args) {
        Colas cola = new Colas();
        System.out.println(cola.toString());
        cola.enqueue(new Elemento());
        cola.enqueue(new Elemento());
        cola.enqueue(new Elemento());
        System.out.println(cola.toString());
        cola.dequeue();
        System.out.println(cola.toString());

    }
}

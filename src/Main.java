public class Main {
    public static void main(String[] args) {

        //Forma 1 de hacerlo
        ProcesoSuma procesoSuma1 = new ProcesoSuma("1");
        ProcesoSuma procesoSuma2 = new ProcesoSuma("2");

        Thread thread1 = new Thread(procesoSuma1);
        Thread thread2 = new Thread(procesoSuma2);

        thread1.start();
        thread2.start();

    }
}

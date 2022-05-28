public class Main {
    public static void main(String[] args) {

        //Forma 1 de hacerlo
        /*ProcesoSuma procesoSuma1 = new ProcesoSuma("1");
        ProcesoSuma procesoSuma2 = new ProcesoSuma("2");

        Thread thread1 = new Thread(procesoSuma1);
        Thread thread2 = new Thread(procesoSuma2);

        thread1.start();
        thread2.start();*/

        //Forma 2 de hacerlo

        ProcesoSuma2 procesoSuma2_1 = new ProcesoSuma2("P2_1");
        ProcesoSuma2 procesoSuma2_2 = new ProcesoSuma2("P2_2");

        procesoSuma2_2.start();
        procesoSuma2_1.start();


    }
}

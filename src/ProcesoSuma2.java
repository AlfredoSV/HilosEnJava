public class ProcesoSuma2 extends Thread{

    public ProcesoSuma2(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            System.out.println("Inicia el hilo "+this.getName());
            for (int i = 0; i <= 10;i++){
                System.out.println("Hilo "+this.getName()+":"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

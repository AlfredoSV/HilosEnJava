import java.text.Format;

public class ProcesoSuma  implements Runnable{
    private String _nombre;
    public ProcesoSuma(String nombre){
        this._nombre = nombre;
    }

    @Override
    public void run() {
        try {
            System.out.println("Inicia el hilo "+this._nombre);
            for (int i = 0; i <= 10;i++){
                System.out.println("Hilo "+this._nombre+":"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }


    }
}

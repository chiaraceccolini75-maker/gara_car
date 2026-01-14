
public class Car {
    int resa;
    int litri;
    String tipo;

    public Car(int resa, String tipo) {
        this.resa = resa;
        this.litri = 0;
        this.tipo = tipo;
    }
    
    public void guida(double km) throws Exception {
        double consumo = km * resa;
        if(consumo > litri)
        {
            throw new Exception("Carburante insufficiente x macchina!");
        }
        litri -= consumo;
    }

    public int getGas() {
        return litri;
    }

    public void addGas(int litri) {
        this.litri = litri;
    }
    
    public boolean isDisel(String tipo)
    {
        return (tipo.equals("gasolio") || tipo.equals("Gasolio"));
    }
}
 

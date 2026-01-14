
public class Moto extends Car {

    public Moto(int resa, String tipo) {
        super(resa, tipo);
    }

    @Override
    public void guida(double km) throws Exception {
        double consumo = km * (resa * 0.8);
        if(consumo > litri)
        {
            throw new Exception("Carburante insufficiente per moto!");
        }
       litri -= consumo;
    }
    
}

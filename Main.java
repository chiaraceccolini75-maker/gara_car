
public class Main {

    
    public static void main(String[] args) {
       
        Distributore_benz d = new Distributore_benz(1, 1);
        d.setDepositoVerde(500);
        d.setDepositoGasolio(500);
        
        Car ferrari = new Car(0, "verde");
        Car mercedes = new Car(0, "gasolio");
        Moto ducati = new Moto(0, "verde");
        
        try{
            d.vendi(ferrari, 30);
            d.vendi(mercedes, 30);
            d.vendi(ducati, 20);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
         Pilota p1 = new Pilota(" Ferrari ", ferrari, d);
         Pilota p2 = new Pilota("Mercedes ", mercedes, d);
         Pilota p3 = new Pilota("Ducati ", ducati, d);
         
         p1.start();
         p2.start();
         p3.start();
    }
    
}

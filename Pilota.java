
public class Pilota extends Thread{
   
    Car auto;
    Distributore_benz distributore;
    String nome;
    double distanzaTot;

    public Pilota(String nome, Car auto, Distributore_benz distributore) {
        this.nome = nome;
        this.auto = auto;
        this.distributore = distributore;
        this.distanzaTot = 0;
    }

    @Override
    public void run() {
       int giri = 35;
       double lunghezzaPista = 2;
       for(int i = 1; i <= giri; i++ )
       {
           try{
               auto.guida(lunghezzaPista);
           } catch(Exception e) {
               try{
                   distributore.vendi(auto, 20);
               } catch(Exception ex) {
                   System.out.println(nome + " Ritirato!");
                   return;
               }
           }
           distanzaTot += lunghezzaPista;
           
           try{
               Thread.sleep((int) (Math.random() * 200));
           } catch(InterruptedException ignored) {}
       }
        System.out.println(nome + " Ha finito la gara!!");
    }

    public double getDistanzaTot() {
        return distanzaTot;
    }
    
    
}

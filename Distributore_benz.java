
public class Distributore_benz {
    
    int depositoVerde;
    int depositoGasolio;
    int euroLitroVerde;
    int euroLitroGasolio;
    
  public Distributore_benz(int prezzoVerde, int prezzoGasolio){
      this.depositoVerde = 0;
      this.depositoGasolio = 0;
      this.euroLitroVerde = prezzoVerde;
      this.euroLitroGasolio = prezzoGasolio;
  }

    public void setDepositoVerde(int depositoVerde) {
        this.depositoVerde += depositoVerde;
    }

    public void setDepositoGasolio(int depositoGasolio) {
        this.depositoGasolio += depositoGasolio;
    }

    public void vendi(Car auto, int euro) throws Exception{
        if(auto.isDisel("gasolio") || auto.isDisel("Gasolio")){
            int litri = euro / euroLitroGasolio;
            if(litri > depositoGasolio){
                throw new Exception ("Gasolio insufficiente!");
            }
            depositoGasolio -= litri;
            auto.addGas(litri);
        }
        else
        {
             int litri = euro / euroLitroVerde;
            if(litri > depositoVerde){
                throw new Exception ("Benzina verde insufficiente!");
            }
            depositoVerde -= litri;
            auto.addGas(litri);
        }
    } 
    public void setEuroLitroVerde(int euroLitroVerde) {
        this.euroLitroVerde = euroLitroVerde;
    }

    public void setEuroLitroGasolio(int euroLitroGasolio) {
        this.euroLitroGasolio = euroLitroGasolio;
    }
  
    
  
}

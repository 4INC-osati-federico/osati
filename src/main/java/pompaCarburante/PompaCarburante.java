package PompaCarburante;


public class PompaCarburante {
    private String nomeDistrubutore;
    private double prezzoCarburante;
    private double capacitaCisterna;
    private double carburanteVenduto;

    public PompaCarburante(String nomeDistrubutore, double prezzoCarburante, double capacitaCisterna, double carburanteVenduto) {
        this.nomeDistrubutore = nomeDistrubutore;
        this.prezzoCarburante = prezzoCarburante;
        this.capacitaCisterna = capacitaCisterna;
        this.carburanteVenduto = carburanteVenduto;
    }
    
    public double riempimentoCisterna(){       
        return  capacitaCisterna - carburanteVenduto;
    }
    
    public double carburanteRimasto(){
        return capacitaCisterna-carburanteVenduto;        
    }
    
    public double prezzoCarbRimasto(){
        double d;
        d= carburanteRimasto()*prezzoCarburante;
        return d;
    }
    public double prezzoPieno(){
        return capacitaCisterna*prezzoCarburante;
    }
    
    public String stampa(){
        String s = "nome distrubutore: "+ nomeDistrubutore;
        s+="\nprezzo carburante al litro: "+prezzoCarburante;
        s+="\ncapacità della cisterna: "+capacitaCisterna;
        s+="\ncarburante venduto: "+carburanteVenduto;
        return s;
    }
}


package modelo;

public class Financiamiento {
    private double capital;
    private double tasa;
    private double periodo;

    public Financiamiento(double capital, double tasa, double periodo) {
        this.capital = capital;
        this.tasa = tasa;
        this.periodo = periodo;
    }
       
    public double interes(){
        return capital*tasa*periodo;
    }
    
    public double montoTotal(){
        return capital+this.interes();
    }
    
    public double cuota(){
        return this.montoTotal()/periodo;
    }
}

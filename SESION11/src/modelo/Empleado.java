package modelo;

public class Empleado extends Persona{
    private String cargo;
    private double sueldobruto;

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getSueldobruto() {
        return sueldobruto;
    }
    public void setSueldobruto(double sueldobruto) {
        this.sueldobruto = sueldobruto;
    }
    //métodos de la subclase
    public double seguropension(){
        return(this.getSueldobruto()*this.getSp());
    }
    public double sueldoneto(){
      return(this.getSueldobruto()-this.seguropension());
    }
    public String dato(){
       return(super.datos()+"    "+ 
       this.getCargo()+"    "+this.sueldoneto());  
    }
}
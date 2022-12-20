package modelo;

public class Cliente extends Persona{
 
    public String distrito;
    public String telefono;
    public double ingreso;
    public double otrosIngresos;
    public double gastoMensual;    

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getOtrosIngresos() {
        return otrosIngresos;
    }

    public void setOtrosIngresos(double otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }

    public double getGastoMensual() {
        return gastoMensual;
    }

    public void setGastoMensual(double gastoMensual) {
        this.gastoMensual = gastoMensual;
    }

    public double getSp() {
        return sp;
    }

    public void setSp(double sp) {
        this.sp = sp;
    }
    
    
    public double ahorroBrutoMensual(){
        return (this.ingreso+this.otrosIngresos)-(gastoMensual);       
    }
    public double  ahorroNetoMensual(){
        return (this.ingreso+this.otrosIngresos)-(gastoMensual+sp);
    }
    
    }

package modelo;

public class SueldoEmpleadoClass {

       
    public double sueldo1;
    public double sueldo2;
    public double sueldo3;
    public double sueldo4;
    public double sueldo5;
    
    public double getSueldo1() {
        return sueldo1;
    }

    public void setSueldo1(double sueldo1) {
        this.sueldo1 = sueldo1;
    }

    public double getSueldo2() {
        return sueldo2;
    }

    public void setSueldo2(double sueldo2) {
        this.sueldo2 = sueldo2;
    }

    public double getSueldo3() {
        return sueldo3;
    }

    public void setSueldo3(double sueldo3) {
        this.sueldo3 = sueldo3;
    }

    public double getSueldo4() {
        return sueldo4;
    }

    public void setSueldo4(double sueldo4) {
        this.sueldo4 = sueldo4;
    }

    public double getSueldo5() {
        return sueldo5;
    }

    public void setSueldo5(double sueldo5) {
        this.sueldo5 = sueldo5;
    }
    
    public double total(){
        return (this.sueldo1+this.sueldo2+this.sueldo3+this.sueldo4+this.sueldo5);
    }
    
    public double promedio(){
        return (this.total()/5);
    }
    
    public double mayor(){
            double xmy;
        xmy=this.sueldo1;
        
        if(this.sueldo2>xmy){
            xmy=this.sueldo2;
        }
        
        if(this.sueldo3>xmy){
            xmy=this.sueldo3;
        }
        
        if(this.sueldo4>xmy){
            xmy=this.sueldo4;
        }
        
        if(this.sueldo5>xmy){
            xmy=this.sueldo5;
        }
        
        return xmy;
    }
    
    public double menor(){
            double xmn;
        xmn=this.sueldo1;
        
        if(this.sueldo2<xmn){
            xmn=this.sueldo2;
        }
        
        if(this.sueldo3<xmn){
            xmn=this.sueldo3;
        }
        
        if(this.sueldo4<xmn){
            xmn=this.sueldo4;
        }
        
        if(this.sueldo5<xmn){
            xmn=this.sueldo5;
        }
        
        return xmn;
    }
    
}

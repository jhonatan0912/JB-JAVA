package modelo;

public class RegVenta {
    public double totalventas(double vt1,double vt2){
        return vt1+vt2;
    }
    
    public double totalventas(double vt1,double vt2,double vt3){
        return vt1+vt2+vt3;
    }
    
    public double totalventas(double vt1,double vt2,double vt3,double vt4){
        return vt1+vt2+vt3+vt4;
    }
    
    public double IGV(double xtotalventas){
        return xtotalventas*0.18;
    }
    
    public double ventasnetas(double xtotalventas,double xigv){
        return xtotalventas+xigv;
    }
    
    public String condicion(double xventasneta){
        if(xventasneta>=5000){
            return "Se alcanzo la meta";
        }else{
            return "No se alcanzo la meta";
        }
    }
}

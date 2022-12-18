package modelo;

public class Venta {
    private String nroventa;
    private String fecha;
    private String vendedor;
    private double venta1;
    private double venta2;
    private double venta3;
    private double venta4;
    
    //Add methods
    public Venta(double xventa1,double xventa2,double xventa3,double xventa4){
        this.venta1=xventa1;
        this.venta2=xventa2;
        this.venta3=xventa3;
        this.venta4=xventa4;
    }
    
    public double total(){
        return(this.venta1+this.venta2+this.venta3+this.venta4);
    }
    
    public double promedio(){
        return (this.total()/4);
    }
    
    public double mayor(){
        double xmy;
        xmy=this.venta1;
        if(this.venta2>xmy){
            xmy=this.venta2;
        }
        if(this.venta3>xmy){
            xmy=this.venta3;
        }
        if(this.venta4>xmy){
            xmy=this.venta4;
        }
        return (xmy);
    }
    
    public double menor(){
        double xmn;
        xmn=this.venta1;
        
        if(this.venta2<xmn){
            xmn=this.venta2;
        }
        if(this.venta3<xmn){
            xmn=this.venta3;
        }
        if(this.venta4<xmn){
            xmn=this.venta4;
        }
        return (xmn);                
    }
}

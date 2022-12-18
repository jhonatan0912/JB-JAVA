package modelo;

public class RegistroCompra {

    private String ruc;
    private String fecha;
    private String proveedor;
    
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getCompra1() {
        return compra1;
    }

    public void setCompra1(double compra1) {
        this.compra1 = compra1;
    }

    public double getCompra2() {
        return compra2;
    }

    public void setCompra2(double compra2) {
        this.compra2 = compra2;
    }

    public double getCompra3() {
        return compra3;
    }

    public void setCompra3(double compra3) {
        this.compra3 = compra3;
    }

    public double getCompra4() {
        return compra4;
    }

    public void setCompra4(double compra4) {
        this.compra4 = compra4;
    }
    
   //Class methods
    
    public double total(){
        return (this.compra1+this.compra2+this.compra3+this.compra4);
    }
    
    public double promedio(){
        return (this.total()/4);
    }
    
    public double mayor(){
        double xmy;
        xmy=this.compra1;
        
        if(this.compra2>xmy){
            xmy=this.compra2;
        }
        
        if(this.compra3>xmy){
            xmy=this.compra3;
        }
        
        if(this.compra4>xmy){
            xmy=this.compra4;
        }
        
        return xmy;
    }
    
    public double menor(){
        double xmn;
        xmn=this.compra1;
        
        if(this.compra2<xmn){
            xmn=this.compra2;
        }
        
        if(this.compra3<xmn){
            xmn=this.compra3;
        }
        
        if(this.compra4<xmn){
            xmn=this.compra4;
        }
        return xmn;
    }
    
}

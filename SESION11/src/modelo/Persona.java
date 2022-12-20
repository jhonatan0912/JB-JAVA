package modelo;

public class Persona {
    //agregarar campos
    private String dni;
    private String nombre;
    private int edad;
    private char sexo;
    protected double sp; //seguro de pensión
 
    
    public String getDni() {
        return dni;
    }

    
    public void setDni(String dni) {
        this.dni = dni;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public double getSp() {
        return sp;
    }

    public void setSp(double sp) {
        this.sp = sp;
    }
    
    //metodo datos
    public String datos(){
       return(this.getDni()+"    "+this.getNombre()+"     "+this.getEdad()+"       "+this.getSexo());
    }
}
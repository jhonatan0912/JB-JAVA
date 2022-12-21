package modelo;

public class Operaciones {
    public double getOperacion(int tipoOperacion,double numero1,double numero2){
                
        double resultado=0.0;
        
        if(tipoOperacion == 1){
            Suma objSuma = new Suma();
            resultado=objSuma.operaciones(numero1, numero2);
        }else if(tipoOperacion == 2){
            Resta objResta = new Resta();
            resultado=objResta.operaciones(numero1, numero2);
        }else if(tipoOperacion == 3){
            Multiplicacion objMultiplicacion = new Multiplicacion();
            resultado=objMultiplicacion.operaciones(numero1, numero2);
        }else if(tipoOperacion == 4){
            Division objDivision = new Division();
            resultado=objDivision.operaciones(numero1, numero2);
        }
        
        return resultado;
    }
}

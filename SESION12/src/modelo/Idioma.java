package modelo;

public class Idioma {
    public String getIdioma(int tipoidioma,int xnum){
        
        String xcadena= new String();
        
        if(tipoidioma==1){
            Español objEspañol= new Español();
            xcadena = objEspañol.traducir(xnum);
        }else if(tipoidioma==2){
            Ingles objIngles= new Ingles();
            xcadena = objIngles.traducir(xnum);
        }else if(tipoidioma==3){
            Frances objFrances= new Frances();
            xcadena = objFrances.traducir(xnum);
        }else if(tipoidioma==4){
            Italiano objItaliano= new Italiano();
            xcadena = objItaliano.traducir(xnum);
        }
        return xcadena;
    }
}

package modelo;

import interfaces.INumeros;

public class Ingles implements INumeros{
    public String traducir(int xnum){
        String Aingles[]={"one","two","three","four","five","six","seven","eight","nine","ten"};
        
        return Aingles[xnum];
    }
}

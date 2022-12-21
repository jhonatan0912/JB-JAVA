package modelo;

import interfaces.INumeros;

public class Italiano implements INumeros{
    public String traducir(int xnum){
    String AItaliano[]={"uno","due","tre","quattro","cinque","sei","sette","otto","nove","dieci"};
    return AItaliano[xnum];
    }
}

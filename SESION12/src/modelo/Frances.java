package modelo;

import interfaces.INumeros;

public class Frances implements INumeros{
    public String traducir(int xnum){
        String AFrances[]={"un","deux","trois","quatre","cinq","six","sept","huit","neuf","dix"};
        return AFrances[xnum];
    }
}

package modelo;

import interfaces.INumeros;
/**
 *
 * @author JHONATAN
 */
public class Español implements INumeros{
        public String traducir(int xnum){
            String AEspañol[]={"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
            return AEspañol[xnum];
        }
}

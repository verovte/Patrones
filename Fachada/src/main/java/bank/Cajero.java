package bank;

import java.io.IOException;
import utilidad.Input;

/*
 * @author verovte
 */
public class Cajero{

        /* ... */
    Input i = new Input();

    public int introducirCantidad() throws IOException{
        int cantidad;
        System.out.println("INTRODUZCA CANTIDAD A RETIRAR");
        cantidad = i.tryIntegerPositivo();
        return cantidad;
    }

    public boolean tieneSaldo(int cantidad){
        if(cantidad>1000){
            return false;
        }else{
            return true;
        }
    }

    public String imprimirTicket(double saldo){
        return "SALDO RESTANTE: "+saldo;
    }

    void expedirDinero() {
        System.out.println("POR FAVOR RETIRELO DEL CAJERO");
    }
    
    public void alFallar(){
        System.out.println("SALDO NO DISPONIBLE EN ESTE CAJERO, POR FAVOR BUSQUE OTRO");
    }

}

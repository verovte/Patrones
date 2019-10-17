package bank;

import java.io.IOException;

/**
 *
 * @author verovte
 */
public class Main {
    
    public static void main(String[] args) throws IOException{

        FachadaCajero cajero_automatico = new FachadaCajero();

        cajero_automatico.introducirCredenciales();

        cajero_automatico.sacarDinero();

    }
    
}

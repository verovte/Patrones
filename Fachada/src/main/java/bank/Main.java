package bank;
/**
 *
 * @author verovte
 */
public class Main {
    
    public static void main(String[] args){

        FachadaCajero cajero_automatico = new FachadaCajero();



        cajero_automatico.introducirCredenciales();

        cajero_automatico.sacarDinero();

    }
    
}

package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import utilidad.Input;

/*
 * @author verovte
 */
public class Autentificacion{

        /* ... */
    Input input = new Input();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public boolean leerTarjeta(){return true;}

    public String introducirClave() throws IOException{
      String mensaje;
      System.out.println("INTRODUZCA CLAVE");
      mensaje = br.readLine();
      return mensaje;
    }

    public boolean comprobarClave(String clave){
        return clave.equalsIgnoreCase("212A");
    }

    public Cuenta obtenerCuenta(){
        Cuenta cuenta = new Cuenta(500);
        return cuenta;}

    public void alFallar(){
        System.out.println("CLAVE INCORRECTA: INTENTE LA OPERACIÓN DE NUEVO");
    }

}

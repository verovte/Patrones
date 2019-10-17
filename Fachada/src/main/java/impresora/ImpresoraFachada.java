package impresora;

public class ImpresoraFachada {
     
    Impresora impresora;

    public ImpresoraFachada() {

        super();

 	impresora= new Impresora();

 	impresora.setColor(true);

 	impresora.setHoja("A4");

 	impresora.setTipoDocumento("PDF");

    }
    
    public String imprimir() {

 	return "La impresión ha sido realizada con éxito\nTipo de documento: " + impresora.getTipoDocumento() + ", Color: " + impresora.getColor() + ", Formato hoja: " + impresora.getHoja();

    }
}

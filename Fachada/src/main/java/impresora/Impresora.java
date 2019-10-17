package impresora;

public class Impresora {
    
    private String tipoDocumento;

    private String hoja;

    private boolean color;
    

    public String getTipoDocumento() {

 	return tipoDocumento;

    }

    public void setTipoDocumento(String tipoDocumento) {

 	this.tipoDocumento = tipoDocumento;

    }

    public void setHoja(String hoja) {
 	this.hoja = hoja;
    }

    public String getHoja() {

 	return hoja;

    }

    public void setColor(boolean color) {
 	this.color = color;
    }

    public boolean getColor() {

 	return color;

    }

    public String imprimir() {

 	return "La impresión ha sido realizada con éxito\nTipo de documento: " + tipoDocumento + ", Color: " + color + ", Formato hoja: " + hoja;

    }
}

package aerolineas;

public class Persona {
    int codigo;
    String nomyape;

    public Persona(int codigo, String nomyape) {
        this.codigo = codigo;
        this.nomyape = nomyape;
    }

    public Persona() {
        this.codigo = 0;
        this.nomyape = "";
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomyape() {
        return nomyape;
    }

    public void setNomyape(String nomyape) {
        this.nomyape = nomyape;
    }
    
    

}

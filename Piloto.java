package aerolineas;

import javax.swing.JOptionPane;

public class Piloto extends Persona{
    int horasVuelo;

    public Piloto(int horasVuelo, int codigo, String nomyape) {
        super(codigo, nomyape);
        this.horasVuelo = horasVuelo;
    }

    public Piloto(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
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
    
    public static Piloto registrar() {
    String nomyape = JOptionPane.showInputDialog("Ingrese nombre completo del piloto (nombre apellido)");
    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del piloto"));
    int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas de vuelo del piloto"));


    return new Piloto(horas, codigo, nomyape);
    }
    
    
}

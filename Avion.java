package aerolineas;

import javax.swing.JOptionPane;

public class Avion {
    
    int codigo;
    int capacidad;
    String aerolinea;

    public Avion(int codigo, int capacidad, String aerolinea) {
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.aerolinea = aerolinea;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    
    //registrar
     public static Avion registrar() {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la aerolínea");
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese capacidad de pasajeros"));
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo"));

        
        return new Avion(codigo,capacidad, nombre);
    }
    
}

package aerolineas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class MiembroTripulacion extends Persona{
        LocalDate fechanac;

    public MiembroTripulacion(LocalDate fechanac, int codigo, String nomyape) {
        super(codigo, nomyape);
        this.fechanac = fechanac;
    }

    public MiembroTripulacion(LocalDate fechanac) {
        this.fechanac = fechanac;
    }

    public LocalDate getFechanac() {
        return fechanac;
    }

    public void setFechanac(LocalDate fechanac) {
        this.fechanac = fechanac;
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

    public static MiembroTripulacion registrar() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String nomyape = JOptionPane.showInputDialog("Ingrese nombre completo (nombre apellido)");
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código"));
        String sfecha = JOptionPane.showInputDialog("Ingrese fecha de nacimiento (dd/MM/yyyy)");
        LocalDate fechanac = LocalDate.parse(sfecha, formato);

        return new MiembroTripulacion(fechanac, codigo, nomyape);
    }
        
}

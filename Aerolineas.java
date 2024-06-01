package aerolineas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

public class Aerolineas {

    public static void main(String[] args) {
        
        List<Vuelo> vuelos = new ArrayList<>();

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de vuelos a registrar: "));
        for (int i = 0; i < n; i++) {
            vuelos.add(Vuelo.registrar());
        }

        String mensaje = "Datos ingresados:\n";
        for (Vuelo v : vuelos) {
            mensaje += "Fecha del vuelo: " + v.getFecha() + "\n";
            mensaje += "Nombre de la aerolínea: " + v.getAvion().getAerolinea() + "\n";
            mensaje += "Cantidad de pilotos registrados: " + v.getPilotos().size() + "\n";
            for (int j = 0; j < v.getPilotos().size(); j++) {
                Piloto piloto = v.getPilotos().get(j);
                mensaje += "Piloto " + (j + 1) + " - Nombre: " + piloto.getNomyape() + ", Código: " + piloto.getCodigo() + ", Horas de vuelo: " + piloto.getHorasVuelo() + "\n";
            }
            mensaje += "Cantidad de tripulantes registrados: " + v.getTripulacion().size() + "\n";
            for (int j = 0; j < v.getTripulacion().size(); j++) {
                MiembroTripulacion tripulante = v.getTripulacion().get(j);
                mensaje += "Tripulante " + (j + 1) + " - Nombre: " + tripulante.getNomyape() + ", Código: " + tripulante.getCodigo() + ", Fecha de nacimiento: " + tripulante.getFechanac() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}


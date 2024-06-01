package aerolineas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Vuelo {
    
    private LocalDate fecha;
    private Avion avion;
    private List<Piloto> pilotos = new ArrayList<>();
    private List<MiembroTripulacion> tripulacion = new ArrayList<>();

    public Vuelo(LocalDate fecha, Avion avion, List<Piloto> pilotos, List<MiembroTripulacion> tripulacion) {
        this.fecha = fecha;
        this.avion = avion;
        this.pilotos = pilotos;
        this.tripulacion = tripulacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Avion getAvion() {
        return avion;
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public List<MiembroTripulacion> getTripulacion() {
        return tripulacion;
    }
    
    
    public static Vuelo registrar() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(JOptionPane.showInputDialog("Ingrese fecha del vuelo (dd/MM/yyyy)"), formato);
        Avion avion = Avion.registrar();
        List<Piloto> pilotos = new ArrayList<>();
        List<MiembroTripulacion> tripulacion = new ArrayList<>();

        int cantidadPilotos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de pilotos a registrar"));
        for (int i = 0; i < cantidadPilotos; i++) {
            pilotos.add(Piloto.registrar());
        }

        int cantidadTripulacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de miembros de tripulación a registrar"));
        for (int i = 0; i < cantidadTripulacion; i++) {
            tripulacion.add(MiembroTripulacion.registrar());
        }

        return new Vuelo(fecha, avion, pilotos, tripulacion);
    }
    
    
}


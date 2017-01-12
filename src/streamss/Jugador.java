/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamss;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ironkk
 */
public class Jugador {

    private String nombre;
    private LocalDate nacimiento;
    private int canastas;
    private Equipo equipo;
    Map<String, List<Equipo>> myStream = new HashMap<>();

    public Jugador(String nombre, LocalDate nacimiento, int canastas, Equipo equipo) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.canastas = canastas;
        this.equipo = equipo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + ", canastas=" + canastas + ", equipo=" + equipo + '}';
    }

}

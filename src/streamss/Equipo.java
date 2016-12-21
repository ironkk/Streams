/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamss;

/**
 *
 * @author ironkk
 */
public class Equipo {

    private String nombre;
    private String ciudad;

    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;

    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", ciudad=" + ciudad + '}';
    }
}

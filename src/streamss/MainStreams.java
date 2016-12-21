package streamss;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static javafx.scene.input.KeyCode.R;

/**
 *
 * @author ironkk
 */
public class MainStreams {

    public static void main(String[] args) {
        Equipo eq1 = new Equipo("Equipo 1", "Barcelona");
        Equipo eq2 = new Equipo("Equipo 2", "Igualada");
        Equipo eq3 = new Equipo("Equipo 3", "Madrid");
        Jugador j1 = new Jugador("Xavi", LocalDate.of(1988, 4, 4), 900, eq1);
        Jugador j2 = new Jugador("Mark", LocalDate.of(1992, 2, 23), 480, eq1);
        Jugador j3 = new Jugador("Reina", LocalDate.of(1991, 1, 12), 300, eq2);
        Jugador j4 = new Jugador("Davisiko", LocalDate.of(1995, 5, 3), 800, eq2);
        Jugador j5 = new Jugador("Soriano", LocalDate.of(1990, 11, 22), 730, eq3);
        Jugador j6 = new Jugador("Pepe", LocalDate.of(1995, 11, 9), 555, eq3);

        List<Jugador> listaJugadores = new ArrayList<>();
        listaJugadores.add(j1);
        listaJugadores.add(j2);
        listaJugadores.add(j3);
        listaJugadores.add(j4);
        listaJugadores.add(j5);
        listaJugadores.add(j6);
        
    
        
       // Stream<Jugador> myStream = listaJugadores.stream();

        System.out.println("Devolver con una lista  todos los jugadores que hayan obtenido más de 500 canastas.");
        listaJugadores.stream()
                .filter(j -> j.getCanastas() > 500)
                .forEach(System.out::println);

 
        System.out.println("Devolver con una lista  todos los jugadores que hayan obtenido entre 200 y 500 canastas.");
        listaJugadores.stream()
                .filter(j -> j.getCanastas() > 200 && j.getCanastas() < 500)
                .forEach(System.out::println);
        
        System.out.println("Devolver en una lista exclusivamente los nombres de los jugadores que satisfacen  los requisitos del 1.3");
        listaJugadores.stream()
                .filter(j -> j.getCanastas() > 200 && j.getCanastas() < 500)
                .map(Jugador::getNombre)
                .forEach(System.out::println);

        System.out.println("Devolver con una lista todos los jugadores ordenados por la fecha de nacimiento.");
        listaJugadores.stream()
                .sorted(Comparator.comparing(Jugador::getNacimiento))
                .forEach(System.out::println);
        
        System.out.println("Devolver con una lista todos los jugadores ordenados por número de canastas.");
        listaJugadores.stream()
                .sorted(Comparator.comparing(Jugador::getCanastas))
                .forEach(System.out::println);
        

        System.out.println("Devolver con una lista con los cinco jugadores que hayan realizado más canastas.");
        listaJugadores.stream()
                .sorted(Comparator.comparing(Jugador::getCanastas))
                .limit(5)
                .forEach(System.out::println);
        
        
        System.out.println("Devolver con una lista todos los jugadores que satisfacen el punto 1.3 ordenados por la fecha de nacimiento de manera descendente.");
        

        System.out.println("Devolver con una lista todos los jugadores que satisfacen el filtro del punto 1.3 ordenadosen primer lugar por número de canastas y en segundo lugar (si tienen el mismo número de canastas) por la fecha de nacimiento.");
        
        
        System.out.println("Devolver el jugador que ha realizado el mínimo número de canastas.");
        
        System.out.println(listaJugadores.stream()
                .reduce((x, y) -> x.getCanastas() < y.getCanastas() ? x : y));
        
 
        
        System.out.println("Devolver el jugador que ha realizado el máximo número de canastas.");
        System.out.println(listaJugadores.stream()
                .reduce((x, y) -> x.getCanastas() > y.getCanastas() ? x : y));

        
        System.out.println("Devolver la media de canastas de todos los jugadores.");
        System.out.println(listaJugadores.stream()
                .collect(Collectors.averagingInt(j -> j.getCanastas())));

        System.out.println("Devolver con una lista todos los jugadores que pertenezcan a equipos cuya localidad sea Igualada.");
        listaJugadores.stream()
                .filter(j -> j.getEquipo().getCiudad().toLowerCase().equals("igualada"))
                .forEach(System.out::println);
     
        System.out.println("Devolver con un boolean si hay algún jugador que ha conseguido más de 4.000 canastas");
        System.out.println(listaJugadores.stream()
                .anyMatch(j -> j.getCanastas() > 4000));
        
        System.out.println("Devolver con un boolean si todos los jugadores han conseguido más de 50 canastas.");
        System.out.println(listaJugadores.stream()
                .allMatch(j -> j.getCanastas() > 50));
        
  
        System.out.println("Devolver con un boolean si todos los jugadores del primer equipo añadido han conseguido más de 50 canastas.");
        System.out.println(listaJugadores.stream()
                .filter(j -> j.getEquipo() == eq1)
                .allMatch(j -> j.getCanastas() > 50));

        
        // Map creado arriba!
        System.out.println("Devolver un Map<String, List<Equipo>> agrupando los equipos que pertenecen a una misma localidad.");
        System.out.println(listaJugadores.stream().map((Function<? super Jugador, ? extends R>) myMap));
        System.out.println(Stream<String, List<Equipo>> myNewStream = 
             listaJugadores.stream().map(j);

        
        System.out.println("Devolver la suma del número de canastas de todos los jugadores.");
        System.out.println(listaJugadores.stream()
                .map(Jugador::getCanastas)
                .reduce(0, (a, b) -> a + b));

        
        System.out.println("Todos los jugadores de un equipo en concreto.");

    }

}

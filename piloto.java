
package pruebas;

/**
 *
 * @author Omar_Anzures
 */
public class piloto {
    
    String nombre;
    int edad;
    int campeonatosGanados;
    int numeroCarreras;
    double mediaDePuntosPorTemporada;
    
    //metodo constructor de la clase piloto
    public piloto( String nombre,
                   int edad,
                   int campeonatosGanados,
                   int numeroCarreras,
                   double mediaDePuntosPorTemporada) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.campeonatosGanados = campeonatosGanados;
        this.numeroCarreras = numeroCarreras;
        this.mediaDePuntosPorTemporada = mediaDePuntosPorTemporada;
    }

    
   //metodos
   public String getAtributos() {
       return "Nombre: " + this.nombre + "\n" +
              "Edad: " + this.edad + "\n" +
               "Campeonatos ganados: " + this.campeonatosGanados +  "\n" +
              "Numero de carreras: " + this.numeroCarreras + "\n" +
              "Media de puntos: " + this.mediaDePuntosPorTemporada;
   }
        
}

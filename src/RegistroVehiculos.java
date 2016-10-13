/**
 * Created by magner on 7/10/16.
 */
import java.util.*;
import java.util.stream.Collectors;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    //Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    //lo puedes omitir si trabajas con java 7
    public Optional<Coche> obtenerVehiculo(String matricula){
        return null;
    }
    public Optional <Coche> obtenerVehiculoPrecioMax(){
        return null;
    }

    public void registrarVehiculo(Coche coche){
        coches.add(coche);
    }

    public void eliminarVehiculo(String matricula){
            for(Coche coche : coches){
                if(coche.getMatricula().equals(matricula)){
                    coches.remove(coche);
                }
            }
    }

    public List <Coche> obtenerVehiculosMarca(String marca){
        return null;
    }
    public List <Coche> obtenerTodos(){
        return null;
    }
}

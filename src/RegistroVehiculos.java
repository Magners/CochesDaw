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
        Coche aux=null;
            for(Coche coche : coches){
                if(coche.getMatricula().equals(matricula)){
                    aux=coche;
                }
            }
        if(aux!=null) {
            coches.remove(aux);
        }
    }

    public List <Coche> obtenerVehiculosMarca(String marca){
        List<Coche> vehiculos = new ArrayList<>();
        for(Coche coche : coches){
            if(coche.getMarca().equals(marca)){
                vehiculos.add(coche);
            }
        }
        return vehiculos;
    }
    public List <Coche> obtenerTodos(){
        return new ArrayList<>(coches);
    }
}

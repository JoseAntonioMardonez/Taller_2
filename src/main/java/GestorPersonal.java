import java.util.ArrayList;
import java.util.List;

public class GestorPersonal {
    //Atributos
    private List<Persona> personas;
    //Constructor
    public GestorPersonal(){
        this.personas = new ArrayList<Persona>();
    }
    //Métodos
    public void agregarPersona(Persona persona){
        this.personas.add(persona);
    }
    public void agregarAutomovil(){

    }
    public void agregarCorreo(){

    }
    public void obtenerPersonasPorMarcaAutomovil(){

    }
    public void obtenerPersonasPorNombre(){

    }
    public void buscarPersonaPorRUT(String rut){
        for(Persona persona : this.personas){
            if(persona.getRut().equals(rut)){
                System.out.println("Persona encontrada.");
                return;
            }
        }
        System.out.println("Persona no encontrada.");
    }
    public String toString() {
        String datos = "";

        for(Persona persona : personas) {
            datos += persona.toString() + "\n";
        }
        return datos;
    }
}

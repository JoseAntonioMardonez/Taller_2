import java.util.ArrayList;

public class GestorPersonal {
    //Atributos
    private ArrayList<Persona> personas;
    //Constructor
    public GestorPersonal(){
        this.personas = new ArrayList<Persona>();
    }
    //Métodos
    public void agregarPersona(Persona personanueva){
        String rut = personanueva.getRut();
        for(Persona persona : this.personas){
            if(persona.getRut().equals(rut)){
                System.out.println("El RUT ya existe.");
                return;
            }
        }
        this.personas.add(personanueva);
        System.out.println("Persona agregada.");
    }
    public void agregarAutomovil(Automovil automovil, Persona persona){

    }
    public void agregarCorreo(CorreoElectronico correo, Persona persona){

    }
    public void obtenerPersonasPorMarcaAutomovil(ArrayList personas, String marca){


    }
    public void obtenerPersonasPorNombre(ArrayList personas, String nombre){

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

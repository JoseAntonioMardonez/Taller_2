public class Launcher {
    public static void main(String[] Args){
        GestorPersonal gestorPersonal = new GestorPersonal();
        Motor motor1 = new Motor(120003,250);
        Chasis chasis1 = new Chasis(2022001,"acero");
        Automovil automovil1 = new Automovil("Toyota","Rav4",2019,10000000,motor1,chasis1);
        Persona persona1 = new Persona("Antonio","Rojel","10304550-9");


    }
}

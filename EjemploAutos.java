

public class EjemploAutos {
    public static void main(String[] args) {
        Autos chrevrolet = new Autos();
        chrevrolet.marca= " chevrolet";/// Heredando rpopiedades
        chrevrolet.modelo=" Aveo";///
        chrevrolet.color=" ROJO";
        chrevrolet.cilindraje= 3.7;


        Autos Toyota = new Autos();
        Autos Jtejour = new Autos();
        Autos Kia = new Autos();

        System.out.println(chrevrolet.detalleAuto());
        System.out.println(chrevrolet.acelerar(3500));
        System.out.println(chrevrolet.frenar(210,200,62));
        System.out.println(Toyota.detalleAuto());
        System.out.println( Jtejour.detalleAuto());


    }
}

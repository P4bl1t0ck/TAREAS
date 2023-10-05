public class Autos {

//Atributos
    String marca=" CHREVROLET JAJA ";
    String modelo;
    String color=" rojo ";
    Double cilindraje;

    /// Metodos
    public String detalleAuto()
    {
        // intanciar
        /*String color = "verde";*/
        /*System.out.println("Marca" + this.marca);
        System.out.println("Modelo" +this.modelo);
        System.out.println("Diseño" +this.color );
        System.out.println("Cilindraje" +this.cilindraje);*/
        String da = " Modelo\n" + this.modelo +/// Añade datos
                " Diseño\n" + this.color +
                " Cilindraje\n" + this.cilindraje;
        return da;///
    }
    public String acelerar(int rpm)
    {
        return "El auto" + this.marca + "Esta acelerando a " + rpm + "rpm";
    }
    public String frenar(int m,int rpm,int t){
        return "El auto " + this.marca + "Esta acelerando a " + rpm + " Y recorrio una distancia de " + m +"en un tiempo de " + t+" Segundos";
    }
    /// Los metodos son las
}

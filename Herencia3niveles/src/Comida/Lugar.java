package Comida;

public class Lugar {
    /* ATRIBUTOS */
    protected String Pais; // País de origen
    protected String Ciudad;

    /* CONSTRUCTOR */

    public Lugar(String pais, String ciudad) {
        Pais = pais;
        Ciudad = ciudad;
    }

    /* GETTER */

    public String getPais() {
        return Pais;
    }

    public String getCiudad() {
        return Ciudad;
    }
}

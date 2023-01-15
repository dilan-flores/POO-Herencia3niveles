package Comida;

public class Ingredientes extends Plato{
    /* ATRIBUTOS */
    private String Ingrediente_P; // Ingrediente principal
    private String Ingrediente_S; // Ingrediente secundario

    /* CONSTRUCTOR */

    public Ingredientes(String pais, String ciudad, String nombre_P, int tiempo, String ingrediente_P, String ingrediente_S) {
        super(pais, ciudad, nombre_P, tiempo);
        Ingrediente_P = ingrediente_P;
        Ingrediente_S = ingrediente_S;
    }

    /* MÉTODO */
    public void Imprimir(){
        super.Imprimir();
        System.out.println("Ingrediente Principal: "+ Ingrediente_P+
                "\nIngrediente Secundario: " + Ingrediente_S);
    }
}

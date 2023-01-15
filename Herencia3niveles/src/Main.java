import java.util.ArrayList;
import java.util.Scanner;

import Artistas.Arte;
import Comida.Ingredientes;
import VJuegos.Personaje;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        ArrayList VJ = new ArrayList(); // Array de Video Juegos
        ArrayList A = new ArrayList(); // Array de Artistas
        ArrayList C = new ArrayList();  // Array de Comida
        while(!salir){
            switch(Menu()){
                case 1:
                    VJ.add(new Personaje("Mario-Kart",1992,"selva",8, "Dilan","Mario","Carro"));
                    VJ.add(new Personaje("Mario-Kart",1992,"Nieve",8, "Alexander","Yoshi","Carro"));

                    for(int i = 0; i<2; i++){
                        Personaje P = (Personaje) VJ.get(i);
                        System.out.println("\n**** Personaje "+ (i+1) +" ****\n");
                        P.Imprimir();
                    }
                    break;
                case 2:
                    A.add(new Arte("Ramón Ayala","Cantante","Voz","Daddy Yankee","Con calma","Urbano Latino",2019));
                    A.add(new Arte("Oswaldo Guayasamin","Pintor","Pincel","Oswaldo Guayasamin","Ternura","Expresionismo",1989));

                    for(int i = 0; i<2; i++){
                        Arte Ar = (Arte)A.get(i);
                        System.out.println("\n**** Artista "+ (i+1) +" ****\n");
                        Ar.Imprimir();
                    }
                    break;
                case 3:
                    C.add(new Ingredientes("Espania","Valencia","Paella de Mariscos",30,"Camaron","Langosta"));
                    C.add(new Ingredientes("Tailandia","Laos","Som Tam",20,"Papaya","Zanahoria, Pescado"));

                    for(int i = 0; i<2; i++){
                        Ingredientes Co = (Ingredientes)C.get(i);
                        System.out.println("\n**** Comida "+ (i+1) +" ****\n");
                        Co.Imprimir();
                    }
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }
    }
    private static int Menu(){
        Scanner entrada = new Scanner(System.in);
        int op ;
        do{
            System.out.println("\n-----       MENU        -----");
            System.out.println("    1.- Video Juegos");
            System.out.println("    2.- Artistas");
            System.out.println("    3.- Comida");
            System.out.println("    4.- Salir");
            System.out.println(">> ");
            op = entrada.nextInt();

            if(op<1 || op>4){
                System.out.println("OPCIÓN NO VÁLIDA");
            }
        }while(op<1 || op>4);
        return op;
    }
}
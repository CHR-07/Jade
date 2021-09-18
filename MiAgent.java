package miagent;
import jade.core.Agent;
/**
 *
 * @author Christian Alberto Hernández Robles
 */
public class MiAgent extends Agent {
    public void setup(){
        System.out.println("GRADIENTE DESCENDIENTE");
         int x_inicial = (int)(Math.random()*10+1);
        float alpha = (float) 0.1;
        int n_iteraciones = 100;

        float y = 0;

        float x = x_inicial;
        for (int i= 0; i<n_iteraciones; i++) {
                System.out.println("\n------------------------");
                System.out.print("Iteración ");
                System.out.print((i+1));

                // Calcular gradiente
                float gradiente = 2*x;

                //Actualizar "x" usando gradiente descendente
                 x =(x-(alpha*gradiente));

                // Almacenar iteración y valor correspondiente
                y=(x*x);

                // Imprimir resultados
                System.out.println();
                System.out.print(" X= ");
                System.out.print(x);
                System.out.print(" Y= ");
                System.out.print(y);
        }
    }   
}

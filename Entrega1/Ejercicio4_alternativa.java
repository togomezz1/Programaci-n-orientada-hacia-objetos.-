
/*Forma alternativa de hacerlo*/

class Operaciones_alternativas{

    // Forma general de multiplicar cualesquier dos números (a,b) \in R
    public static double Multiplicacion(double a, double b){
        return a * b; 
    }
    
    // Suma de dos números
    public static double suma(double a, double b){
        return a+b;
    }
}


public class Ejercicio4_alternativa {
    public static void main(String args[]){
        // Variable de entrada
        double edjuan;
        edjuan = 9.0; 
        // Variables calculadas a partir de edjuan
        double edalberto, edana, edmama;

        edalberto = Operaciones_alternativas.Multiplicacion(edjuan,2.0/3.0);
        edana = Operaciones_alternativas.Multiplicacion(edjuan,4.0/3.0);
        edmama = Operaciones_alternativas.suma(edjuan,Operaciones_alternativas.suma(edana,edalberto));
        
        // Mostrar las edades

        System.out.println("La edad de juan es: " + edjuan);
        System.out.println("La edad de Alberto es: " + edalberto);
        System.out.println("La edad de Ana es: " + edana);
        System.out.println("La edad de la Mama es: " + edmama);
    }
}

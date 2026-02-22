
/*Forma alternativa de hacerlo*/

class Operaciones_alternativas{

    // Forma general de multiplicar cualesquier dos números (a,b) \in R
    public static Number Multiplicacion(Number a, Number b){
        return a.doubleValue() * b.doubleValue(); 
    }
    
    // Suma de dos números
    public static Number suma(Number a, Number b){
        return a.doubleValue()+b.doubleValue();
    }
}


public class Ejercicio4_alternativa {
    public static void main(String args[]){
        // Variable de entrada
        Number edjuan;
        edjuan = 9; 
        // Variables calculadas a partir de edjuan
        Number edalberto, edana, edmama;

        edalberto = Operaciones_alternativas.Multiplicacion(edjuan,2/3);
        edana = Operaciones_alternativas.Multiplicacion(edjuan,4/3);
        edmama = Operaciones_alternativas.suma(edjuan,Operaciones_alternativas.suma(edana,edalberto));
        
        // Mostrar las edades

        System.out.println("La edad de juan es: " + edjuan);
        System.out.println("La edad de Alberto es: " + edalberto);
        System.out.println("La edad de Ana es: " + edana);
        System.out.println("La edad de la Mama es: " + edmama);
    }
}

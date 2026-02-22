
/*Se define una clase para realizar todas 
las operaciones requeridas. Adicionalmente la clase principal calcula la edad de la mama */
class Operaciones{
    public static int calculo_edalberto(int edjuan){
        return (2*edjuan)/3;
    }
    public static int calculo_edana(int edjuan){
        return (4*edjuan)/3;
    }

    public static int calculo_edmama(int edjuan){
        return edjuan + Operaciones.calculo_edalberto(edjuan)+ Operaciones.calculo_edana(edjuan);
    }
}


public class Ejercicio4 {
    public static void main(String args[]){
        // Variable de entrada
        int edjuan;
        edjuan = 9; 
        // Variables calculadas a partir de edjuan
        int edalberto, edana, edmama;

        edalberto = Operaciones.calculo_edalberto(edjuan);
        edana = Operaciones.calculo_edana(edjuan);
        edmama = Operaciones.calculo_edmama(edjuan);
        
        // Mostrar las edades

        System.out.println("La edad de juan es: " + edjuan);
        System.out.println("La edad de Alberto es: " + edalberto);
        System.out.println("La edad de Ana es: " + edana);
        System.out.println("La edad de la Mama es: " + edmama);
    }
}



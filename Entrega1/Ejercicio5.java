class operaciones{
    public static double suma(double a,double b){
        return a+b;
    }
    public static double multiplicacion(double a,double b){
        return a*b;
    }
    public static double potencia(double a,double b){
        return Math.pow(a,b);
    }
}


public class Ejercicio5 {
    public static void main(String args[]){
        // Variables de entrada
        double SUMA, X, Y; 
        // Valor particular
        SUMA = 0;
        X = 20; 
        SUMA = operaciones.suma(SUMA,X);
        Y = 40; 
        X = operaciones.suma(X,operaciones.potencia(Y,2));
        SUMA = operaciones.suma(SUMA,operaciones.multiplicacion(X, 1/Y));
        System.out.println("El valor de la suma es: " + SUMA);
    }

}

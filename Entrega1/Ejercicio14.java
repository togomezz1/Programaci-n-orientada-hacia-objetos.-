// Ejercicio 14 de la clase: Calcular el cuadrado y el cubo de un número 

class Operations{
    public static double calculate_square(double num){
        return Math.pow(num,2);
    }

    public static double calculate_cubic(double num){
        return Math.pow(num,3);
    }
}




public class Main {
    public static void main(String args[]){

        double num = 4, square, cubic; 

        square = Operations.calculate_square(num);
        cubic = Operations.calculate_cubic(num);

        System.out.println("El número es: " + num);
        System.out.println("El cuadrado del número es: " + num)
        System.out.println("El cubo del número es: " + num)

    }
}

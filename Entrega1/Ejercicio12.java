class Calculos{
    public static double cal_salario_bruto(double horas_laboradas,double valor_hora){
        return horas_laboradas * valor_hora;
    }
    public static double cal_retefuente(double salario_bruto,double porcentaje_retefuente){
        return (salario_bruto * porcentaje_retefuente ) / 100;
    }
    public static double cal_salario_neto(double salario_bruto, double retefuente){
        return salario_bruto - retefuente;
    }
}



public class Ejercicio12 {
    public static void main(String args[]){
        // Datos de entrada
        double valor_hora = 5000;
        double porcentaje_retefuente = 12.5;
        double horas_laboradas = 48; 
        double salario_bruto, retefuente, salario_neto;
        // Calculos
        salario_bruto = Calculos.cal_salario_bruto(horas_laboradas, valor_hora); 
        retefuente = Calculos.cal_retefuente(salario_bruto, porcentaje_retefuente);
        salario_neto = Calculos.cal_salario_neto(salario_bruto, retefuente);
        // Salida por pantalla
        System.out.println("El salario bruto del trabajador es: " + salario_bruto);
        System.out.println("La retención en la fuente es: " + retefuente);
        System.out.println("El salario neto del trabajador es: " + salario_neto);
    }
}

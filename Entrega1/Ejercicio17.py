from numpy import pi 

class circulo:

    @staticmethod
    def area(R):
        return pi * R ** 2 
    @staticmethod
    def perimetro(R):
        return 2 * pi * R

radio  = 5 # cm 
area = circulo.area(radio)
perimetro = circulo.perimetro(radio)

print(f"El radio del circulo es: {radio} cm")
print(f"El área del circulo es: {area:.4} cm²")
print(f"El permitro del circulo es: {perimetro:.4} cm")
//Ejercicio 3 - Potencia mediante recursividad
int base = 2;
int exponente = 5;
System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + potencia(base, exponente));

public static int potencia(int base, int exponente) {

  if (exponente == 0) {
    return 1;
  }
  return base * potencia(base, exponente - 1);
}

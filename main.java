import java.util.Scanner;

public class main {
  public static void main (String[] args){
    String nombre, apellido;
    String numeroString = "10";
    int numero1 = 10, numero2 = 20;
    int dia;
    boolean buleano = true;
    Scanner sc = new Scanner(System.in);
    int [] listaNum ={5,6,3,4,5,3,4,5,6,5,4,3,4,5,6,5,4,4,3,2,3,4,5};

    /*
    System.out.print("Como te llamas? ");
    nombre = sc.nextLine();
    System.out.println("Hola " + nombre + "!");
    System.out.println("Imprimo el booleano a \"true\": " + buleano);
    buleano = false;
    System.out.println("Imprimo el booleano a \"false\": " + buleano);
    */

    /*// Casting automático
    byte bytee = 9;
    short corto = bytee;
    int entero = corto;
    long largo = entero;
    float flotante = largo;
    double doble = flotante;
    // Casting manual
    int letra = 65;
    char caracter = (char)letra;
    System.out.println(caracter);
    doble = 9.85;
    entero = (int)doble;
    System.out.println(entero);
    */

    /*// String
    System.out.println(nombre);
    System.out.println(nombre.toUpperCase());
    System.out.println(nombre.toLowerCase());
    nombre = "Celia";
    apellido = "Pedrego";
    System.out.println(nombre + apellido);
    System.out.println(nombre.concat(apellido));
    System.out.println(nombre);
    */

    /*
    System.out.println(numero1+numero2);
    numeroString = numeroString+numero1;
    System.out.println(numeroString);
    System.out.println(numeroString+numero1+numero2);
    System.out.println(numero1+numero2+numeroString);
    */

    /*
    if (numero1 < numero2){
      System.out.println("Numero 1 es menor.");
    } else if (numero2 < numero1){
      System.out.println("Numero 2 es menor.");
    } else {
      System.out.println("Son iguales");
    }

    numeroString = (numero1 < numero2) ? "Numero1 es menor." : "Numero2 es menor.";
    System.out.println(numeroString);
    */

    dia = 4;
    switch(dia){
      case 1:
        System.out.println("Hoy es lunes");
        break;
      case 2:
        System.out.println("Hoy es martes");
        break;
      case 3:
        System.out.println("Hoy es miercoles");
        break;
      case 4:
        System.out.println("Hoy es jueves");
        break;
      case 5:
        System.out.println("Hoy es viernes");
        break;
      default:
        System.out.println("El mundo se acabo, ya no hay dias de la semana");
    }

    for(int i= 0 ; i < listaNum.length ; i++){
      System.out.print(listaNum[i] + " - ");
    }
    System.out.println();

    for (int i : listaNum){
      System.out.print(i + " - ");
    }
    System.out.println();

    int i = 0;
    while(i < listaNum.length){
      System.out.print(listaNum[i] + " - ");
      i++;
    }
    System.out.println();
  }
}

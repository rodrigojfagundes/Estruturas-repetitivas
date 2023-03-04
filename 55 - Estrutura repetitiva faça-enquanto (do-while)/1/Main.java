import java.util.Scanner;

public class Main {


public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

char resp;

do {

System.out.print("digite a temperatura em celsius");
double C = sc.nextDouble();
double F = 9.0 * C / 5.0 + 32.0;
System.out.printf("equivalente em Fahrenheit: %.2f%n", F);
System.out.print("deseja repetir? S/N");
//pegando apenas a primeira letra com o charAt 0
resp = sc.next().charAt(0);


} while (resp != 'n');

sc.close();

}
}

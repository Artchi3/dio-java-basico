import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner; 

public class App {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("BEM VINDE A CALCULADORA DE IMC COM JAVA, INSIRA SEUS DADOS");
        System.out.println("DIGITE SEU NOME");
        String nome = scann.next();
        
        System.out.println("DIGITE SUA ALTURA");
        double altura = scann.nextDouble();

        System.out.println("DIGITE SEU PESO");
        double peso = scann.nextDouble();

        double imc = (peso/(altura*altura))*10000;
        if (imc <= 18) {
            System.out.println(nome + " SEU IMC É DE M.MASSAFERA MAGREZA GRAVE EUROPEIA: " + df.format(imc));
        }else if (imc >= 18  && imc <= 25){
            System.out.println(nome + " SEU IMC É EQUILIBRADO: " + df.format(imc));
        }else if (imc >= 25  && imc <= 30) {
            System.out.println(nome + " SEU IMC É DE SOBREPESO: " + df.format(imc));
        }else if (imc >= 30  && imc <= 35) {
            System.out.println(nome + " SEU IMC É DE OBESIDADE: " + df.format(imc));
        }else if ( imc >= 35) {
            System.out.println(nome + " SEU IMC É DE OBESIDADE MORBIDA: " + df.format(imc));
        }
        System.out.println("OBRIGADO PELA ATENÇÃO");
        
    }
    
}

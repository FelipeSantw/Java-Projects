// new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// System.out.println: Imprime texto de saída (Output) e pulando uma linha

import java.util.Scanner;

public class calculoSalarial {

    public static void main(String[] args){
        //Lê valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100){
            //Atribuir a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00){
            //Atribuir a aliquota de 10% mediante o salário:
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }

    @Override
    public String toString() {
        return "calculoSalarial []";
    }
}
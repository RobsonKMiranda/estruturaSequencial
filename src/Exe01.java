import java.util.Scanner;
/*
    Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
Exemplos:
Entrada:
10
30
Saída:
SOMA = 40
Entrada:
-30
10
Saída:
SOMA = -20
Entrada:
0
0
Saída:
SOMA = 0
 */
public class Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, soma;
        A = sc.nextInt();
        B = sc.nextInt();
        soma = A + B;
        System.out.println("Soma = " + soma);
        sc.close();
    }
}

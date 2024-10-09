//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int p1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int p2 = sc.nextInt();

        try {
            contar(p1, p2);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
        sc.close();
    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException {
        if (p1 >= p2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = p2 - p1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Qual o seu Nome? ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Qual a sua Idade? ");
            idade = scan.nextInt();

    }
    }
}

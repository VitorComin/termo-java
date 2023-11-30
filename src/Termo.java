import java.util.Random;
import java.util.Scanner;

public class Termo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean jogarNovamente = true;

            while (jogarNovamente) {
                jogarJogo(scanner);
                
                System.out.print("Deseja jogar novamente? (s/n): ");
                String resposta = scanner.nextLine().toLowerCase();

                jogarNovamente = resposta.equals("s");
            }
        }
    }

    private static void jogarJogo(Scanner scanner) {
        Random random = new Random();

        String[] palavras = {
            "abrir", "achar", "corre", "pular", "comer", "dorme",
            "verde", "lutar", "fugir", "beber", "amigo", "solar",
            "noite", "viver", "uivar"
        };

        String palavraEscolhida = palavras[random.nextInt(palavras.length)];
        int tentativasRestantes = 6;

        char[] palavraAdivinhacao = new char[palavraEscolhida.length()];
        for (int i = 0; i < palavraAdivinhacao.length; i++) {
            palavraAdivinhacao[i] = '_';
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Bem-vindo ao Termo!");
        System.out.println("A palavra tem 5 letras. Tente adivinhar!");

        while (tentativasRestantes > 0) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Palavra atual: " + String.valueOf(palavraAdivinhacao));
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.print("Digite sua tentativa: ");

            String tentativa = scanner.nextLine();

            // Verifica se a palavra tem exatamente 5 letras
            if (tentativa.length() != 5) {
                System.out.println("Por favor, digite uma palavra com exatamente 5 letras.");
                continue;  // Volta ao início do loop para tentar novamente
            }

            if (tentativa.equals(palavraEscolhida)) {
                System.out.println("Parabéns! Você acertou a palavra: " + palavraEscolhida);
                break;
            } else {
                System.out.println("Tentativa incorreta. Tente novamente.");

                // Reinicializa o array de acertos
                boolean[] acertos = new boolean[palavraEscolhida.length()];

                // Verifica letras corretas e em posições corretas
                for (int i = 0; i < palavraEscolhida.length(); i++) {
                    if (palavraEscolhida.charAt(i) == tentativa.charAt(i)) {
                        palavraAdivinhacao[i] = tentativa.charAt(i);
                        acertos[i] = true;
                    }
                }

                // Verifica letras corretas em posições diferentes
                for (int i = 0; i < palavraEscolhida.length(); i++) {
                    if (!acertos[i] && palavraEscolhida.contains(String.valueOf(tentativa.charAt(i)))) {
                        System.out.println("A letra '" + tentativa.charAt(i) + "' está correta, mas em uma posição diferente.");
                    }
                }

                // Exibe letras corretas e em posições corretas
                System.out.println("Letras corretas e na posição correta: " + String.valueOf(palavraAdivinhacao));
            }

            tentativasRestantes--;

            if (tentativasRestantes == 0) {
                System.out.println("Você perdeu. A palavra correta era: " + palavraEscolhida);
            }
        }
    }
}

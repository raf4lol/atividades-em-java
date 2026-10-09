import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 0;
        double meta = 150;

        while (saldo < meta) {
            System.out.println("\n1 - iFood (R$ 8,00)");
            System.out.println("2 - Rappi (R$ 9,00)");
            System.out.println("3 - Zé Delivery (R$ 10,00)");
            System.out.print("Escolha o aplicativo: ");
            int app = sc.nextInt();

            double valor = 0;
            String nome = "";

            switch (app) {
                case 1:
                    valor = 8;
                    nome = "iFood";
                    break;
                case 2:
                    valor = 9;
                    nome = "Rappi";
                    break;
                case 3:
                    valor = 10;
                    nome = "Zé Delivery";
                    break;
                default:
                    System.out.println("Aplicativo inválido!");
                    continue;
            }

            System.out.print("Estava chovendo? (1 - Sim, 2 - Não): ");
            int chuva = sc.nextInt();

            if (chuva == 1) {
                valor += 5;
            }

            saldo += valor;

            System.out.println("\nAplicativo: " + nome);
            System.out.printf("Valor da entrega: R$ %.2f%n", valor);
            System.out.printf("Saldo total: R$ %.2f%n", saldo);
            System.out.printf("Falta para a meta: R$ %.2f%n",
                    Math.max(0, meta - saldo));
        }

        System.out.println("\nMeta atingida! Pode ir para casa descansar!");
        sc.close();
    }
}
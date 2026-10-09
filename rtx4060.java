import java.util.Scanner;

public class rtx4060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0, valor;

        while (saldo < 1850) {
            System.out.println("1- Formatação (150) | 2- Rede (200) | 3- Landing Page (500)");
            int servico = sc.nextInt();

            switch (servico) {
                case 1: valor = 150; break;
                case 2: valor = 200; break;
                case 3: valor = 500; break;
                default: continue;
            }

            System.out.println("Pagamento: 1-Pix | 2-Cartão");
            int pagamento = sc.nextInt();

            if (pagamento == 2)
                valor -= 10;
            else if (pagamento != 1)
                continue;

            saldo += valor;

            System.out.printf("Depositado: R$ %.2f%n", valor);
            System.out.printf("Total: R$ %.2f%n", saldo);
            System.out.printf("Falta: R$ %.2f%n", Math.max(0, 1850 - saldo));
        }

        System.out.println("RTX 4060 garantida! Bora jogar no ultra!");
        sc.close();
    }
}
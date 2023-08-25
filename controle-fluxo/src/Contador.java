import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        int parametroUm, parametroDois;
        
        do {
            System.out.println("Digite o primeiro parâmetro:");
            parametroUm = terminal.nextInt();
            
            System.out.println("Digite o segundo parâmetro:");
            parametroDois = terminal.nextInt();
            
            if (parametroUm > parametroDois) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro. Por favor, tente novamente.");
            }
        } while (parametroUm > parametroDois);
        
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        
        terminal.close();
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm + 1;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (parametroUm + i));
        }
    }
}

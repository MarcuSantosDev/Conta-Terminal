import java.util.Scanner;

public class Conta_Terminal {
  public static void main(String[] args) throws Exception {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira o seu saldo: R$ ");
    double saldo = scanner.nextDouble();
    System.out.println("Insira o valor solicitado: R$ ");
    double valor_solicitado = scanner.nextDouble();
    double saldo_apos_operacao = saldo;

    if (valor_solicitado > saldo) {
      System.out.println("[--- Saldo insuficiente !!! ---]");
      System.out.println("Saldo Total: R$ " + saldo);
    System.out.println("Valor solicitado: R$ " + valor_solicitado);
    System.out.println("Saldo após operação: R$ " + saldo_apos_operacao);
    }
    
    if (valor_solicitado <= saldo) {
        saldo_apos_operacao = saldo - valor_solicitado;      
    
    System.out.println("Saldo Total: R$ " + saldo);
    System.out.println("Valor solicitado: R$ " + valor_solicitado);
    System.out.println("Saldo após operação: R$ " + saldo_apos_operacao);
   }
   scanner.close();
  }
}
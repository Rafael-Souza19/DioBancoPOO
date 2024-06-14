package banco;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("1234-CC");
        ContaPoupança contaPoupanca = new ContaPoupança("5678-PP");

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);

        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());

        contaCorrente.sacar(200);
        System.out.println("Saldo Conta Corrente após saque: " + contaCorrente.getSaldo());

        contaCorrente.transferir(contaPoupanca, 300);
        System.out.println("Saldo Conta Corrente após transferência: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança após recebimento: " + contaPoupanca.getSaldo());
    }
}

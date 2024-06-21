import java.util.Scanner;
public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    Scanner scanner = new Scanner(System.in);

    public ContaTerminal() {

    }

    public void CriarConta(){
        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite a agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o valor inicial:");
        saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá, " + nomeCliente + " obrigado por criar sua conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " ja está disponível para saque.");


    }


    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void exibirSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public java.lang.String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(java.lang.String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

public class App {
    public static void main(String[] args) {

        ContaBancaria conta;

        conta = new ContaBancaria();

        conta.cpf = "999.999.999/99";
        conta.saldo = 100.0;
        conta.NumeroAgencia = 3908;
        conta.numeroConta = 32093032;
        conta.sacar(50);

        System.out.println(conta.saldo);
}
}
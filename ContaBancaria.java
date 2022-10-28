public class ContaBancaria {
    double saldo;
    int NumeroAgencia;
    int numeroConta;
    String cpf;

    void sacar (double valorSaque){
        if (saldo > valorSaque) {
            saldo = saldo-valorSaque;

        }
    }
}

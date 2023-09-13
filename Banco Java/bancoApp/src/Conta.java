import java.util.Objects;

public class Conta {
    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    public Conta(Pessoa titular, int agencia, int numero){ // CONSTRUTOR
        Objects.requireNonNull(titular); //verifica se o titular passado não é null
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    void saque(double valor){
        if(saldo < valor) {
            throw new IllegalStateException("Saldo insuficiente");
        }else saldo = saldo - valor;
    }

    void deposito(double valor){
        if(valor < 0) {
            throw new IllegalArgumentException("Depósito tem que ser maior que 0.");
        }else saldo = saldo + valor;
    }
}

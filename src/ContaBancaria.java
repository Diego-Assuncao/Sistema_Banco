public abstract class ContaBancaria implements Conta  {

    String nome;
    double saldo;
    TiposDeConta tipoDeConta;

    @Override
    public void consultarSaldo() {
        System.out.println("NOME: " + nome);
        System.out.println("SALDO DISPONÍVEL: R$"+saldo);
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public abstract void sacar(double saque);

    public ContaBancaria(String nome, double saldo, TiposDeConta tiposDeConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoDeConta = tiposDeConta;
    }
}
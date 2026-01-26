
public class ContaPoupanca extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        double taxa = valor * 0.05;
        double valorLiquido = valor - taxa;
        this.saldo += valorLiquido;
        System.out.println("TAXA DE DEPÓSITO: R$"+taxa);
        System.out.println("VALOR R$" +valorLiquido+ ". DEPOSITADO NA SUA CONTA POUPANÇA COM SUCESSO!");
    }

    @Override
    public void sacar(double saque){

        if(saque > 0 && this.saldo >= saque){
            this.saldo = this.saldo - saque;
            System.out.println("O SAQUE NO VALOR DE R$"+saque+" FOI REALIZADO COM SUCESSO! ");
            System.out.println("SALDO ATUAL: R$"+this.saldo);
        }
        else{
            System.out.println("O SAQUE NO VALOR DE R$"+saque+" NÃO PODE SER REALIZADO POIS É MENOR QUE O SEU SALDO ATUAL! ");
            System.out.println("SALDO ATUAL R$"+this.saldo);
        }

    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    public ContaPoupanca(String nome, double saldo, TiposDeConta tiposDeConta) {
        super(nome, saldo, tiposDeConta);
    }
}

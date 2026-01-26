
public class ContaCorrente extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("VALOR R$" +valor+ ". DEPOSITADO NA SUA CONTA CORRENTE COM SUCESSO!");
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

    public ContaCorrente(String nome, double saldo, TiposDeConta tiposDeConta) {
        super(nome, saldo, tiposDeConta);
    }
}

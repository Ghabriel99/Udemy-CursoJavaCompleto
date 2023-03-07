package model.entities;

public class Fatura {
    private double pagamentoInicial;
    private double imposto;
    
    public Fatura(){}

    public Fatura(double pagamentoInicial, double imposto) {
        this.pagamentoInicial = pagamentoInicial;
        this.imposto = imposto;
    }

    public double getPagamentoInicial() {
        return pagamentoInicial;
    }

    public void setPagamentoInicial(double pagamentoInicial) {
        this.pagamentoInicial = pagamentoInicial;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double TotalAPagar() {
        return getPagamentoInicial() + getImposto();
    }
    
}

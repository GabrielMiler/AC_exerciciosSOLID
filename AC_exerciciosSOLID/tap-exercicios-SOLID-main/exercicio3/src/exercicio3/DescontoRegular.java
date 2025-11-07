package exercicio3;
public class DescontoRegular implements Desconto{
    public double aplicar(double valor) {
        return valor * 0.9;
    }
}

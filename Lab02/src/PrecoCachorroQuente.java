//Ana Lilian Sousa Coelho
public class PrecoCachorroQuente {
	private double precoBase;
    private double desconto;

    public PrecoCachorroQuente(double precoBase, double desconto) {
        this.precoBase = precoBase;
        this.desconto = desconto;
    }

    public double calcularPreco(int quantidade) {
        double precoTotal = precoBase * quantidade;
        if (quantidade > 2) {
            precoTotal -= precoTotal * desconto;
        }
        return precoTotal;
    }
}


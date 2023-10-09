//Ana Lilian Sousa Coelho

public class CachorroQuente {
	 	private String proteina;
	    private String queijo;
	    private String[] ingredientesAdicionais;
	    private PrecoCachorroQuente preco;

	    public CachorroQuente(String proteina, String queijo, String[] ingredientesAdicionais, PrecoCachorroQuente preco) {
	        this.proteina = proteina;
	        this.queijo = queijo;
	        this.ingredientesAdicionais = ingredientesAdicionais;
	        this.preco = preco;
	    }

	    public double calcularPreco(int quantidade) {
	        return preco.calcularPreco(quantidade);
	    }

	    public String getProteina() {
	        return proteina;
	    }

	    public String getQueijo() {
	        return queijo;
	    }

	    public String[] getIngredientesAdicionais() {
	        return ingredientesAdicionais;
	    }
	}

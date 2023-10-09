
public class Venda {
	 private String nomeAluno;
	    private String matricula;
	    private CachorroQuente[] cachorrosQuentes;
	    private String bebida;

	    public Venda(String nomeAluno, String matricula, CachorroQuente[] cachorrosQuentes, String bebida) {
	        this.nomeAluno = nomeAluno;
	        this.matricula = matricula;
	        this.cachorrosQuentes = cachorrosQuentes;
	        this.bebida = bebida;
	    }
	    
	    public String getNomeAluno() {
	        return nomeAluno;
	    }

	    public String getMatricula() {
	        return matricula;
	    }

	    public CachorroQuente[] getCachorrosQuentes() {
	        return cachorrosQuentes;
	    }

	    public String getBebida() {
	        return bebida;
	    }
	    
}

import java.util.ArrayList;

public class Barraquinha {

	public static void main(String[] args) {
        PrecoCachorroQuente precoSalsicha = new PrecoCachorroQuente(2.00, 0.10);
        PrecoCachorroQuente precoLinguica = new PrecoCachorroQuente(3.00, 0.12);
        PrecoCachorroQuente precoFrango = new PrecoCachorroQuente(2.50, 0.13);
        PrecoCachorroQuente precoBacon = new PrecoCachorroQuente(3.50, 0.14);

        ArrayList<Venda> vendas = new ArrayList<>();  
        
        String[] ingredientes1 = {"maionese", "ketchup", "ovo"};
        CachorroQuente cachorroQuente1 = new CachorroQuente("salsicha", "mussarela", ingredientes1, precoSalsicha);

        String[] ingredientes2 = {"ketchup", "batata palha"};
        CachorroQuente cachorroQuente2 = new CachorroQuente("linguiça", "parmesão", ingredientes2, precoLinguica);

    
        CachorroQuente[] cachorrosQuentes1 = {cachorroQuente1, cachorroQuente2};
        Venda venda1 = new Venda("João", "2021001", cachorrosQuentes1, "Coca-cola");

        String[] ingredientes3 = {"ketchup", "batata palha"};
        CachorroQuente cachorroQuente3 = new CachorroQuente("frango", "prato", ingredientes3, precoFrango);

        String[] ingredientes4 = {"maionese", "ovo"};
        CachorroQuente cachorroQuente4 = new CachorroQuente("bacon", "mussarela", ingredientes4, precoBacon);

        CachorroQuente[] cachorrosQuentes2 = {cachorroQuente3, cachorroQuente4};
        Venda venda2 = new Venda("Maria", "2021002", cachorrosQuentes2, "Del Rio");

        vendas.add(venda1);
        vendas.add(venda2);

      
        for (Venda venda : vendas) {
            int quantidadeCachorrosQuentes = venda.getCachorrosQuentes().length;
            double total = 0.0;

            for (CachorroQuente cachorroQuente : venda.getCachorrosQuentes()) {
                total += cachorroQuente.calcularPreco(quantidadeCachorrosQuentes);
            }

            System.out.println("Aluno: " + venda.getNomeAluno() + " - Matricula: " + venda.getMatricula());
            System.out.println("Total da venda: R$" + total);
            System.out.println();
        }
    }
}
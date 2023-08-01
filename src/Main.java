import java.util.*;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		List<Rotas> rotas = new ArrayList<>();
		boolean sair = false;
		while (!sair) {
			String opcao = JOptionPane.showInputDialog(
					"Escolha uma opção:\n" + "1- Inserir uma rota\n" + "2- Buscar uma rota\n" + "3- Sair");

			switch (opcao) {
			case "1":
				String origem = JOptionPane.showInputDialog("Infome a cidade de origem:");
				String destino = JOptionPane.showInputDialog("Informe a cidade de destino:");
				int distancia = Integer.parseInt(JOptionPane.showInputDialog("Informe a distância(em km):"));

				Rotas rota = new Rotas(origem, destino, distancia);
				rotas.add(rota);

				// Adiciona a rota de volta
				
				Rotas rotaVolta = new Rotas(destino, origem, distancia);
				rotas.add(rotaVolta);
				break;
				
			case "2":
				String origemBusca = JOptionPane.showInputDialog("Informe a cidade de origem:");
				String destinoBusca = JOptionPane.showInputDialog("Informe a cidade de destino:");
				int menorDistancia = Integer.MAX_VALUE;
				String caminhoIda = "";
				String caminhoVolta = "";

				for (Rotas r : rotas) {
				    if (r.getOrigem().equals(origemBusca) && r.getDestino().equals(destinoBusca)) {
				        if (r.getDistancia() < menorDistancia) {
				            menorDistancia = r.getDistancia();
				            caminhoIda = r.getOrigem() + " ---- " + r.getDestino();
				            caminhoVolta = r.getDestino() + " ---- " + r.getOrigem();
				        }
				    }

				}

				if (menorDistancia != Integer.MAX_VALUE) {

					JOptionPane.showMessageDialog(null, "Distância(caminho mínimo): " + menorDistancia + " km\n" + "Caminho de ida: " + caminhoIda.toString() + "\n" + "Caminho de volta: " + caminhoVolta.toString());
					
				} else {
					JOptionPane.showMessageDialog(null, "Rota não encontrada");
				}
				break;
			case "3":
				sair = true;

				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		}
		
		
	
	}
}
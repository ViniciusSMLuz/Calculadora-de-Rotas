import java.util.*;
import javax.swing.JOptionPane;

    public class Rotas {
	   private String origem;
	   private String destino;
	   private int distancia;

	public Rotas(String origem, String destino, int distancia) {
		this.origem = origem;
		this.destino = destino;
		this.distancia = distancia;
	}

	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}

	public int getDistancia() {
		return distancia;
	}
}

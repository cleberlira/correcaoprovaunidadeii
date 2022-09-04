package questao1;

public class ControleRemoto {

	Brinquedo brinquedo;
	
	
	public ControleRemoto(Brinquedo brinquedo) {
		this.brinquedo = brinquedo;
	}
	
	public void mover() {
		this.brinquedo.mover();
	}
	
}

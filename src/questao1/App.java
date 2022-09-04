package questao1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caminhao caminhao = new Caminhao();
		
		 ControleRemoto controleremoto = new ControleRemoto(caminhao);
	        
	   controleremoto.mover();
		
        Helicoptero helicoptero = new Helicoptero();
        
        ControleRemoto controleremotoH = new ControleRemoto(helicoptero);
        
        controleremotoH.mover();
	
        
        Navio navio = new Navio();
        
        ControleRemoto controleremoton = new ControleRemoto(navio);
        
        controleremoton.mover();
	}

}

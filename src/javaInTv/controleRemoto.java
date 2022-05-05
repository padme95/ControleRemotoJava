package javaInTv;

public class controleRemoto {

	
public static void main(String[] args) {
		
		Televisao televisao1 = new Televisao();
		
		televisao1.ligarTv(10);
		
		televisao1.aumentarVolume();
		televisao1.aumentarVolume();
		televisao1.aumentarVolume();
		televisao1.aumentarVolume();
		televisao1.aumentarVolume();
		televisao1.aumentarVolume();
		televisao1.aumentarVolume();
		televisao1.aumentarVolume();
		televisao1.aumentarVolume();
		televisao1.aumentarVolume();
		
		televisao1.diminuirVolume();
		televisao1.diminuirVolume();
		
		televisao1.subirCanal();
		televisao1.subirCanal();
		televisao1.subirCanal();
		televisao1.subirCanal();
		televisao1.subirCanal();
		televisao1.descerCanal();
		
		televisao1.selecionarCanal(25);
		
		televisao1.consultaTv();
	}

	
}

package tarjetabaja;

public class Main {
	
	public static void main (String [] args) {
		
		TarjetaBaja tarjetita = new TarjetaBaja(100);
		
		System.out.println(tarjetita.getSaldo());
		tarjetita.pagarViajeEnColectivo();
		System.out.println(tarjetita.getSaldo());
		tarjetita.pagarViajeEnSubte();
		tarjetita.pagarViajeEnColectivo();
		System.out.println(tarjetita.getSaldo());
		tarjetita.cargar(50);
		System.out.println(tarjetita.getSaldo());
		tarjetita.pagarViajeEnSubte();
		tarjetita.pagarViajeEnColectivo();
		System.out.println(tarjetita.getSaldo());
		System.out.println(tarjetita.contarViajesEnColectivo());
		System.out.println(tarjetita.contarViajesEnSubte());
		
		
		
		
		
		
		
		
		
		
		
	}

}

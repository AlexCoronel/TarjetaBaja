package tarjetabaja;

public class TarjetaBaja {
	
		
		public static final double PRECIOCOLECTIVO=12.50;
		public static final double PRECIOSUBTE=20;
		private double saldo;
		private int viajesEnColectivo;
		private int viajesEnSubte;


		public TarjetaBaja(double saldoInicial) {
			this.setSaldo(saldoInicial);
			this.viajesEnColectivo=0;
			this.viajesEnSubte=0;
		}

		public double getSaldo() {
			return this.saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		
		public void cargar (double monto) {
			this.setSaldo(this.getSaldo()+monto);
		}

		public void pagarViajeEnColectivo() {
			if (this.getSaldo() >= PRECIOCOLECTIVO) {
				this.setSaldo(this.getSaldo()-PRECIOCOLECTIVO);
				this.viajesEnColectivo++;
				}
			else System.out.println("Saldo insuficiente");
			
			
		}

		public void pagarViajeEnSubte() {
			if (this.getSaldo() >= PRECIOSUBTE) {
				this.setSaldo(this.getSaldo()-PRECIOSUBTE);
			    this.viajesEnSubte++;
		}
			else System.out.println("Saldo insuficiente");
			
		}

		public double obtenerSaldo() {
			return this.getSaldo();
		}

		public int contarViajesEnColectivo() {
	    	return this.viajesEnColectivo;
	    }
	    public int contarViajesEnSubte() {
	    	return this.viajesEnSubte;
	    }
		public int contarViajes() {
			return this.contarViajesEnColectivo()+this.contarViajesEnSubte();
		}

	    

	}




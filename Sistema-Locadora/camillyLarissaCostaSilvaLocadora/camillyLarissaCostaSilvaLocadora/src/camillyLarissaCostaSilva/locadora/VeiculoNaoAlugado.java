 package camillyLarissaCostaSilva.locadora;

 public class VeiculoNaoAlugado extends Exception {
		

		public VeiculoNaoAlugado(String placa) {
			super("Veiculo não alugado. Placa: " + placa);
		}
}

public class ContaCorrente extends Conta {

	private double limiteChequeEspecial;

	public ContaCorrente(Cliente cliente, double limiteChequeEspecial) {
        super(cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}

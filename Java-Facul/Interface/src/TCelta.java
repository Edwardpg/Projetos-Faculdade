
public class TCelta implements IVeiculo, IMotorista{
	private String motorzinho,Piloto;
	@Override
	public void setMotor(String M) {
		this.motorzinho = M;
	}
	@Override
	public String getMotor() {
		return this.motorzinho;
	}
	@Override
	public void setMotorista(String Driver) {
		this.Piloto = Driver;
	}
	@Override
	public String getMotorista() {
		return this.Piloto;
	}
	public static void main(String[] args) {
		TCelta MyCeltaTunado = new TCelta();
		MyCeltaTunado.setMotor("3.5");
		MyCeltaTunado.setMotorista("Edivaldo Batista");
		System.out.println("Motor: " + MyCeltaTunado.getMotor() + "\n" 
		+ "Motorista: " + MyCeltaTunado.getMotorista());
	}
}

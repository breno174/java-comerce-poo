package questoestrab;

public class Admin extends Pessoa {
	public Admin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	String cargo;
	int salario;
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		
	}
}

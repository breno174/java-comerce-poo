package questoestrab;

public abstract class Pessoa {
	public String name;
	
	public abstract void login(String username, String password);
	public Pessoa(String name) {
		this.name = name;
	}
}

package questoestrab;

public abstract class Pessoa {
	public String name;
	
	public abstract boolean login(String username, String password);
	public Pessoa(String name) {
		this.name = name;
	}
}

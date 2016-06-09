package holaMundo;

public class Hola {
	public String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	@Override
	public String toString() {
		return "Hola [saludando michael 2=" + saludo + "]";
	}

	public Hola(String saludo) {
		super();
		this.saludo = saludo;
	}

	public Hola() {
		super();
		// TODO Auto-generated constructor stub
	}

}

package exercicio01;

public class AppFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Willian", 40, 20);
		Senior s = new Senior ("Aline", 40,30, 10);

		System.out.println(f.exibirDados());
		System.out.println(s.exibirDados());
		System.out.println("Salário: " + f.calcularSalario());
		System.out.println("Salário: " + s.calcularSalario());

		
	}

}

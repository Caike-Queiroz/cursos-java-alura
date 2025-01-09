public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300.0;
		double imposto = 0;

		if (1900 >= salario && salario <= 2800) {
			imposto = (salario * 0.075) - 142; // 7.5%
		} 
		else if (2800.01 >= salario && salario <= 3751) {
			imposto = (salario * 0.15) - 350; // 15%
		} 
		else if (3751.01 >= salario && salario <= 4664) {
			imposto = (salario * 0.225) - 636; // 22.5%
		}

		System.out.println("Imposto com dedução já aplicada: " + imposto);
	}
}

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		// nao conseguira instanciar funcionario, pois é abstrato
		//Funcionario f1 = new Funcionario();
		//f1.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registrar(g1);
		//controle.registrar(f1);
		controle.registrar(ev);
		
		System.out.println(controle.getSoma());
	}
}

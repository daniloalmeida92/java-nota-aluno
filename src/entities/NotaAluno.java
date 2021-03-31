package entities;

public class NotaAluno {
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	public double notaFinal;
	
	
	public double notaGeral() {
		return notaFinal = n1 + n2 +n3;
	}
	
	public boolean passOrFailed() {
		if (notaFinal > 60.0) {
			System.out.println("Final Grade = " + notaGeral());
			System.out.println("Pass");
		} else {
			
			System.out.println("Final Grade = " + notaGeral());
			System.out.println("Failed");
			System.out.println("Missing " + (60 - notaFinal) + " Points");
		}
		return false;
		
	}
}

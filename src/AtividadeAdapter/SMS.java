package AtividadeAdapter;

public class SMS {
	public String numero;
	public String mensagem;
	
  public void enviaSMS(String mensagem, String destinatario){
    System.out.println("Enviando SMS para " + destinatario + " com a mensagem: " + mensagem);
  }
  
}
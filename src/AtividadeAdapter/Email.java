package AtividadeAdapter;

public class Email{
  public String email;
  public String mensagem;


  public void enviaEmail(String mensagem, String destinatario){
    System.out.println("Enviando email para " + destinatario + " com a mensagem: " + mensagem);
  }
  
}
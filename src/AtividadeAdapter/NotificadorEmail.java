package AtividadeAdapter;

public class NotificadorEmail extends Email implements INotificador{
  public void enviar(String mensagem, String email){
    enviaEmail(mensagem, email);
  }
}
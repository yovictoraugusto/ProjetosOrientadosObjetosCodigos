package AtividadeAdapter;

public class adaptadorSMS extends SMS implements INotificador {
  public void enviar(String mensagem, String destinatario){
    enviaSMS(mensagem, destinatario);
  }
}
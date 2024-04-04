package AtividadeAdapter;

public class adaptadorPush extends Push implements INotificador {
  public void enviar(String mensagem, String idDispositivo){
    enviaPush(mensagem, idDispositivo);
  }
  
}
package AtividadeAdapter;

public class Push {
  public String idDispositivo;
  public String mensagem;
  
  public void enviaPush(String mensagem, String idDispositivo){
    System.out.println("Enviando Push para " + idDispositivo + " com a mensagem: " + mensagem);
  }
}
package AtividadeAdapter;

public class Main {
  public static void main(String[] args) {
    INotificador notificadorSMS = new adaptadorSMS();
		INotificador notificadorEmail = new NotificadorEmail();
		INotificador notificadorPush = new adaptadorPush();
		//

		notificadorSMS.enviar("Olá","Fábio");
		notificadorEmail.enviar("Olá", "fsilveira@unifesp.br");
		notificadorPush.enviar("Olá", "Prédio Parque Tecnológico – sala 118");
  }
}
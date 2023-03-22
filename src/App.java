public class App {
  public static void main(String[] args) throws Exception {

    Topico newTopic = new Topico();

    newTopic.setPergunta("Quem descobriu a gravidade?");
    newTopic.setDisciplina("Física");
    newTopic.setAssunto("Física clássica");

    newTopic.respostaEscolhida.setUsername("João");
    newTopic.respostaEscolhida.texto = "Isaac Newton";
    newTopic.respostaEscolhida.likes = 55;
  }
}

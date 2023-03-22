public class Topico {
  private String pergunta;
  private String disciplina;
  private String assunto;
  Resposta respostaEscolhida = new Resposta();

  String getPergunta() {
    return this.pergunta;
  }

  String getDisciplina() {
    return this.disciplina;
  }

  String getAssunto() {
    return this.assunto;
  }

  void setPergunta(String pergunta) {
    // pode haver regras conferindo conteúdo
    this.pergunta = pergunta;
  }

  void setDisciplina(String disciplina) {
    // pode haver regras limitando as opções
    this.disciplina = disciplina;
  }

  void setAssunto(String assunto) {
    // pode haver regras limitando as opções
    this.assunto = assunto;
  }
}

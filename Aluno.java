import java.util.Date;

// Classe Aluno que herda da classe Pessoa
  public class Aluno extends Pessoa {
      // Herda os atributos da classe super
      public Aluno(String _nome, String _cpf, Date _data) {
          super(_nome, _cpf, _data);
      }
      public String matricula; // Define a matricula do Aluno
  }
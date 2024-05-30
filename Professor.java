import java.util.Date;

public class Professor extends Pessoa {
      // Herda os atributos da classe super
      public Professor(String _nome, String _cpf, Date _data) {
          super(_nome, _cpf, _data);
      }
      public double salario; // Define o salário do professor
      public String disciplina; // Define a disciplina do professor
  }
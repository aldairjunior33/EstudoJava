import java.util.Date;

public class Pessoa {
      public String nome; // Define o nome da pessoa
      public String cpf;  // Define o cpf da pessoa
      public Date data_nascimento; // Define a data de nascimento da pessoa

      // Construtor da classe Pessoa, passando todos os seus atributos
      public Pessoa(String _nome, String _cpf, Date _data) {
          this.nome = _nome;
          this.cpf = _cpf;
          this.data_nascimento = _data;
      }
  }
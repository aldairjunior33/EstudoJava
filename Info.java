import java.util.*;

public class Info {
      private String nome; // Define o nome da pessoa
      private String cpf; // Define o cpf da pessoa
      private Date dat_nasc; // Define a data de nascimento da pessoa

      // Obtem o nome da pessoa
      public String getNome() {
          return nome;
      }

      // Atribui o nome a pessoa
      public void setNome(String nome) {
          this.nome = nome;
      }

      // Obtem o cpf da pessoa
      public String getCpf() {
          return cpf;
      }

      // Atribui o cpf a pessoa
      public void setCpf(String cpf) {
          this.cpf = cpf;
      }

      // Obtem a data de nascimento da pessoa
      public Date getDatNasc() {
          return dat_nasc;
      }

      // Atribui a data de nascimento a pessoa
      public void setDatNasc(Date dat_nasc) {
          this.dat_nasc = dat_nasc;
      }
  }
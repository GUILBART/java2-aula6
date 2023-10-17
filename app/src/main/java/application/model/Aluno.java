package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno {
    private int id;
    private String nome;
    private int idade;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getId() {
        return this.id;

    }

    public void setId(int id) {
        this.id = id;

    }

    public String getNome() {
        return this.nome;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public int getIdade() {
        return this.idade;

    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
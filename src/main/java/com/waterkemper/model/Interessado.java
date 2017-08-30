package com.waterkemper.model;

import com.waterkemper.util.AbstractyEntityBuilder;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity(name = "INTERESSADOS")
public class Interessado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "NOME")
    @Max(value = 100)
    private String nome;

    @NotNull
    @Column(name = "EMAIL")
    @Max(value = 100, message = "Limite máximo e {max}")
    private String email;

    private Interessado() {
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder extends AbstractyEntityBuilder<Interessado, Builder>{

        private Builder(Interessado interessado) {
            super(interessado);
        }

        public static Builder create(){
            return new Builder(new Interessado());
        }

        public Builder nome(String nome){
            entity.nome = nome;
            return this;
        }

        public Builder email(String email){
            entity.email = email;
            return this;
        }

    }
}

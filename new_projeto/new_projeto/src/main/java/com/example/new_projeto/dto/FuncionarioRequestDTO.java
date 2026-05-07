package com.example.new_projeto.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class FuncionarioRequestDTO {
    @NotBlank(message = "⚠️O nome é Obrigatório.⚠️")
    @Size(min = 2, message = "O nome deve ter no mínimo três caracteres.")
    @Size(max = 30, message = "O nome deve ter no máximo trinta caracteres." )
    private String nome;

    @NotBlank(message = "⚠️O e-mail é obrigatório.⚠️⚠")
    @Email(message = "⚠️Deve ser um e-mail válido.⚠️")
    private String email;

    @NotBlank (message = "⚠️A senha é Obrigatória.⚠️")
    @Size(max = 8, message = "⚠️A senha deve ter 8 dígitos.⚠️")
    private String senha;

    @NotBlank(message = "O telefone é Obrigatório.⚠️")
    @Size(max = 11, message = "O telefone dev ter no máximo 11 caracteres.⚠️")
    private String telefone;

    public FuncionarioRequestDTO() {
    }

    public FuncionarioRequestDTO(String nome, String email, String senha, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public @NotBlank(message = "⚠️O nome é Obrigatório.⚠️") @Size(min = 2, message = "O nome deve ter no mínimo três caracteres.") @Size(max = 30, message = "O nome deve ter no máximo trinta caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "⚠️O nome é Obrigatório.⚠️") @Size(min = 2, message = "O nome deve ter no mínimo três caracteres.") @Size(max = 30, message = "O nome deve ter no máximo trinta caracteres.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "⚠️O e-mail é obrigatório.⚠️⚠") @Email(message = "⚠️Deve ser um e-mail válido.⚠️") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "⚠️O e-mail é obrigatório.⚠️⚠") @Email(message = "⚠️Deve ser um e-mail válido.⚠️") String email) {
        this.email = email;
    }

    public @NotBlank(message = "⚠️A senha é Obrigatória.⚠️") @Size(max = 8, message = "⚠️A senha deve ter 8 dígitos.⚠️") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "⚠️A senha é Obrigatória.⚠️") @Size(max = 8, message = "⚠️A senha deve ter 8 dígitos.⚠️") String senha) {
        this.senha = senha;
    }

    public @NotBlank(message = "O telefone é Obrigatório.⚠️") @Size(max = 11, message = "O telefone dev ter no máximo 11 caracteres.⚠️") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "O telefone é Obrigatório.⚠️") @Size(max = 11, message = "O telefone dev ter no máximo 11 caracteres.⚠️") String telefone) {
        this.telefone = telefone;
    }
}

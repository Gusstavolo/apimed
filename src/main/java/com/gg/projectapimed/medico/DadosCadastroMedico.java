package com.gg.projectapimed.medico;


import com.gg.projectapimed.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
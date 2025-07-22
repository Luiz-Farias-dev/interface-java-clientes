package br.com.luizfarias.clientes.logicanegocio;

import java.util.UUID;

public interface Cadastro<T> {
    void salvar(T objetoCadastrar);
    T consultar(UUID codigo);
    void deletar(UUID codigo);
    void atualizar(T objetoAtualizar);
}

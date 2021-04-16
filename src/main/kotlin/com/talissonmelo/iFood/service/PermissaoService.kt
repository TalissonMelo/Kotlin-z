package com.talissonmelo.iFood.service

import com.talissonmelo.iFood.model.Permissao
import com.talissonmelo.iFood.repository.PermissaoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PermissaoService ( @Autowired var repository: PermissaoRepository) {

    fun buscarPermissaoId(idPermissao: Long) : Permissao {
        return repository.findById(idPermissao).get();
    }
}
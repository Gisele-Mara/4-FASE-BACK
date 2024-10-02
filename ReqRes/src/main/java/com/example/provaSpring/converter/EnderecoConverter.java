package com.example.provaSpring.converter;

import com.example.provaSpring.dto.req.EnderecoDTOReq;
import com.example.provaSpring.entities.Endereco;

public class EnderecoConverter {
    
      public EnderecoDTOReq EnderecotoDtoReq(Endereco entity){

      EnderecoDTOReq dtozinho = new EnderecoDTOReq();
      dtozinho.setRua(entity.getRua());
      dtozinho.setNumero(entity.getNumero());
      dtozinho.setCidade(entity.getCidade());
      
      return dtozinho;

   }
}

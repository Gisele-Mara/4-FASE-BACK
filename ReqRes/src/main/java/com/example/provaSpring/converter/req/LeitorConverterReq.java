package com.example.provaSpring.converter.req;

import java.util.List;

import com.example.provaSpring.dto.req.EmprestimoDTOReq;
import com.example.provaSpring.dto.req.EnderecoDTOReq;
import com.example.provaSpring.dto.req.LeitorDTOReq;
import com.example.provaSpring.entities.Emprestimos;
import com.example.provaSpring.entities.Endereco;
import com.example.provaSpring.entities.Leitor;

// --- Não implementado ---
public interface LeitorConverterReq {
   

   public static EnderecoDTOReq EnderecotoDtoReq(Endereco entity) {

      EnderecoDTOReq dtozinho = new EnderecoDTOReq();
      dtozinho.setRua(entity.getRua());
      dtozinho.setNumero(entity.getNumero());
      dtozinho.setCidade(entity.getCidade());

      return dtozinho;

   }

   public static EmprestimoDTOReq EmprestimosToDTOReq(Emprestimos entity) {

      EmprestimoDTOReq dtozinho = new EmprestimoDTOReq();
      dtozinho.setLivro(entity.getLivro());
      dtozinho.setDataEmprestismo(entity.getDataEmprestismo());

      return dtozinho;

   }
   
   public static LeitorDTOReq LeitorDTOReq(Leitor entity) {

      LeitorDTOReq dtozinho = new LeitorDTOReq();
      dtozinho.setId(entity.getId_leitor());
      dtozinho.setNome(entity.getNome());
      dtozinho.setEndereco(EnderecotoDtoReq(entity.getEndereco()));

      List<EmprestimoDTOReq> emprestimosRes = entity.getEmprestimos()
            .stream()
            .map(emp -> EmprestimosToDTOReq(emp))
            .toList();

      dtozinho.setEmprestimos(emprestimosRes);
      return dtozinho;
   }
}

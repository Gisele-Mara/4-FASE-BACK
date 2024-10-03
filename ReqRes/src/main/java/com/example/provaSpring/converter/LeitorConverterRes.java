package com.example.provaSpring.converter;

import java.util.List;

import com.example.provaSpring.dto.EmprestimoDTORes;
import com.example.provaSpring.dto.EnderecoDTORes;
import com.example.provaSpring.dto.LeitorDTORes;
import com.example.provaSpring.entities.Emprestimos;
import com.example.provaSpring.entities.Endereco;
import com.example.provaSpring.entities.Leitor;

public interface LeitorConverterRes {
    
    public static LeitorDTORes converterDTORes(Leitor entity) {

      LeitorDTORes dtozinho = new LeitorDTORes();
      dtozinho.setId(entity.getId_leitor());
      dtozinho.setNome(entity.getNome());
      dtozinho.setEndereco(EnderecotoDtoRes(entity.getEndereco()));

      List<EmprestimoDTORes> emprestimosRes = entity.getEmprestimos()
            .stream()
            .map(emp -> EmprestimosToDTORes(emp))
            .toList();

      dtozinho.setEmprestimos(emprestimosRes);
      return dtozinho;
   }

   public static EnderecoDTORes EnderecotoDtoRes(Endereco entity) {

      EnderecoDTORes dtozinho = new EnderecoDTORes();
      dtozinho.setRua(entity.getRua());
      dtozinho.setNumero(entity.getNumero());
      dtozinho.setCidade(entity.getCidade());

      return dtozinho;

   }

   public static EmprestimoDTORes EmprestimosToDTORes(Emprestimos entity) {

      EmprestimoDTORes dtozinho = new EmprestimoDTORes();
      dtozinho.setLivro(entity.getLivro());
      dtozinho.setDataEmprestismo(entity.getDataEmprestismo());

      return dtozinho;

   }
}

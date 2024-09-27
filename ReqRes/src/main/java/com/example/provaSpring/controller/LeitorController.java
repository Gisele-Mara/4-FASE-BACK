package com.example.provaSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.provaSpring.dto.EmprestimoDTORes;
import com.example.provaSpring.dto.EnderecoDTORes;
import com.example.provaSpring.dto.LeitorDTORes;
import com.example.provaSpring.entities.Emprestimos;
import com.example.provaSpring.entities.Endereco;
import com.example.provaSpring.entities.Leitor;
import com.example.provaSpring.services.EmprestimosService;
import com.example.provaSpring.services.EnderecoService;
import com.example.provaSpring.services.LeitorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/leitores")
public class LeitorController {
   
    @Autowired
     LeitorService leitorService;
   
    @Autowired
     EnderecoService enderecoService;
   
    @Autowired
     EmprestimosService emprestimoService;

   


     @GetMapping("leitor/{id}")
     public ResponseEntity<LeitorDTORes> getAll(@PathVariable(name = "id") Long id_param) {

        Leitor a = leitorService.getLeitorById(id_param);

        LeitorDTORes dtoRes = convertToDTOReq(a);
      
         return ResponseEntity.ok(dtoRes);
     }

     public LeitorDTORes convertToDTOReq(Leitor entity){

        LeitorDTORes dtozinho = new LeitorDTORes();
        dtozinho.setId(entity.getId_leitor());
        dtozinho.setNome(entity.getNome());
        dtozinho.setEndereco(EnderecotoDto(entity.getEndereco()));

         
                List<EmprestimoDTORes> emprestimosRes = entity.getEmprestimos()
                .stream()
                .map(emp ->EmprestimosconvertToDTO(emp))
                .toList();

                dtozinho.setEmprestimos(emprestimosRes);
                return dtozinho;
     }

     public EnderecoDTORes EnderecotoDto(Endereco entity){

        EnderecoDTORes dtozinho = new EnderecoDTORes();
        dtozinho.setRua(entity.getRua());
        dtozinho.setNumero(entity.getNumero());
        dtozinho.setCidade(entity.getCidade());
        
        return dtozinho;

     }

     public EmprestimoDTORes EmprestimosconvertToDTO(Emprestimos entity){

        EmprestimoDTORes dtozinho = new EmprestimoDTORes();
        dtozinho.setLivro(entity.getLivro());
        dtozinho.setDataEmprestismo(entity.getDataEmprestismo());
        
        return dtozinho;

     }


     public LeitorDTORes convertToDTORes(Leitor entity){

        LeitorDTORes dtozinho = new LeitorDTORes();
        dtozinho.setNome(entity.getNome());
        dtozinho.setEndereco(EnderecotoDto(entity.getEndereco()));

         
                List<EmprestimoDTORes> emprestimosRes = entity.getEmprestimos()
                .stream()
                .map(emp ->EmprestimosconvertToDTO(emp))
                .toList();

                dtozinho.setEmprestimos(emprestimosRes);
                return dtozinho;
     }


     @PostMapping("/a")
     public ResponseEntity<?> postMethodName(@RequestBody Leitor entity) {
        

      var dtoRes = leitorService.createLeitor(entity);
      entity.getEndereco().setLeitor(dtoRes);
      var EnderecoDBRes = enderecoService.createEndereco(entity.getEndereco());
      emprestimoService.createManyEmprestimo(entity.getEmprestimos(),  dtoRes.getId_leitor());
        
        
        // LeitorDTORes response = convertToDTORes(dtoRes);
      //   return ResponseEntity.ok(getAll(dtoRes.getId_leitor()));

        return ResponseEntity.ok("OK");
    
         
   
     }
     
     
}

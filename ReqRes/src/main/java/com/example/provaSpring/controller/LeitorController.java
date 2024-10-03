package com.example.provaSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.provaSpring.converter.LeitorConverterRes;
import com.example.provaSpring.converter.req.LeitorConverterReq;
import com.example.provaSpring.dto.EmprestimoDTORes;
import com.example.provaSpring.dto.EnderecoDTORes;
import com.example.provaSpring.dto.LeitorDTORes;
import com.example.provaSpring.dto.req.EmprestimoDTOReq;
import com.example.provaSpring.dto.req.EnderecoDTOReq;
import com.example.provaSpring.dto.req.LeitorDTOReq;
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
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/leitores")
public class LeitorController {

   @Autowired
   LeitorService leitorService;

   @Autowired
   EnderecoService enderecoService;

   @Autowired
   EmprestimosService emprestimoService;

   @GetMapping("/")
   public ResponseEntity<List<LeitorDTORes>> getAllLeitores() {

       var allLeitors = leitorService.getAllLeitor()
            .stream()
            .map(emp -> LeitorConverterRes.converterDTORes(emp))
            .toList();

       return ResponseEntity.ok(allLeitors);
   }
   

   @GetMapping("/{id}")
   public ResponseEntity<LeitorDTORes> getAll(@PathVariable(name = "id") Long id_param) {

      Leitor a = leitorService.getLeitorById(id_param);

      LeitorDTORes dtoRes = LeitorConverterRes.converterDTORes(a);

      return ResponseEntity.ok(dtoRes);
   }

   @PostMapping("/")
   public ResponseEntity<LeitorDTOReq> postMethodName(@RequestBody Leitor entity) {

      var dtoRes = leitorService.createLeitor(entity);
      entity.getEndereco().setLeitor(dtoRes);
      var EnderecoDBRes = enderecoService.createEndereco(entity.getEndereco());
      var EmprestimoDBRes = emprestimoService.createManyEmprestimo(entity.getEmprestimos(), dtoRes.getId_leitor());

      dtoRes.setEndereco(EnderecoDBRes);
      dtoRes.setEmprestimos(EmprestimoDBRes);
      // LeitorDTOReq response = converterDTOReq(dtoRes);
      LeitorDTOReq response = LeitorConverterReq.LeitorDTOReq(dtoRes);
      // return ResponseEntity.ok(getAll(dtoRes.getId_leitor()));

      return ResponseEntity.ok(response);

   }

}

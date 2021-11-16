package com.webservice.exemplo.ExemploRestWebservice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.exemplo.ExemploRestWebservice.model.PessoaModel;



@RestController
public class PessoaController {

	List<PessoaModel> pessoas = new ArrayList<PessoaModel>();
    {
    	pessoas.add(new PessoaModel("Rosa", "soteropolitana", "1990"));
    	pessoas.add(new PessoaModel("Ramon", "soteropolitano", "1980"));
    	pessoas.add(new PessoaModel("Maria", "recifense", "2000"));
    	pessoas.add(new PessoaModel("João", "capixaba", "1911"));
    }
 
    
    @RequestMapping(value = "/getPessoas", method = RequestMethod.GET)
    public List<PessoaModel> getPessoas() {
        return pessoas;
    }
 
    
    @RequestMapping(value = "/getPessoa/{nomePessoa}", method = RequestMethod.GET)
    public PessoaModel getPessoa(@PathVariable(value = "nomePessoa") String nome) {
        return pessoas.stream().filter(x -> x.getNome().equalsIgnoreCase(nome)).collect(Collectors.toList()).get(0);
    }
 
    
    
    @RequestMapping(value = "/getPessoasPorNaturalidade/{naturalidadePessoa}", method = RequestMethod.GET)
    public List<PessoaModel> getPessoaPorNaturalidade(@PathVariable(value = "naturalidadePessoa") String naturalidade) {
        System.out.println("Pesquisando pessoas pela naturalidade : " + naturalidade);
        List<PessoaModel> pessoasNaturalidade = pessoas.stream().filter(x -> x.getNaturalidade().equalsIgnoreCase(naturalidade))
                .collect(Collectors.toList());
        System.out.println(pessoasNaturalidade);
        return pessoasNaturalidade;
    }
 
    @RequestMapping(value = "/getPessoasPorAnoNascimento/{ano}", method = RequestMethod.GET)
    public List<PessoaModel> getPessoaPorAnoNascimento(@PathVariable(value = "ano") String ano) {
        return pessoas.stream().filter(x -> x.getAnoNascimento().equalsIgnoreCase(ano)).collect(Collectors.toList());
    }
	
}

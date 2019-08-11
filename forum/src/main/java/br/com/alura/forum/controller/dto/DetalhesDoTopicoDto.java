package br.com.alura.forum.controller.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.model.StatusTopico;
import br.com.alura.forum.model.Topico;

public class DetalhesDoTopicoDto extends TopicoDto {

	private String nomeAutor;
	private StatusTopico statusTopico;
	private List<RespostaDto> respostas;

	public DetalhesDoTopicoDto(Topico topico) {
		super(topico);
		this.nomeAutor = topico.getAutor().getNome();
		this.statusTopico = topico.getStatus();
		this.respostas = new ArrayList<RespostaDto>();
		this.respostas.addAll(topico.getRespostas().stream().map(RespostaDto::new).collect(Collectors.toList()));
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public StatusTopico getStatusTopico() {
		return statusTopico;
	}

	public List<RespostaDto> getRespostas() {
		return respostas;
	}

}

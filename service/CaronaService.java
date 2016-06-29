package main.java.br.com.caronex.service;

import java.util.List;

import main.java.br.com.caronex.domain.Avaliacao;
import main.java.br.com.caronex.domain.Carona;
import main.java.br.com.caronex.domain.Endereco;
import main.java.br.com.caronex.repository.CaronaRepository;
import main.java.br.com.caronex.util.SpringUtil;

import org.springframework.context.ApplicationContext;

public class CaronaService {

	private CaronaRepository caronaDao;
	
	public CaronaService(){
	
		ApplicationContext context = SpringUtil.getContext();
		caronaDao =  context.getBean(CaronaRepository.class);
	}
	
	public void oferecerCarona(Carona e){
		caronaDao.save(e);
	}
	
	public List<Carona> getCaronasDisponiveis(){
		return caronaDao.findAll();
	}
	
	public List<Carona> getByPassageiroId(String id){
		return caronaDao.findByPassageiro(id);
	}
	
	public List<Avaliacao> getByAvaliacaoNotaGreaterThan(Long nota){
		return caronaDao.findByAvaliacaoNotaGreaterThan(nota);
	}
	
	public List<Carona> getByDia(Date dia){
		return caronaDao.findByDia(dia);
	}
	
}

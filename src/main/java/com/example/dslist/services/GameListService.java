package com.example.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dslist.dto.GameListDTO;
import com.example.dslist.entities.GameList;
import com.example.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<GameListDTO>  findAll() {
	
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
	
}

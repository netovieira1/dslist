package com.netovieira.dslist.services;

import com.netovieira.dslist.dto.GameDTO;
import com.netovieira.dslist.dto.GameListDTO;
import com.netovieira.dslist.dto.GameMinDTO;
import com.netovieira.dslist.entities.Game;
import com.netovieira.dslist.entities.GameList;
import com.netovieira.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}

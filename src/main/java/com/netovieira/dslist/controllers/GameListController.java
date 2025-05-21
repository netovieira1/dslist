package com.netovieira.dslist.controllers;

import com.netovieira.dslist.dto.GameListDTO;
import com.netovieira.dslist.entities.GameList;
import com.netovieira.dslist.repositories.GameListRepository;
import com.netovieira.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }
}

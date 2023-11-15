package com.ricardoaugusto.dslit.services;

import com.ricardoaugusto.dslit.dto.GameMinDTO;
import com.ricardoaugusto.dslit.entities.Game;
import com.ricardoaugusto.dslit.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

}

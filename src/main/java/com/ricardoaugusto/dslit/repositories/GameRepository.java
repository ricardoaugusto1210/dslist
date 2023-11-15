package com.ricardoaugusto.dslit.repositories;

import com.ricardoaugusto.dslit.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}

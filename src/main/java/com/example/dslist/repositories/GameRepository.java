package com.example.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dslist.entities.GameList;

public interface GameRepository extends JpaRepository<GameList, Long> {

}

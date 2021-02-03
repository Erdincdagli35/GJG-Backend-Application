package com.example.GJG.repository;

import com.example.GJG.model.Score;
import com.example.GJG.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score,Long> {
}

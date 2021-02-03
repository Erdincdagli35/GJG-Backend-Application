package com.example.GJG.repository;

import com.example.GJG.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    //Created @Query and getBySequence() Method For Sorting "points" field
    @Query(value = "SELECT * FROM gjg_spring_database.user ORDER BY points DESC",
            nativeQuery = true)
    List<User> getBySequence();



}

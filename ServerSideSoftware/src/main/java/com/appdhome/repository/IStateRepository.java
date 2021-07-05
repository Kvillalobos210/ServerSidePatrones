package com.appdhome.repository;


import com.appdhome.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStateRepository extends JpaRepository<State,Long> {
    public State findByState(String name);

}

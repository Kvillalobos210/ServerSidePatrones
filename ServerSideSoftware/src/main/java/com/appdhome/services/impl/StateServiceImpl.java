package com.appdhome.services.impl;


import com.appdhome.entities.State;
import com.appdhome.repository.IStateRepository;

import com.appdhome.services.IStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class StateServiceImpl implements IStateService {
    @Autowired
    IStateRepository stateRepository;

    @Override
    @Transactional
    public State save(State state) throws Exception {
        return stateRepository.save(state);
    }

    @Override
    public void delete(Long id) throws Exception {

    }

    @Override
    public List<State> getAll() throws Exception {
        return null;
    }

    @Override
    public Optional<State> getById(Long id) throws Exception {
        return Optional.empty();
    }

    @Override
    public State findByState(String name) throws Exception {
        return null;
    }
}

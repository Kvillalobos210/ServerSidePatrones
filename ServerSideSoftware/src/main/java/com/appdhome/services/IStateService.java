package com.appdhome.services;


import com.appdhome.entities.State;

public interface IStateService extends CrudService<State>{
    public State findByState(String name) throws Exception;
}

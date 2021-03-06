package com.appdhome.controller;

import com.appdhome.entities.Specialty;
import com.appdhome.entities.State;
import com.appdhome.services.IStateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/state")
@Api(tags = "State", value = "RESTFul de States")
public class StateController {
    @Autowired
    private IStateService stateService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Crear un estado", notes = "Crear un estado")
    @ApiResponses({
            @ApiResponse(code = 201, message = "State creada"),
            @ApiResponse(code = 404, message = "State no creada")
    })
    public ResponseEntity<State> insertState(@RequestBody State state){
        try{
            State stateNew = stateService.save(state);
            return ResponseEntity.status(HttpStatus.CREATED).body(stateNew);
        }catch (Exception e){
            return new ResponseEntity<State>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

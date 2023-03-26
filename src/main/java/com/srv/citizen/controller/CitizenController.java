package com.srv.citizen.controller;

import com.srv.citizen.entity.Citizen;
import com.srv.citizen.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    private CitizenService citizenService;


    @RequestMapping("/test")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

    @RequestMapping(path = "/id/{id}", method = RequestMethod.GET)
    public ResponseEntity<List<Citizen>> getListOfCitizenByVaccineCentreId(@PathVariable Integer id){

        List<Citizen> citizens = citizenService.getCitizen(id);

        return new ResponseEntity<>(citizens, HttpStatus.OK);

    }

    @PostMapping(path = "/add")
    public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen){
        Citizen citizen = citizenService.addCitizen(newCitizen);
        return new ResponseEntity<>(citizen, HttpStatus.OK);
    }
}

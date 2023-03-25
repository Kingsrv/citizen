package com.srv.citizen.service;

import com.srv.citizen.CitizenApplication;
import com.srv.citizen.entity.Citizen;
import com.srv.citizen.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenServiceImpl implements CitizenService{

    @Autowired
    private CitizenRepository citizenRepository;

    @Override
    public List<Citizen> getCitizen(Integer id) {
        return citizenRepository.findByVaccinationCentreId(id);
    }

    @Override
    public Citizen addCitizen(Citizen citizen) {
        return citizenRepository.save(citizen);
    }
}

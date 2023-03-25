package com.srv.citizen.service;

import com.srv.citizen.entity.Citizen;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CitizenService {

    List<Citizen> getCitizen(Integer id);

    Citizen addCitizen(Citizen citizen);
}

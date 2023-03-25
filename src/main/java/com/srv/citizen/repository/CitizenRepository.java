package com.srv.citizen.repository;

import com.srv.citizen.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {

    List<Citizen> findByVaccinationCentreId(Integer id);
}

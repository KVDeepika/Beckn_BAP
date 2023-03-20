package com.tibil.BecknBAP.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tibil.BecknBAP.model.ServiceRequest;

@Repository
public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, String> {

}

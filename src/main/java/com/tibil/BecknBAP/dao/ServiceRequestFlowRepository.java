package com.tibil.BecknBAP.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tibil.BecknBAP.model.ServiceRequestFlow;

@Repository
public interface ServiceRequestFlowRepository extends JpaRepository<ServiceRequestFlow, Long> {
	
	public List<ServiceRequestFlow> findByTransactionIdAndAction(String transactionId, String action);

}

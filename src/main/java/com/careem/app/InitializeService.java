package com.careem.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import domain.QuotationsDomain;


@RestController
public class InitializeService {
	
	InitializeService(){
	}
	
	public ResponseEntity<?> loadShipmentQuotations(QuotationsDomain quotations){
		ResponseEntity<?> responseEntity = null;
		
		try{
			return responseEntity;
		}catch(Exception ex){
			ex.printStackTrace();
			return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}

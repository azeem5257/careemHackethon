package services;

import domain.QuotationsDomain;
import domain.QuotationsTable;

public class InsertQuotations {

	public void insertQuotations(QuotationsDomain questionDomain){
		
		QuotationsTable qt = new QuotationsTable();
		qt.qd = questionDomain;
		
		QuotationsTable.Table table = qt.new Table(); 
		
		for(QuotationsDomain qd : questionDomain.getPartner()){
			table.partner = qd;
			table.weight = 10;
		}
	}
}

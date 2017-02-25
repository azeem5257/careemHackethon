package domain;

public class QuotationsTable {
	
	public QuotationsDomain qd;
	public Table table;
	
	public class Table{
		public QuotationsDomain partner;
		public Integer weight;
	}
}


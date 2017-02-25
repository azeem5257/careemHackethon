package domain;

import java.util.List;

public class QuotationsDomain {
	
	private String name;
	private String CPW;
	private String CPK;
	private String TPK;
	private List<QuotationsDomain> partner;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCPW() {
		return CPW;
	}
	public void setCPW(String cPW) {
		CPW = cPW;
	}
	public String getCPK() {
		return CPK;
	}
	public void setCPK(String cPK) {
		CPK = cPK;
	}
	public String getTPK() {
		return TPK;
	}
	public void setTPK(String tPK) {
		TPK = tPK;
	}
	public List<QuotationsDomain> getPartner() {
		return partner;
	}
	public void setPartner(List<QuotationsDomain> partner) {
		this.partner = partner;
	}
}

package com.mrs.nara.vo;

public class NoticeVo extends PagingVo {
	int    NOTICENO;
	String NOTICE;
	String CLASSIFY_CODE;
	String INSERTDATE;
	String UPDATEDATE;

	public int getNOTICENO() {
		return NOTICENO;
	}
	public void setNOTICENO(int nOTICENO) {
		NOTICENO = nOTICENO;
	}
	public String getNOTICE() {
		return NOTICE;
	}
	public void setNOTICE(String nOTICE) {
		NOTICE = nOTICE;
	}
	public String getCLASSIFY_CODE() {
		return CLASSIFY_CODE;
	}
	public void setCLASSIFY_CODE(String cLASSIFY_CODE) {
		CLASSIFY_CODE = cLASSIFY_CODE;
	}
	public String getINSERTDATE() {
		return INSERTDATE;
	}
	public void setINSERTDATE(String iNSERTDATE) {
		INSERTDATE = iNSERTDATE;
	}
	public String getUPDATEDATE() {
		return UPDATEDATE;
	}
	public void setUPDATEDATE(String uPDATEDATE) {
		UPDATEDATE = uPDATEDATE;
	}
	
	
	
}

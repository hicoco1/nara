package com.mrs.nara.vo;

public class BannedTermsVo extends PagingVo{
	String BT_SEQ       ="";
	String BT_TEXT      ="";
	String INSERT_DATE  ="";
	
	public String getBT_SEQ() {
		return BT_SEQ;
	}
	public void setBT_SEQ(String bT_SEQ) {
		BT_SEQ = bT_SEQ;
	}
	public String getBT_TEXT() {
		return BT_TEXT;
	}
	public void setBT_TEXT(String bT_TEXT) {
		BT_TEXT = bT_TEXT;
	}
	public String getINSERT_DATE() {
		return INSERT_DATE;
	}
	public void setINSERT_DATE(String iNSERT_DATE) {
		INSERT_DATE = iNSERT_DATE;
	}


	
}

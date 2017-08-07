package com.mrs.nara.vo;

public class QuestionVo extends PagingVo{
	int    QUESTIONNO   ;
	String QUESTION     ;
	String ANSWER       ;
	String CLASSIFY_CODE;
	String INSERTDATE   ;
	String UPDATEDATE   ;

	public int getQUESTIONNO() {
		return QUESTIONNO;
	}
	public void setQUESTIONNO(int qUESTIONNO) {
		QUESTIONNO = qUESTIONNO;
	}
	public String getQUESTION() {
		return QUESTION;
	}
	public void setQUESTION(String qUESTION) {
		QUESTION = qUESTION;
	}
	public String getANSWER() {
		return ANSWER;
	}
	public void setANSWER(String aNSWER) {
		ANSWER = aNSWER;
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

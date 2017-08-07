package com.mrs.nara.vo;

public class OperatorLogVo extends PagingVo{
	String LOG_SEQ     ="";
	String LOG_DATE    ="";
	String OP_ID       ="";
	String OP_IP       ="";
	String KEYWORD     ="";
	String COMMAND     ="";
	String COMMENTS    ="";
	String RESULT      ="";
	String UPDATE_DATE ="";
	String INSERT_DATE ="";
	public String getLOG_SEQ() {
		return LOG_SEQ;
	}
	public void setLOG_SEQ(String lOG_SEQ) {
		LOG_SEQ = lOG_SEQ;
	}
	public String getLOG_DATE() {
		return LOG_DATE;
	}
	public void setLOG_DATE(String lOG_DATE) {
		LOG_DATE = lOG_DATE;
	}
	public String getOP_ID() {
		return OP_ID;
	}
	public void setOP_ID(String oP_ID) {
		OP_ID = oP_ID;
	}
	public String getOP_IP() {
		return OP_IP;
	}
	public void setOP_IP(String oP_IP) {
		OP_IP = oP_IP;
	}
	public String getKEYWORD() {
		return KEYWORD;
	}
	public void setKEYWORD(String kEYWORD) {
		KEYWORD = kEYWORD;
	}
	public String getCOMMAND() {
		return COMMAND;
	}
	public void setCOMMAND(String cOMMAND) {
		COMMAND = cOMMAND;
	}
	public String getCOMMENTS() {
		return COMMENTS;
	}
	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}
	public String getRESULT() {
		return RESULT;
	}
	public void setRESULT(String rESULT) {
		RESULT = rESULT;
	}
	public String getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(String uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}
	public String getINSERT_DATE() {
		return INSERT_DATE;
	}
	public void setINSERT_DATE(String iNSERT_DATE) {
		INSERT_DATE = iNSERT_DATE;
	}

}

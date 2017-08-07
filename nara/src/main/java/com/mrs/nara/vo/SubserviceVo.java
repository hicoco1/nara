package com.mrs.nara.vo;

public class SubserviceVo extends PagingVo {
	String USER_ID                   ="";
	String SVC_CODE                  ="";
	String SVCSTATUS                 ="";
	String CALLSERVICE_JOIN_ROUTE    ="";
	String JOINDATE                  ="";
	String CLOSEDATE                 ="";
	String UPDATEDATE                ="";
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getSVC_CODE() {
		return SVC_CODE;
	}
	public void setSVC_CODE(String sVC_CODE) {
		SVC_CODE = sVC_CODE;
	}
	public String getSVCSTATUS() {
		return SVCSTATUS;
	}
	public void setSVCSTATUS(String sVCSTATUS) {
		SVCSTATUS = sVCSTATUS;
	}
	public String getCALLSERVICE_JOIN_ROUTE() {
		return CALLSERVICE_JOIN_ROUTE;
	}
	public void setCALLSERVICE_JOIN_ROUTE(String cALLSERVICE_JOIN_ROUTE) {
		CALLSERVICE_JOIN_ROUTE = cALLSERVICE_JOIN_ROUTE;
	}
	public String getJOINDATE() {
		return JOINDATE;
	}
	public void setJOINDATE(String jOINDATE) {
		JOINDATE = jOINDATE;
	}
	public String getCLOSEDATE() {
		return CLOSEDATE;
	}
	public void setCLOSEDATE(String cLOSEDATE) {
		CLOSEDATE = cLOSEDATE;
	}
	public String getUPDATEDATE() {
		return UPDATEDATE;
	}
	public void setUPDATEDATE(String uPDATEDATE) {
		UPDATEDATE = uPDATEDATE;
	}

}

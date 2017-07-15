package com.allshop.framework.persistence.common;

public class ElementosComunesVo {
	protected String statusFlag;
	protected String expiryDt;
	protected String lastUpdateDt;
	protected String lastUpdateTxId;
	protected String lastUpdateUser;

	public String getStatusFlag() {
		return statusFlag;
	}

	public void setStatusFlag(String statusFlag) {
		this.statusFlag = statusFlag;
	}

	public String getExpiryDt() {
		return expiryDt;
	}

	public void setExpiryDt(String expiryDt) {
		this.expiryDt = expiryDt;
	}

	public String getLastUpdateDt() {
		return lastUpdateDt;
	}

	public void setLastUpdateDt(String lastUpdateDt) {
		this.lastUpdateDt = lastUpdateDt;
	}

	public String getLastUpdateTxId() {
		return lastUpdateTxId;
	}

	public void setLastUpdateTxId(String lastUpdateTxId) {
		this.lastUpdateTxId = lastUpdateTxId;
	}

	public String getLastUpdateUser() {
		return lastUpdateUser;
	}

	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

}

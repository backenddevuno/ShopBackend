package com.allshop.framework.persistence.common;

import java.util.Date;

public class ElementosComunesVo {
	protected int statusFlag;
	protected Date expiryDt;
	protected Date lastUpdateDt;
	protected long lastUpdateTxId;
	protected String lastUpdateUser;
	
	public int getStatusFlag() {
		return statusFlag;
	}
	public void setStatusFlag(int statusFlag) {
		this.statusFlag = statusFlag;
	}
	public Date getExpiryDt() {
		return expiryDt;
	}
	public void setExpiryDt(Date expiryDt) {
		this.expiryDt = expiryDt;
	}
	public Date getLastUpdateDt() {
		return lastUpdateDt;
	}
	public void setLastUpdateDt(Date lastUpdateDt) {
		this.lastUpdateDt = lastUpdateDt;
	}
	public long getLastUpdateTxId() {
		return lastUpdateTxId;
	}
	public void setLastUpdateTxId(long lastUpdateTxId) {
		this.lastUpdateTxId = lastUpdateTxId;
	}
	public String getLastUpdateUser() {
		return lastUpdateUser;
	}
	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}
	
}

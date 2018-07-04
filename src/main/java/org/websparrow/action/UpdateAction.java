package org.websparrow.action;

import org.websparrow.dao.Admin;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport {
	private static final long serialVersionUID = -3827439829486925185L;
	// getters and setters
	private String uname, udeg, uemail, upass, msg;
	private String hiddenuemail;
	Admin dao = null;

	@Override
	public String execute() throws Exception {
		dao = new Admin();
		msg = dao.updateUser(uname, uemail, upass, udeg, hiddenuemail);
		return "UPDATE";
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUdeg() {
		return udeg;
	}

	public void setUdeg(String udeg) {
		this.udeg = udeg;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getHiddenuemail() {
		return hiddenuemail;
	}

	public void setHiddenuemail(String hiddenuemail) {
		this.hiddenuemail = hiddenuemail;
	}

}

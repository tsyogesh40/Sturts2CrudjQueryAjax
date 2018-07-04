package org.websparrow.action;

import org.websparrow.dao.Admin;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport {
	private static final long serialVersionUID = -3827439829486925185L;
	private String uemail, msg;
	Admin dao = null;

	@Override
	public String execute() throws Exception {
		dao = new Admin();
		msg = dao.deleteUser(uemail);
		return "DELETE";
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}

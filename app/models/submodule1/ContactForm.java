package models.submodule1;

import javax.persistence.Entity;

@Entity
public class ContactForm extends BaseModel {

	private String name;
	private String email;
	private String message;
	private String app;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}






}

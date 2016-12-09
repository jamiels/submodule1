package controllers.submodule1;

import com.avaje.ebean.Ebean;

import models.submodule1.ContactForm;
import play.data.Form;
import play.mvc.Result;

public class ContactFormController extends BaseController {

	public Result submitContactForm() {
		Form<ContactForm> fcf =	ff.form(ContactForm.class).bindFromRequest();
		ContactForm cf = fcf.get();
		Ebean.save(cf);
		return ok("");
	}

}

package controllers.raven;

import com.avaje.ebean.Ebean;

import models.raven.ContactForm;
import play.data.Form;
import play.mvc.Result;
import services.SendGridService;

public class ContactFormController extends BaseController {

	public Result submitContactForm() {
		Form<ContactForm> fcf =	ff.form(ContactForm.class).bindFromRequest();
		ContactForm cf = fcf.get();
		Ebean.save(cf);
		return ok("");
	}

}

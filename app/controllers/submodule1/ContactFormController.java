package controllers.submodule1;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;

import models.submodule1.ContactForm;
import play.data.Form;
import play.mvc.Result;

public class ContactFormController extends BaseController {

	// /postContactForm
	public Result submitContactForm() {
		Form<ContactForm> fcf =	ff.form(ContactForm.class).bindFromRequest();
		ContactForm cf = fcf.get();
		Ebean.save(cf);
		return ok("Thanks " + cf.getName());
	}

	public Result show() {
		return ok(views.html.contactForm.render());
	}


}

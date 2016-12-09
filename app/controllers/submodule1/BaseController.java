package controllers.submodule1;

import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import play.data.FormFactory;
import play.mvc.Controller;

public class BaseController extends Controller {

	@Inject protected FormFactory ff;

	protected void p(String s){
		System.out.println(s);
	}

}

package controllers.submodule1;

public class BaseController extends Controller {

	@Inject protected FormFactory ff;

	protected void p(String s){
		System.out.println(s);
	}

}

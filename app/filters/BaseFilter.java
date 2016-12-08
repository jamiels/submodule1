package filters;

import play.api.mvc.EssentialFilter;
import play.http.DefaultHttpFilters;

public class BaseFilter extends DefaultHttpFilters {

	public BaseFilter(EssentialFilter... filters) {
		super(filters);
		// TODO Auto-generated constructor stub
	}


}

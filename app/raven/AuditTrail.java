package raven;

import com.avaje.ebean.Ebean;

public class AuditTrail {
	public static void publish (String description) {
		models.raven.AuditTrail at = new models.raven.AuditTrail();
		at.setDescription(description);
		Ebean.save(at);
		System.out.println("PadWow Audit Trail: " + description);
	}

}

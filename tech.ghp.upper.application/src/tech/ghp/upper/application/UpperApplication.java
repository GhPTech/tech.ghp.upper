package tech.ghp.upper.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import osgi.enroute.configurer.api.RequireConfigurerExtender;
import osgi.enroute.google.angular.capabilities.RequireAngularWebResource;
import osgi.enroute.rest.api.REST;
//import osgi.enroute.rest.api.RESTRequest;
import osgi.enroute.twitter.bootstrap.capabilities.RequireBootstrapWebResource;
import osgi.enroute.webserver.capabilities.RequireWebServerExtender;
import tech.ghp.upper.api.Upper;

@RequireAngularWebResource(resource={"angular.js","angular-resource.js", "angular-route.js"}, priority=1000)
@RequireBootstrapWebResource(resource="css/bootstrap.css")
@RequireWebServerExtender
@RequireConfigurerExtender
@Component(name="tech.ghp.upper")
public class UpperApplication implements REST {

	//public String getUpper(RESTRequest req, String string) throws Exception{
	//	return string.toUpperCase();
	//}
	
	public String getUpper(String string) {
			return upper.upper(string);
	}
	
	@Reference
	Upper		upper;

}

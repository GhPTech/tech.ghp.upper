package tech.ghp.upper.provider;

import org.osgi.service.component.annotations.Component;

import tech.ghp.upper.api.Upper;

/**
 * 
 */
@Component(name = "tech.ghp.upper")
public class UpperImpl implements Upper{
	public String upper(String input){
		
		return input.toUpperCase();
		
	}
}

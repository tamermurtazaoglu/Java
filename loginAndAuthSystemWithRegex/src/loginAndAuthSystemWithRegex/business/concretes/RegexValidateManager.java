package loginAndAuthSystemWithRegex.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import loginAndAuthSystemWithRegex.business.abstracts.ValidateService;

public class RegexValidateManager implements ValidateService{
	
	String regex;
	String text;
	
	Pattern pattern;
	Matcher matcher;
	
	public RegexValidateManager() {
		
	}	
	
	@Override
	public boolean validateEmail(String email) {
		this.text = email;
		String regex = "^(.+)@(.+)$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(text);
		return matcher.matches();
	}
	
}

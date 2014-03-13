package models;

import play.data.validation.Constraints.Required;


public class Hello {
	@Required
	public String name;
}
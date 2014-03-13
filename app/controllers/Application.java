package controllers;

import java.util.List;

import models.Hello;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import repository.Persons;
import views.html.hello;
import views.html.index;
import views.html.person;


public class Application extends Controller {

	public static Result index() {
		return ok(index.render(form(Hello.class)));
	}

	public static Result sayHello() {
		Form<Hello> form = form(Hello.class).bindFromRequest();
		if (form.hasErrors()) {
			return badRequest(index.render(form));
		} else {
			Hello data = form.get();
			repository.Persons messages = new Persons();
			messages.savePerson(data.name);
			return ok(hello.render(data.name));

		}
	}

	public static Result getPersons() {
		repository.Persons personsRepo = new Persons();
		List<String> personsList = personsRepo.getPersons();
		return ok(person.render(personsList ));
	}
}
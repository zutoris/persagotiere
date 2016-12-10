package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class ChoiceController @Inject() extends Controller {

  def choice(email: String) = Action {
    // interroger la BDD
    // si email exite, choix déjà fait
    Ok(views.html.viewChoice("Voici ce que vous avez sélectionné :"+email))
    // sinon
    Ok(views.html.makeChoice("Faites un choix."))
  }

}

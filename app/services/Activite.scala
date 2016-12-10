package services

import anorm._
import play.api.db.DB
import javax.inject.Singleton

/** Activité */
trait Activite {
  def emailStored(pEmail: String): Boolean
}

/** implémentation */
@Singleton
class ActiviteImpl extends Activite {  
  //private val atomicCounter = new AtomicInteger()
  
  /*DB.withConnection { implicit c =>
  val activityKey: Int = SQL("select act.* from participation prt inner join activity act on prt.activity=act.id where prt.email = {courriel}")
  .on("courriel" -> pEmail).execute()
}*/
  
  override def emailStored(pEmail: String): Boolean = true
}

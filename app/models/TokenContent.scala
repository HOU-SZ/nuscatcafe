package models

import play.api.libs.json.Json
import spray.json._

// Create our Post type
case class TokenContent(email:String, isAdmin:String)

object TokenContent {
  // We're going to be serving this type as JSON, so specify a
  // default Json formatter for our Post type here
  implicit val format = Json.format[TokenContent]

}

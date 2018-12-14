
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Welcome to Play")/*12.25*/ {_display_(Seq[Any](format.raw/*12.27*/("""

    """),format.raw/*17.8*/("""

    """),format.raw/*19.5*/("""<div class="show-btn">
        <div class="show-login-btn">
            <i class="fas fa-sign-in-alt"></i>
            Show Login Form
        </div>
        <div class="show-sign-up-btn">
            <i class="fas fa-sign-in-alt"></i>
            Show Sign Up Form
        </div>
    </div>
    <div class="login-box">
        <div class="hide-login-btn"><i class="fas fa-times"></i></div>
        <form class="login-form" action="/signin" method="post">
            <h1>Login</h1>
            <input class="txtb" type="text" name="" placeholder="Username">
            <input class="txtb" type="password" name="" placeholder="Password">
            <input class="login-btn" type="submit" name="" value="Login">
            """),_display_(/*36.14*/helper/*36.20*/.CSRF.formField),format.raw/*36.35*/("""
        """),format.raw/*37.9*/("""</form>
    </div>
    <div class="sign-up-box">
        <div class="hide-sign-up-btn"><i class="fas fa-times"></i></div>
        <form class="sign-up-form">
            <h1>Sign up</h1>
            <input class="txtb" type="text" name="" placeholder="Username">
            <input class="txtb" type="password" name="" placeholder="Password">
            <button class="sign-up-btn" onclick="check(); return false;">登録</button>
            """),_display_(/*46.14*/helper/*46.20*/.CSRF.formField),format.raw/*46.35*/("""
        """),format.raw/*47.9*/("""</form>
    </div>
""")))}),format.raw/*49.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 07 13:22:37 JST 2018
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/app/views/helpertop.scala.html
                  HASH: f9f3b82779eda3f105b43c84ee47d7ed928bba9d
                  MATRIX: 1037->95|1148->113|1176->308|1204->310|1236->333|1276->335|1309->464|1342->470|2095->1196|2110->1202|2146->1217|2182->1226|2650->1667|2665->1673|2701->1688|2737->1697|2787->1717
                  LINES: 31->5|36->6|37->11|38->12|38->12|38->12|40->17|42->19|59->36|59->36|59->36|60->37|69->46|69->46|69->46|70->47|72->49
                  -- GENERATED --
              */
          
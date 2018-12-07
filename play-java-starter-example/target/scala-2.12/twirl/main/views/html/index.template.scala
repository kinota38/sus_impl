
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
    """),format.raw/*18.5*/("""<div class="eyes">
        <div id="eye">
            <div class="ball"></div>
        </div>

        <div id="eye">
            <div class="ball"></div>
        </div>
    </div>
    <div class="show-btn">
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
        <form class="login-form" action="/section" method="post">
            <h1>Login</h1>
            <input class="txtb" type="text" name="" placeholder="Username">
            <input class="txtb" type="password" name="" placeholder="Password">
            <input class="login-btn" type="submit" name="" value="Login">
            """),_display_(/*44.14*/helper/*44.20*/.CSRF.formField),format.raw/*44.35*/("""
        """),format.raw/*45.9*/("""</form>
    </div>
    <div class="sign-up-box">
        <div class="hide-sign-up-btn"><i class="fas fa-times"></i></div>
        <form class="sign-up-form" action="/section" method="post">
            <h1>Sign up</h1>
            <input class="txtb" type="text" name="" placeholder="Username">
            <input class="txtb" type="password" name="" placeholder="Password">
            <input class="sign-up-btn" type="submit" name="" value="Sign up">
            """),_display_(/*54.14*/helper/*54.20*/.CSRF.formField),format.raw/*54.35*/("""
        """),format.raw/*55.9*/("""</form>
    </div>
""")))}),format.raw/*57.2*/("""
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
                  DATE: Fri Dec 07 12:26:36 JST 2018
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/index.scala.html
                  HASH: 1984aeb0d2b74eefbe54288488cec8351ea31515
                  MATRIX: 1037->95|1148->113|1176->308|1204->310|1236->333|1276->335|1309->464|1341->469|2280->1381|2295->1387|2331->1402|2367->1411|2860->1877|2875->1883|2911->1898|2947->1907|2997->1927
                  LINES: 31->5|36->6|37->11|38->12|38->12|38->12|40->17|41->18|67->44|67->44|67->44|68->45|77->54|77->54|77->54|78->55|80->57
                  -- GENERATED --
              */
          
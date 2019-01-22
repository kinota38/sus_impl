
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

object helpertop extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*
* Call the `main` template with two arguments. The first
* argument is a `String` with the title of the page, the second
* argument is an `Html` object containing the body of the page.
*/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*13.2*/main("helpertop")/*13.19*/ {_display_(Seq[Any](format.raw/*13.21*/("""

"""),format.raw/*18.3*/("""

"""),format.raw/*20.1*/("""<div class="header">StudyHelper</div>

<div class="show-btn">
    <div class="show-login-btn" onClick="location.href='/signin'">
        <i class="fas fa-sign-in-alt"></i>
        Log In
    </div>
    <div class="show-sign-up-btn" >
        <i class="fas fa-sign-in-alt"></i>
        Sign Up
    </div>
</div>

<div class="sign-up-box">
    <div class="hide-sign-up-btn"></div>
    <form class="sign-up-form">
        <h1>Sign up</h1>
        <span style="color:#ff0000;" id="error-field" class="error"></span><br>
        ユーザー名
        <input class="txtb" type="text" id="signup_name" name="name" placeholder="Username">
        <div class="high-select-box">
            <br>
            高校選択
            <select class="txtb" id="highschool_area" name="highschool_area"></select>
            <select class="txtb" id="highschool" name="highschool"></select>
        </div>
        <div class="uni-select-box">
            <br>
            志望校選択
            <select class="txtb" id="uni_area" name="uni_area"></select>
            <select class="txtb" id="university" name="university"></select>
            学部名(正式名称)
            <input class="txtb" type="text" id="signup_major" name="major" placeholder="例)情報工学科">
        </div>

        <br>
        パスワード
        <input class="txtb" type="password" id="signup_pass1" name="pass1" placeholder="Password">
        <input class="txtb" type="password" id="signup_pass2" name="pass2" placeholder="Comfirm Password">
        <br>
        <button class="sign-up-btn" onclick="check(); return false;">登録</button>
        """),_display_(/*61.10*/helper/*61.16*/.CSRF.formField),format.raw/*61.31*/("""
    """),format.raw/*62.5*/("""</form>
</div>
""")))}),format.raw/*64.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jan 22 19:37:32 JST 2019
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/helpertop.scala.html
                  HASH: 797fac54a296fe772704de245a828a79d1b8b1a5
                  MATRIX: 1221->286|1247->303|1287->305|1316->415|1345->417|2940->1985|2955->1991|2991->2006|3023->2011|3069->2027
                  LINES: 37->13|37->13|37->13|39->18|41->20|82->61|82->61|82->61|83->62|85->64
                  -- GENERATED --
              */
          
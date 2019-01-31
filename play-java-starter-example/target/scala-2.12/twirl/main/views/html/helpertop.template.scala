
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
"""),_display_(/*32.2*/if(flash.get("error_msg") == "ログインしてください")/*32.44*/ {_display_(Seq[Any](format.raw/*32.46*/("""
    """),format.raw/*33.5*/("""<p class="error-msg">"""),_display_(/*33.27*/flash/*33.32*/.get("error_msg")),format.raw/*33.49*/("""</p>
""")))}),format.raw/*34.2*/("""
"""),_display_(/*35.2*/if(flash.get("success_msg") == "ログアウトしました")/*35.45*/ {_display_(Seq[Any](format.raw/*35.47*/("""
    """),format.raw/*36.5*/("""<p class="success-msg">"""),_display_(/*36.29*/flash/*36.34*/.get("success_msg")),format.raw/*36.53*/("""</p>
""")))}),format.raw/*37.2*/("""
"""),_display_(/*38.2*/if(flash.get("success_msg") == "退会手続きが完了しました バイバイ")/*38.53*/ {_display_(Seq[Any](format.raw/*38.55*/("""
    """),format.raw/*39.5*/("""<p class="success-msg">"""),_display_(/*39.29*/flash/*39.34*/.get("success_msg")),format.raw/*39.53*/("""</p>
""")))}),format.raw/*40.2*/("""

"""),format.raw/*42.1*/("""<div class="sign-up-box">
    <div class="hide-sign-up-btn"></div>
    <form class="sign-up-form">
        """),_display_(/*45.10*/helper/*45.16*/.CSRF.formField),format.raw/*45.31*/("""
        """),format.raw/*46.9*/("""<h1>Sign up</h1>
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
    </form>
</div>
""")))}),format.raw/*73.2*/("""
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
                  DATE: Fri Feb 01 00:13:56 JST 2019
                  SOURCE: /Users/shibainu/Documents2/sus_impl/play-java-starter-example/app/views/helpertop.scala.html
                  HASH: 00354b4f64584abecc8df337762d0577790e36bb
                  MATRIX: 1221->286|1247->303|1287->305|1316->415|1345->417|1683->729|1734->771|1774->773|1806->778|1855->800|1869->805|1907->822|1943->828|1971->830|2023->873|2063->875|2095->880|2146->904|2160->909|2200->928|2236->934|2264->936|2324->987|2364->989|2396->994|2447->1018|2461->1023|2501->1042|2537->1048|2566->1050|2701->1158|2716->1164|2752->1179|2788->1188|3978->2348
                  LINES: 37->13|37->13|37->13|39->18|41->20|53->32|53->32|53->32|54->33|54->33|54->33|54->33|55->34|56->35|56->35|56->35|57->36|57->36|57->36|57->36|58->37|59->38|59->38|59->38|60->39|60->39|60->39|60->39|61->40|63->42|66->45|66->45|66->45|67->46|94->73
                  -- GENERATED --
              */
          
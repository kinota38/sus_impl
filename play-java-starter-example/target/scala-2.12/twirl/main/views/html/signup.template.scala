
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

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <title>Sign Up</title>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*5.55*/routes/*5.61*/.Assets.versioned("images/favicon.png")),format.raw/*5.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("stylesheets/helpertop.css")),format.raw/*6.87*/("""">
</head>
<body>
<main>
    <span style="color:#ff0000;" id="error-field" class="error"></span><br>
    <form id="signup-form">
        <label>名前</label><br>
        <input type="text" name="name" id="signup_name" autocomplete="on" required><br>
        <select id="highschool_area" name="highschool_area" class="highschool_area"></select>
        <select id="highschool" name="highschool" class="highschool"></select><br>
        <label>パスワード</label><br>
        <input type="password" name="pass1" id="signup_pass1" autocomplete="on" required><br>
        <label>パスワード(確認用)</label><br>
        <input type="password" name="pass2" id="signup_pass2" autocomplete="on" required><br>
        """),_display_(/*20.10*/helper/*20.16*/.CSRF.formField),format.raw/*20.31*/("""
    """),format.raw/*21.5*/("""</form>
    <br>
    <button class="button" onclick="check(); return false;">登録</button>


    <button class="button" onclick="location.href='/'">戻る</button>
</main>
<script src=""""),_display_(/*28.15*/routes/*28.21*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*28.71*/(""""></script>
<script src=""""),_display_(/*29.15*/routes/*29.21*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*29.69*/(""""></script>
<script src=""""),_display_(/*30.15*/routes/*30.21*/.Assets.versioned("/javascripts/signupandin/signup.js")),format.raw/*30.76*/(""""></script>

</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 08 02:58:27 JST 2018
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/app/views/signup.scala.html
                  HASH: f9d7d2420d8bb9014a604038f228da0eea704cb0
                  MATRIX: 1031->0|1178->121|1192->127|1252->166|1315->203|1329->209|1395->255|2114->947|2129->953|2165->968|2197->973|2404->1153|2419->1159|2490->1209|2543->1235|2558->1241|2627->1289|2680->1315|2695->1321|2771->1376
                  LINES: 33->1|37->5|37->5|37->5|38->6|38->6|38->6|52->20|52->20|52->20|53->21|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30
                  -- GENERATED --
              */
          
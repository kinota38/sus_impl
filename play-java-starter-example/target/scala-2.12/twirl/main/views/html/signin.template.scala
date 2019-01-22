
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

object signin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(error: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <title>Sign In</title>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/favicon.png")),format.raw/*8.100*/("""">

    <link rel="stylesheet" href=""""),_display_(/*10.35*/routes/*10.41*/.Assets.versioned("stylesheets/login.css")),format.raw/*10.83*/("""">
</head>

<body>
<main>
    <div class="login-form">
        <form action="/signin" method="POST">
            <h1>Log In</h1>
            <font color="red">"""),_display_(/*18.32*/error),format.raw/*18.37*/("""</font><br>
            <input type="text" class="txtb" name="name" autocomplete="on" placeholder="Username" required>
            <input type="password" class="txtb" name="pass" autocomplete="on" placeholder="Password" required>


            """),_display_(/*23.14*/helper/*23.20*/.CSRF.formField),format.raw/*23.35*/("""
            """),format.raw/*24.13*/("""<input class="login-btn" type="submit" value="Sign in">

        </form>
        <button class="login-btn" onClick="location.href='/'">戻る</button>
    </div>

</main>
<script src=""""),_display_(/*31.15*/routes/*31.21*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*31.71*/(""""></script>
<script type="module" src=""""),_display_(/*32.29*/routes/*32.35*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*32.83*/(""""></script>
</body>
</html>"""))
      }
    }
  }

  def render(error:String): play.twirl.api.HtmlFormat.Appendable = apply(error)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (error) => apply(error)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jan 22 19:37:32 JST 2019
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/signin.scala.html
                  HASH: f24617966642282c74957daf60bf6999810f15c2
                  MATRIX: 949->2|1058->18|1085->19|1232->140|1246->146|1306->185|1371->223|1386->229|1449->271|1636->431|1662->436|1934->681|1949->687|1985->702|2026->715|2234->896|2249->902|2320->952|2387->992|2402->998|2471->1046
                  LINES: 28->2|33->3|34->4|38->8|38->8|38->8|40->10|40->10|40->10|48->18|48->18|53->23|53->23|53->23|54->24|61->31|61->31|61->31|62->32|62->32|62->32
                  -- GENERATED --
              */
          

package views.html.calendar

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

object calendar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    """),format.raw/*4.58*/("""
    """),format.raw/*5.5*/("""<title></title>
    <link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("stylesheets/calendar.css")),format.raw/*6.86*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.versioned("images/favicon.png")),format.raw/*7.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*8.112*/("""">
</head>
<body>
<h2 class="calendar-title"><span id="js-year"></span>年 <span id="js-month"></span>月</h2>
<table class="calendar-table">
    <thead>
    <tr><th>日</th><th>月</th><th>火</th><th>水</th><th>木</th><th>金</th><th>土</th></tr>
    </thead>
    <tbody id="js-calendar-body"></tbody>
    <script src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*17.75*/(""""></script>
    <script src=""""),_display_(/*18.19*/routes/*18.25*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*18.73*/(""""></script>
    <script src=""""),_display_(/*19.19*/routes/*19.25*/.Assets.versioned("/javascripts/calendar.js")),format.raw/*19.70*/("""" type="text/javascript"></script>
</table>
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
                  DATE: Fri Dec 14 11:34:13 JST 2018
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/calendar/calendar.scala.html
                  HASH: 802450ffc16679a450893dac5690521955cd3d04
                  MATRIX: 1042->0|1113->97|1144->102|1220->152|1234->158|1299->203|1382->260|1396->266|1456->305|1519->342|1533->348|1625->419|1959->726|1974->732|2045->782|2102->812|2117->818|2186->866|2243->896|2258->902|2324->947
                  LINES: 33->1|36->4|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19
                  -- GENERATED --
              */
          
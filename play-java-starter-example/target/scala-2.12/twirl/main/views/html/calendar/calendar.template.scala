
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


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    """),format.raw/*5.58*/("""
    """),format.raw/*6.5*/("""<title></title>
    <link rel="stylesheet" href=""""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("stylesheets/calendar.css")),format.raw/*7.86*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/favicon.png")),format.raw/*8.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*9.112*/("""">
</head>
<body>
<h2 class="calendar-title"><span id="js-year"></span>年 <span id="js-month"></span>月</h2>
<table class="calendar-table">
    <thead>
    <tr><th>日</th><th>月</th><th>火</th><th>水</th><th>木</th><th>金</th><th>土</th></tr>
    </thead>
    <tbody id="js-calendar-body"></tbody>
    <script src=""""),_display_(/*18.19*/routes/*18.25*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*18.75*/(""""></script>
    <script src=""""),_display_(/*19.19*/routes/*19.25*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*19.73*/(""""></script>
    <script src=""""),_display_(/*20.19*/routes/*20.25*/.Assets.versioned("/javascripts/calendar.js")),format.raw/*20.70*/("""" type="text/javascript"></script>
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
                  DATE: Fri Dec 07 13:03:12 JST 2018
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/calendar/calendar.scala.html
                  HASH: 9018793c8f26a3973c61608b748c8545a82c97f3
                  MATRIX: 1042->1|1113->98|1144->103|1220->153|1234->159|1299->204|1382->261|1396->267|1456->306|1519->343|1533->349|1625->420|1959->727|1974->733|2045->783|2102->813|2117->819|2186->867|2243->897|2258->903|2324->948
                  LINES: 33->2|36->5|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20
                  -- GENERATED --
              */
          
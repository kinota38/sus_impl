
package views.html.section.calendar.month

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <title>"""),_display_(/*5.13*/title),format.raw/*5.18*/("""</title>
    <link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("stylesheets/calendar/calendar.css")),format.raw/*6.95*/("""">
    <link rel="stylesheet" href=""""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*7.91*/("""">
    """),format.raw/*8.105*/("""
    """),format.raw/*9.5*/("""<link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("stylesheets/calendar/leftMenu.css")),format.raw/*9.95*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("images/favicon.png")),format.raw/*10.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*11.35*/routes/*11.41*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*11.112*/("""">
</head>
<body>
    <div class="overlay" onclick="close_register_task(); return false;"></div>
    <main>
        """),format.raw/*17.32*/("""
        """),_display_(/*18.10*/content),format.raw/*18.17*/("""
    """),format.raw/*19.5*/("""</main>

    <script src=""""),_display_(/*21.19*/routes/*21.25*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*21.75*/(""""></script>
    <script src=""""),_display_(/*22.19*/routes/*22.25*/.Assets.versioned("/javascripts/calendar/calendar.js")),format.raw/*22.79*/(""""></script>
    """),format.raw/*23.99*/("""
    """),format.raw/*24.5*/("""<script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("/javascripts/calendar/calendarEvent.js")),format.raw/*24.84*/(""""></script>
    <script src=""""),_display_(/*25.19*/routes/*25.25*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*25.73*/(""""></script>
    <script src=""""),_display_(/*26.19*/routes/*26.25*/.Assets.versioned("/javascripts/popper.js")),format.raw/*26.68*/(""""></script>
    <script src=""""),_display_(/*27.19*/routes/*27.25*/.Assets.versioned("/javascripts/bootstrap.min.js")),format.raw/*27.75*/(""""></script>
    <script src=""""),_display_(/*28.19*/routes/*28.25*/.Assets.versioned("/javascripts/calendar/miniCalendar.js")),format.raw/*28.83*/(""""></script>
    <script src=""""),_display_(/*29.19*/routes/*29.25*/.Assets.versioned("/javascripts/navBar.js")),format.raw/*29.68*/(""""></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jan 25 11:46:04 JST 2019
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/calendar/month/main.scala.html
                  HASH: 772c73d32a223a618820383c135f210d9153ae80
                  MATRIX: 975->1|1099->32|1177->84|1202->89|1271->132|1285->138|1359->192|1422->229|1436->235|1506->285|1541->392|1572->397|1628->427|1642->433|1716->487|1800->544|1815->550|1876->589|1940->626|1955->632|2048->703|2192->909|2229->919|2257->926|2289->931|2343->958|2358->964|2429->1014|2486->1044|2501->1050|2576->1104|2620->1214|2652->1219|2693->1233|2708->1239|2788->1298|2845->1328|2860->1334|2929->1382|2986->1412|3001->1418|3065->1461|3122->1491|3137->1497|3208->1547|3265->1577|3280->1583|3359->1641|3416->1671|3431->1677|3495->1720
                  LINES: 28->1|33->2|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|47->17|48->18|48->18|49->19|51->21|51->21|51->21|52->22|52->22|52->22|53->23|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29
                  -- GENERATED --
              */
          
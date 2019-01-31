
package views.html.section.calendar.day

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
        <title>"""),_display_(/*5.17*/title),format.raw/*5.22*/("""</title>
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("stylesheets/calendar/calendar.css")),format.raw/*6.99*/("""">
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("stylesheets/calendar/style.css")),format.raw/*7.96*/("""">
        <link rel="stylesheet" href=""""),_display_(/*8.39*/routes/*8.45*/.Assets.versioned("stylesheets/calendar/leftMenu.css")),format.raw/*8.99*/("""">
        <link rel="stylesheet" href=""""),_display_(/*9.39*/routes/*9.45*/.Assets.versioned("stylesheets/calendar/dayScheduler.css")),format.raw/*9.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.versioned("/stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*11.117*/("""">
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*12.95*/("""">
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.versioned("stylesheets/calendar/bootstrap-colorselector.css")),format.raw/*13.114*/("""">
    </head>
    <body>

        <main>
            """),_display_(/*18.14*/content),format.raw/*18.21*/("""
        """),format.raw/*19.9*/("""</main>
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*20.79*/(""""></script>
        <script src=""""),_display_(/*21.23*/routes/*21.29*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*21.77*/("""" type="module"></script>
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("/javascripts/popper.js")),format.raw/*22.72*/(""""></script>
        <script src=""""),_display_(/*23.23*/routes/*23.29*/.Assets.versioned("/javascripts/bootstrap.min.js")),format.raw/*23.79*/(""""></script>
        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.versioned("/javascripts/moment-with-locales.min.js")),format.raw/*24.89*/(""""></script>
        <script src=""""),_display_(/*25.23*/routes/*25.29*/.Assets.versioned("/javascripts/calendar/calendar.js")),format.raw/*25.83*/(""""></script>
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.versioned("/javascripts/calendar/calendarEvent.js")),format.raw/*26.88*/(""""></script>
        <script src=""""),_display_(/*27.23*/routes/*27.29*/.Assets.versioned("/javascripts/calendar/bootstrap-colorselector.js")),format.raw/*27.98*/(""""></script>
        <script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("/javascripts/navBar.js")),format.raw/*28.72*/(""""></script>
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
                  DATE: Fri Feb 01 00:13:56 JST 2019
                  SOURCE: /Users/shibainu/Documents2/sus_impl/play-java-starter-example/app/views/section/calendar/day/main.scala.html
                  HASH: 75fc3a2ac49f2758f02055fc65edc0b27f9f95d5
                  MATRIX: 973->1|1097->32|1183->92|1208->97|1281->144|1295->150|1369->204|1436->245|1450->251|1521->302|1588->343|1602->349|1676->403|1743->444|1757->450|1836->508|1924->569|1939->575|2000->614|2068->655|2083->661|2177->733|2245->774|2260->780|2331->830|2399->871|2414->877|2505->946|2587->1001|2615->1008|2651->1017|2708->1047|2723->1053|2794->1103|2855->1137|2870->1143|2939->1191|3014->1239|3029->1245|3093->1288|3154->1322|3169->1328|3240->1378|3301->1412|3316->1418|3397->1478|3458->1512|3473->1518|3548->1572|3609->1606|3624->1612|3704->1671|3765->1705|3780->1711|3870->1780|3931->1814|3946->1820|4010->1863
                  LINES: 28->1|33->2|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28
                  -- GENERATED --
              */
          
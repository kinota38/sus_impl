
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
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("stylesheets/calendar/style.css")),format.raw/*6.96*/("""">
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("stylesheets/calendar/leftMenu.css")),format.raw/*7.99*/("""">
        <link rel="stylesheet" href=""""),_display_(/*8.39*/routes/*8.45*/.Assets.versioned("stylesheets/calendar/dayScheduler.css")),format.raw/*8.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <link rel="stylesheet" href=""""),_display_(/*10.39*/routes/*10.45*/.Assets.versioned("/stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*10.117*/("""">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*11.95*/("""">
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.versioned("stylesheets/calendar/bootstrap-colorselector.css")),format.raw/*12.114*/("""">
    </head>
    <body>

        <main>
            """),_display_(/*17.14*/content),format.raw/*17.21*/("""
        """),format.raw/*18.9*/("""</main>
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*19.79*/(""""></script>
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*20.77*/(""""></script>
        <script src=""""),_display_(/*21.23*/routes/*21.29*/.Assets.versioned("/javascripts/popper.js")),format.raw/*21.72*/(""""></script>
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("/javascripts/bootstrap.min.js")),format.raw/*22.79*/(""""></script>
        <script src=""""),_display_(/*23.23*/routes/*23.29*/.Assets.versioned("/javascripts/moment-with-locales.min.js")),format.raw/*23.89*/(""""></script>
        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.versioned("/javascripts/calendar/miniCalendar.js")),format.raw/*24.87*/(""""></script>
        <script src=""""),_display_(/*25.23*/routes/*25.29*/.Assets.versioned("/javascripts/calendar/calendarEvent.js")),format.raw/*25.88*/(""""></script>
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.versioned("/javascripts/calendar/bootstrap-colorselector.js")),format.raw/*26.98*/(""""></script>
        <script src=""""),_display_(/*27.23*/routes/*27.29*/.Assets.versioned("/javascripts/navBar.js")),format.raw/*27.72*/(""""></script>
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
                  DATE: Sun Jan 27 01:35:44 JST 2019
                  SOURCE: /Users/shibainu/Documents2/sus_impl/play-java-starter-example/app/views/section/calendar/day/main.scala.html
                  HASH: 71e0f47bc42c0c1ca9dbd611e32ec360e6c499aa
                  MATRIX: 973->1|1097->32|1183->92|1208->97|1281->144|1295->150|1366->201|1433->242|1447->248|1521->302|1588->343|1602->349|1681->407|1768->468|1782->474|1842->513|1910->554|1925->560|2019->632|2087->673|2102->679|2173->729|2241->770|2256->776|2347->845|2429->900|2457->907|2493->916|2550->946|2565->952|2636->1002|2697->1036|2712->1042|2781->1090|2842->1124|2857->1130|2921->1173|2982->1207|2997->1213|3068->1263|3129->1297|3144->1303|3225->1363|3286->1397|3301->1403|3380->1461|3441->1495|3456->1501|3536->1560|3597->1594|3612->1600|3702->1669|3763->1703|3778->1709|3842->1752
                  LINES: 28->1|33->2|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27
                  -- GENERATED --
              */
          
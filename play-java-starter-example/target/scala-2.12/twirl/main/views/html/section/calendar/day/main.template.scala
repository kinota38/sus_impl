
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
    </head>
    <body>

        <main>
            """),_display_(/*15.14*/content),format.raw/*15.21*/("""
        """),format.raw/*16.9*/("""</main>
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*17.79*/(""""></script>
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("/javascripts/calendar/miniCalendar.js")),format.raw/*18.87*/(""""></script>
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*19.77*/(""""></script>

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
                  DATE: Fri Jan 11 11:50:40 JST 2019
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/section/calendar/day/main.scala.html
                  HASH: 13e54d81d82c956f13335db415e0ece11b97c241
                  MATRIX: 973->1|1097->32|1183->92|1208->97|1281->144|1295->150|1366->201|1433->242|1447->248|1521->302|1588->343|1602->349|1681->407|1768->468|1782->474|1842->513|1910->554|1925->560|2019->632|2101->687|2129->694|2165->703|2222->733|2237->739|2308->789|2369->823|2384->829|2463->887|2524->921|2539->927|2608->975
                  LINES: 28->1|33->2|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|46->15|46->15|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19
                  -- GENERATED --
              */
          
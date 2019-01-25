
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
    <link rel="stylesheet" href=""""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("stylesheets/calendar/calendarMini.css")),format.raw/*8.99*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("images/favicon.png")),format.raw/*9.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*10.35*/routes/*10.41*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*10.112*/("""">
</head>
<body>
    <div class="overlay" onclick="close_register_task(); return false;"></div>
    <main>
        """),format.raw/*16.32*/("""
        """),_display_(/*17.10*/content),format.raw/*17.17*/("""
    """),format.raw/*18.5*/("""</main>

    <script src=""""),_display_(/*20.19*/routes/*20.25*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*20.75*/(""""></script>
    <script src=""""),_display_(/*21.19*/routes/*21.25*/.Assets.versioned("/javascripts/calendar/calendar.js")),format.raw/*21.79*/(""""></script>
    <script src=""""),_display_(/*22.19*/routes/*22.25*/.Assets.versioned("/javascripts/calendar/calendar.mini.js")),format.raw/*22.84*/(""""></script>
    <script src=""""),_display_(/*23.19*/routes/*23.25*/.Assets.versioned("/javascripts/calendar/calendarEvent.js")),format.raw/*23.84*/(""""></script>
    <script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*24.73*/(""""></script>
    <script src=""""),_display_(/*25.19*/routes/*25.25*/.Assets.versioned("/javascripts/popper.js")),format.raw/*25.68*/(""""></script>
    <script src=""""),_display_(/*26.19*/routes/*26.25*/.Assets.versioned("/javascripts/bootstrap.min.js")),format.raw/*26.75*/(""""></script>
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
                  DATE: Fri Jan 25 11:02:10 JST 2019
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/calendar/month/main.scala.html
                  HASH: 34a17406623c454311c6189eeb9a2fc9ae433dc2
                  MATRIX: 975->1|1099->32|1177->84|1202->89|1271->132|1285->138|1359->192|1422->229|1436->235|1506->285|1569->322|1583->328|1661->386|1744->443|1758->449|1818->488|1882->525|1897->531|1990->602|2134->808|2171->818|2199->825|2231->830|2285->857|2300->863|2371->913|2428->943|2443->949|2518->1003|2575->1033|2590->1039|2670->1098|2727->1128|2742->1134|2822->1193|2879->1223|2894->1229|2963->1277|3020->1307|3035->1313|3099->1356|3156->1386|3171->1392|3242->1442
                  LINES: 28->1|33->2|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|46->16|47->17|47->17|48->18|50->20|50->20|50->20|51->21|51->21|51->21|52->22|52->22|52->22|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26
                  -- GENERATED --
              */
          
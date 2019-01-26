
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
    <link rel="stylesheet" href=""""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("stylesheets/calendar/calendar.css")),format.raw/*7.95*/("""">
    """),format.raw/*8.105*/("""
    """),format.raw/*9.5*/("""<link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("stylesheets/calendar/leftMenu.css")),format.raw/*9.95*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("images/favicon.png")),format.raw/*10.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*11.35*/routes/*11.41*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*11.112*/("""">
    <link rel="stylesheet" href=""""),_display_(/*12.35*/routes/*12.41*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*12.91*/("""">
    <link rel="stylesheet" href=""""),_display_(/*13.35*/routes/*13.41*/.Assets.versioned("tempusdominus-bootstrap-4.css")),format.raw/*13.91*/("""">
    <link rel="stylesheet" href=""""),_display_(/*14.35*/routes/*14.41*/.Assets.versioned("stylesheets/calendar/bootstrap-colorselector.css")),format.raw/*14.110*/("""">
</head>
<body>
    <div class="overlay" onclick="close_register_task(); return false;"></div>
    <main>
        """),format.raw/*20.32*/("""
        """),_display_(/*21.10*/content),format.raw/*21.17*/("""
    """),format.raw/*22.5*/("""</main>

    <script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*24.75*/(""""></script>
    <script src=""""),_display_(/*25.19*/routes/*25.25*/.Assets.versioned("/javascripts/calendar/calendar.js")),format.raw/*25.79*/(""""></script>
    """),format.raw/*26.99*/("""
    """),format.raw/*27.5*/("""<script src=""""),_display_(/*27.19*/routes/*27.25*/.Assets.versioned("/javascripts/calendar/calendarEvent.js")),format.raw/*27.84*/(""""></script>
    <script src=""""),_display_(/*28.19*/routes/*28.25*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*28.73*/(""""></script>
    <script src=""""),_display_(/*29.19*/routes/*29.25*/.Assets.versioned("/javascripts/popper.js")),format.raw/*29.68*/(""""></script>
    <script src=""""),_display_(/*30.19*/routes/*30.25*/.Assets.versioned("/javascripts/bootstrap.min.js")),format.raw/*30.75*/(""""></script>
    <script src=""""),_display_(/*31.19*/routes/*31.25*/.Assets.versioned("/javascripts/calendar/bootstrap-colorselector.js")),format.raw/*31.94*/(""""></script>
    """),format.raw/*32.102*/("""
    """),format.raw/*33.5*/("""<script src=""""),_display_(/*33.19*/routes/*33.25*/.Assets.versioned("/javascripts/calendar/miniCalendar.js")),format.raw/*33.83*/(""""></script>
    """),format.raw/*34.94*/("""
    """),format.raw/*35.5*/("""<script src=""""),_display_(/*35.19*/routes/*35.25*/.Assets.versioned("/javascripts/navBar.js")),format.raw/*35.68*/(""""></script>
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
                  DATE: Sat Jan 26 17:20:27 JST 2019
                  SOURCE: /Users/shibainu/Documents2/sus_impl/play-java-starter-example/app/views/section/calendar/month/main.scala.html
                  HASH: efd714376aaf87ac0931612faab19c2aac329caf
                  MATRIX: 975->1|1099->32|1177->84|1202->89|1271->132|1285->138|1359->192|1422->229|1436->235|1510->289|1545->396|1576->401|1632->431|1646->437|1720->491|1804->548|1819->554|1880->593|1944->630|1959->636|2052->707|2116->744|2131->750|2202->800|2266->837|2281->843|2352->893|2416->930|2431->936|2522->1005|2666->1211|2703->1221|2731->1228|2763->1233|2817->1260|2832->1266|2903->1316|2960->1346|2975->1352|3050->1406|3094->1516|3126->1521|3167->1535|3182->1541|3262->1600|3319->1630|3334->1636|3403->1684|3460->1714|3475->1720|3539->1763|3596->1793|3611->1799|3682->1849|3739->1879|3754->1885|3844->1954|3889->2067|3921->2072|3962->2086|3977->2092|4056->2150|4100->2255|4132->2260|4173->2274|4188->2280|4252->2323
                  LINES: 28->1|33->2|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|50->20|51->21|51->21|52->22|54->24|54->24|54->24|55->25|55->25|55->25|56->26|57->27|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|63->33|63->33|63->33|63->33|64->34|65->35|65->35|65->35|65->35
                  -- GENERATED --
              */
          
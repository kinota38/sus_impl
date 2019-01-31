
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
    <link rel="stylesheet" href=""""),_display_(/*13.35*/routes/*13.41*/.Assets.versioned("stylesheets/calendar/bootstrap-colorselector.css")),format.raw/*13.110*/("""">
</head>
<body>
    <div class="overlay" onclick="close_register_task(); return false;"></div>
    <main>
        """),format.raw/*19.32*/("""
        """),_display_(/*20.10*/content),format.raw/*20.17*/("""
    """),format.raw/*21.5*/("""</main>

    <script src=""""),_display_(/*23.19*/routes/*23.25*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*23.75*/(""""></script>
    <script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("/javascripts/calendar/calendar.js")),format.raw/*24.79*/(""""></script>
    <script src=""""),_display_(/*25.19*/routes/*25.25*/.Assets.versioned("/javascripts/calendar/calendarEvent.js")),format.raw/*25.84*/(""""></script>
    <script src=""""),_display_(/*26.19*/routes/*26.25*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*26.73*/(""""></script>
    <script src=""""),_display_(/*27.19*/routes/*27.25*/.Assets.versioned("/javascripts/popper.js")),format.raw/*27.68*/(""""></script>
    <script src=""""),_display_(/*28.19*/routes/*28.25*/.Assets.versioned("/javascripts/bootstrap.min.js")),format.raw/*28.75*/(""""></script>
    <script src=""""),_display_(/*29.19*/routes/*29.25*/.Assets.versioned("/javascripts/calendar/bootstrap-colorselector.js")),format.raw/*29.94*/(""""></script>
    <script src=""""),_display_(/*30.19*/routes/*30.25*/.Assets.versioned("/javascripts/navBar.js")),format.raw/*30.68*/(""""></script>
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
                  DATE: Thu Jan 31 14:15:25 JST 2019
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/section/calendar/month/main.scala.html
                  HASH: b76f8b8fce71371dcc677ffd835f40e23f66452e
                  MATRIX: 975->1|1099->32|1177->84|1202->89|1271->132|1285->138|1359->192|1422->229|1436->235|1510->289|1545->396|1576->401|1632->431|1646->437|1720->491|1804->548|1819->554|1880->593|1944->630|1959->636|2052->707|2116->744|2131->750|2202->800|2266->837|2281->843|2372->912|2516->1118|2553->1128|2581->1135|2613->1140|2667->1167|2682->1173|2753->1223|2810->1253|2825->1259|2900->1313|2957->1343|2972->1349|3052->1408|3109->1438|3124->1444|3193->1492|3250->1522|3265->1528|3329->1571|3386->1601|3401->1607|3472->1657|3529->1687|3544->1693|3634->1762|3691->1792|3706->1798|3770->1841
                  LINES: 28->1|33->2|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|49->19|50->20|50->20|51->21|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30|60->30
                  -- GENERATED --
              */
          

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
    <link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("stylesheets/calendar.css")),format.raw/*6.86*/("""">
    <link rel="stylesheet" href=""""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("stylesheets/navBar.css")),format.raw/*7.84*/("""">
    <link rel="stylesheet" href=""""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("stylesheets/calendarMini.css")),format.raw/*8.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("images/favicon.png")),format.raw/*9.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*10.35*/routes/*10.41*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*10.112*/("""">
</head>
<body>
    <div class="overlay" onclick="close_register_task(); return false;"></div>
    <main>

        <header>
            <ul>
                <li><a href="#home">Home</a></li>
                <li><a href="#news">News</a></li>
                <li><a href="#contact">Contact</a></li>

                <li class="dropdown">
                    <a href="javascript:void(0)" class="dropbtn">Dropdown</a>
                    <div class="dropdown-content-left">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </li>
                <li>
                    <div><button id="tmonth" onclick='setCalendar()'>今月</button></div>
                </li>
                <li>
                    <button id="bmonth" onclick='backmm(this);return false;'><<</button>
                </li>
                <li>
                    <button id="nmonth" onclick='nextmm(this);return false;'> >> </button>
                </li>

                <li id="white">
                    <span id="year"></span>年<span id="month"></span>月<br />
                </li>
                <li style="float:right" class="dropdown">
                    <a class="active" href="#about"><i class="fas fa-user"></i></a>
                    <div class="dropdown-content-right">
                        <a href="#">Account Info</a>
                        <a href="#">Link 2</a>
                        <a href="#">Logout</a>
                    </div>
                </li>
            </ul>
        </header>
        <div class="wrapper">
            <div class="menu">
                <div id="mini-calendar-result"></div>
            </div>

            """),format.raw/*59.35*/("""
            """),_display_(/*60.14*/content),format.raw/*60.21*/("""
        """),format.raw/*61.9*/("""</div>


    </main>

    <script src=""""),_display_(/*66.19*/routes/*66.25*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*66.75*/(""""></script>
    <script src=""""),_display_(/*67.19*/routes/*67.25*/.Assets.versioned("/javascripts/calendar.js")),format.raw/*67.70*/(""""></script>
    <script src=""""),_display_(/*68.19*/routes/*68.25*/.Assets.versioned("/javascripts/calendar.mini.js")),format.raw/*68.75*/(""""></script>
    <script src=""""),_display_(/*69.19*/routes/*69.25*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*69.73*/(""""></script>

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
                  DATE: Tue Jan 08 11:26:48 JST 2019
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/section/calendar/month/main.scala.html
                  HASH: da24a672fc575f594df935040531445fefbabc25
                  MATRIX: 975->1|1099->32|1177->84|1202->89|1271->132|1285->138|1350->183|1413->220|1427->226|1490->269|1553->306|1567->312|1636->361|1719->418|1733->424|1793->463|1857->500|1872->506|1965->577|3760->2437|3801->2451|3829->2458|3865->2467|3932->2507|3947->2513|4018->2563|4075->2593|4090->2599|4156->2644|4213->2674|4228->2680|4299->2730|4356->2760|4371->2766|4440->2814
                  LINES: 28->1|33->2|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|89->59|90->60|90->60|91->61|96->66|96->66|96->66|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69
                  -- GENERATED --
              */
          

package views.html.section.calendar

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
                    <button id="tmonth" onclick='setCalendar()'>今月</button>
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

            """),format.raw/*58.35*/("""
            """),_display_(/*59.14*/content),format.raw/*59.21*/("""
        """),format.raw/*60.9*/("""</div>
    </main>
    <script src=""""),_display_(/*62.19*/routes/*62.25*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*62.75*/(""""></script>
    <script src=""""),_display_(/*63.19*/routes/*63.25*/.Assets.versioned("/javascripts/calendar.js")),format.raw/*63.70*/(""""></script>
    <script src=""""),_display_(/*64.19*/routes/*64.25*/.Assets.versioned("/javascripts/calendar.mini.js")),format.raw/*64.75*/(""""></script>
    <script src=""""),_display_(/*65.19*/routes/*65.25*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*65.73*/(""""></script>

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
                  DATE: Tue Dec 25 10:28:57 JST 2018
                  SOURCE: /Users/daikichi/Desktop/sus_impl2/play-java-starter-example/app/views/section/calendar/main.scala.html
                  HASH: f080af946841a4658182c2746b2f46b154d1f6aa
                  MATRIX: 969->1|1093->32|1171->84|1196->89|1265->132|1279->138|1344->183|1407->220|1421->226|1484->269|1547->306|1561->312|1630->361|1713->418|1727->424|1787->463|1851->500|1866->506|1959->577|3664->2347|3705->2361|3733->2368|3769->2377|3833->2414|3848->2420|3919->2470|3976->2500|3991->2506|4057->2551|4114->2581|4129->2587|4200->2637|4257->2667|4272->2673|4341->2721
                  LINES: 28->1|33->2|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|88->58|89->59|89->59|90->60|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|95->65|95->65|95->65
                  -- GENERATED --
              */
          
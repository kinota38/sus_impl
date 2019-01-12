
package views.html.section

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

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    """),format.raw/*12.58*/("""
    """),format.raw/*13.5*/("""<title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <link rel="stylesheet" href=""""),_display_(/*14.35*/routes/*14.41*/.Assets.versioned("stylesheets/section.css")),format.raw/*14.85*/("""">
    <link rel="stylesheet" href=""""),_display_(/*15.35*/routes/*15.41*/.Assets.versioned("stylesheets/navBar.css")),format.raw/*15.84*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.55*/routes/*16.61*/.Assets.versioned("images/favicon.png")),format.raw/*16.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*17.35*/routes/*17.41*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*17.112*/("""">

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
    <br>
    """),format.raw/*48.27*/("""
    """),_display_(/*49.6*/content),format.raw/*49.13*/("""
"""),format.raw/*50.1*/("""</main>
<script src=""""),_display_(/*51.15*/routes/*51.21*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*51.71*/(""""></script>
        <script src=""""),_display_(/*52.23*/routes/*52.29*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*52.77*/(""""></script>
<script src=""""),_display_(/*53.15*/routes/*53.21*/.Assets.versioned("/javascripts/mypage.js")),format.raw/*53.64*/(""""></script>
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
                  DATE: Sat Jan 12 03:23:31 JST 2019
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/main.scala.html
                  HASH: 3e7711abfc1871344d39c787f3116ec250076c2c
                  MATRIX: 1209->255|1333->286|1360->287|1432->384|1464->389|1499->397|1525->402|1595->445|1610->451|1675->495|1739->532|1754->538|1818->581|1902->638|1917->644|1978->683|2042->720|2057->726|2150->797|3109->1813|3141->1819|3169->1826|3197->1827|3246->1849|3261->1855|3332->1905|3393->1939|3408->1945|3477->1993|3530->2019|3545->2025|3609->2068
                  LINES: 33->7|38->8|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|77->48|78->49|78->49|79->50|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53
                  -- GENERATED --
              */
          
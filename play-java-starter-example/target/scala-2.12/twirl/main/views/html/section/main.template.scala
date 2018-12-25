
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
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("stylesheets/section.css")),format.raw/*14.89*/("""">
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("stylesheets/navBar.css")),format.raw/*15.88*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*17.116*/("""">

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
            """),format.raw/*48.35*/("""
            """),_display_(/*49.14*/content),format.raw/*49.21*/("""
        """),format.raw/*50.9*/("""</main>
        <script src=""""),_display_(/*51.23*/routes/*51.29*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*51.79*/(""""></script>
        <script src=""""),_display_(/*52.23*/routes/*52.29*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*52.77*/(""""></script>
        <script src=""""),_display_(/*53.23*/routes/*53.29*/.Assets.versioned("/javascripts/mypage.js")),format.raw/*53.72*/(""""></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 21 18:56:45 JST 2018
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/main.scala.html
                  HASH: 6ff9b85d2ceb622111095b0e9ea2d9927f406629
                  MATRIX: 1214->260|1338->291|1365->292|1445->397|1481->406|1516->414|1542->419|1616->466|1631->472|1696->516|1764->557|1779->563|1843->606|1931->667|1946->673|2007->712|2075->753|2090->759|2183->830|3358->2070|3399->2084|3427->2091|3463->2100|3520->2130|3535->2136|3606->2186|3667->2220|3682->2226|3751->2274|3812->2308|3827->2314|3891->2357
                  LINES: 33->7|38->8|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|77->48|78->49|78->49|79->50|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53
                  -- GENERATED --
              */
          
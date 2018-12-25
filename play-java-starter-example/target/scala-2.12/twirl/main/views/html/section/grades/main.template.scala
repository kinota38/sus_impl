
package views.html.section.grades

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
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("stylesheets/grades.css")),format.raw/*14.88*/("""">
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
            """),format.raw/*46.35*/("""
            """),_display_(/*47.14*/content),format.raw/*47.21*/("""
        """),format.raw/*48.9*/("""</main>
        <script src=""""),_display_(/*49.23*/routes/*49.29*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*49.79*/(""""></script>
        <script src=""""),_display_(/*50.23*/routes/*50.29*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*50.77*/(""""></script>
        <script src=""""),_display_(/*51.23*/routes/*51.29*/.Assets.versioned("javascripts/Chart.bundle.js")),format.raw/*51.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*52.23*/routes/*52.29*/.Assets.versioned("javascripts/grades.js")),format.raw/*52.71*/("""" type="text/javascript"></script>
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
                  DATE: Fri Dec 21 18:53:57 JST 2018
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/grades/main.scala.html
                  HASH: af8d519a8752be12aa59a88e7d9411dd10472dbb
                  MATRIX: 1221->260|1345->291|1372->292|1452->397|1488->406|1523->414|1549->419|1623->466|1638->472|1702->515|1770->556|1785->562|1849->605|1937->666|1952->672|2013->711|2081->752|2096->758|2189->829|3346->2051|3387->2065|3415->2072|3451->2081|3508->2111|3523->2117|3594->2167|3655->2201|3670->2207|3739->2255|3800->2289|3815->2295|3884->2343|3968->2400|3983->2406|4046->2448
                  LINES: 33->7|38->8|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|75->46|76->47|76->47|77->48|78->49|78->49|78->49|79->50|79->50|79->50|80->51|80->51|80->51|81->52|81->52|81->52
                  -- GENERATED --
              */
          
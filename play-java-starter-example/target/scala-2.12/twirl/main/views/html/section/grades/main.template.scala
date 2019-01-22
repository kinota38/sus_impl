
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
    """),format.raw/*12.58*/("""
    """),format.raw/*13.5*/("""<title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <link rel="stylesheet" href=""""),_display_(/*14.35*/routes/*14.41*/.Assets.versioned("stylesheets/grade/grades.css")),format.raw/*14.90*/("""">
    <link rel="stylesheet" href=""""),_display_(/*15.35*/routes/*15.41*/.Assets.versioned("stylesheets/grade/nice-select.css")),format.raw/*15.95*/("""">
    <link rel="stylesheet" href=""""),_display_(/*16.35*/routes/*16.41*/.Assets.versioned("stylesheets/navBar.css")),format.raw/*16.84*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.55*/routes/*17.61*/.Assets.versioned("images/favicon.png")),format.raw/*17.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*18.35*/routes/*18.41*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*18.112*/("""">
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
    """),format.raw/*47.27*/("""
    """),_display_(/*48.6*/content),format.raw/*48.13*/("""
"""),format.raw/*49.1*/("""</main>
<script src=""""),_display_(/*50.15*/routes/*50.21*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*50.71*/(""""></script>
        <script src=""""),_display_(/*51.23*/routes/*51.29*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*51.77*/(""""></script>
<script src=""""),_display_(/*52.15*/routes/*52.21*/.Assets.versioned("javascripts/Chart.bundle.js")),format.raw/*52.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*53.23*/routes/*53.29*/.Assets.versioned("javascripts/grade/grades.js")),format.raw/*53.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*54.15*/routes/*54.21*/.Assets.versioned("javascripts/grade/jquery.nice-select.js")),format.raw/*54.81*/("""" type="text/javascript"></script>
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
                  DATE: Tue Jan 22 19:37:32 JST 2019
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/section/grades/main.scala.html
                  HASH: e1821b56c88d49be2b312b2a32215c436135a355
                  MATRIX: 1216->255|1340->286|1367->287|1439->384|1471->389|1506->397|1532->402|1602->445|1617->451|1687->500|1751->537|1766->543|1841->597|1905->634|1920->640|1984->683|2068->740|2083->746|2144->785|2208->822|2223->828|2316->899|3265->1905|3297->1911|3325->1918|3353->1919|3402->1941|3417->1947|3488->1997|3549->2031|3564->2037|3633->2085|3686->2111|3701->2117|3770->2165|3854->2222|3869->2228|3938->2276|4014->2325|4029->2331|4110->2391
                  LINES: 33->7|38->8|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|76->47|77->48|77->48|78->49|79->50|79->50|79->50|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|83->54|83->54|83->54
                  -- GENERATED --
              */
          
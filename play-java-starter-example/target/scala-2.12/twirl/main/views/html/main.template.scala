
package views.html

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
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("stylesheets/top.css")),format.raw/*14.85*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*16.116*/("""">

    </head>
    <body>
        <main>
            """),format.raw/*22.35*/("""
            """),_display_(/*23.14*/content),format.raw/*23.21*/("""
        """),format.raw/*24.9*/("""</main>
        <script src=""""),_display_(/*25.23*/routes/*25.29*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*25.79*/(""""></script>
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*26.77*/(""""></script>
        <script src=""""),_display_(/*27.23*/routes/*27.29*/.Assets.versioned("javascripts/signupandin/signup.js")),format.raw/*27.83*/("""" type="text/javascript"></script>
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
                  DATE: Mon Dec 31 17:14:17 JST 2018
                  SOURCE: /Users/shibainu/Documents2/sus_impl/play-java-starter-example/app/views/main.scala.html
                  HASH: adcaf4ff6ef65e6736641a522f500056b11bedff
                  MATRIX: 1206->260|1330->291|1357->292|1437->397|1473->406|1508->414|1534->419|1608->466|1623->472|1684->512|1772->573|1787->579|1848->618|1916->659|1931->665|2024->736|2106->883|2147->897|2175->904|2211->913|2268->943|2283->949|2354->999|2415->1033|2430->1039|2499->1087|2560->1121|2575->1127|2650->1181
                  LINES: 33->7|38->8|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|51->22|52->23|52->23|53->24|54->25|54->25|54->25|55->26|55->26|55->26|56->27|56->27|56->27
                  -- GENERATED --
              */
          
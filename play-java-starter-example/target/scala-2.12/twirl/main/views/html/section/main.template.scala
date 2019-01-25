
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
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        """),format.raw/*14.62*/("""
        """),format.raw/*15.9*/("""<title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("stylesheets/section.css")),format.raw/*16.89*/("""">
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*17.95*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.59*/routes/*18.65*/.Assets.versioned("images/favicon.png")),format.raw/*18.104*/("""">
        <link rel="stylesheet" href=""""),_display_(/*19.39*/routes/*19.45*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*19.116*/("""">

    </head>
    <body>
        <main>
            """),format.raw/*25.35*/("""
            """),_display_(/*26.14*/content),format.raw/*26.21*/("""
        """),format.raw/*27.9*/("""</main>
        <script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*28.79*/(""""></script>
        <script src=""""),_display_(/*29.23*/routes/*29.29*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*29.77*/(""""></script>
        <script src=""""),_display_(/*30.23*/routes/*30.29*/.Assets.versioned("/javascripts/popper.js")),format.raw/*30.72*/(""""></script>
        <script src=""""),_display_(/*31.23*/routes/*31.29*/.Assets.versioned("/javascripts/bootstrap.min.js")),format.raw/*31.79*/(""""></script>
        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.versioned("/javascripts/mypage.js")),format.raw/*32.72*/(""""></script>
        <script src=""""),_display_(/*33.23*/routes/*33.29*/.Assets.versioned("/javascripts/navBar.js")),format.raw/*33.72*/(""""></script>
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
                  DATE: Fri Jan 25 11:46:04 JST 2019
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/main.scala.html
                  HASH: a78ec641a0692cf6dc6dc7a8f2cc5491a74b2830
                  MATRIX: 1209->255|1333->286|1360->287|1566->518|1602->527|1637->535|1663->540|1737->587|1752->593|1817->637|1885->678|1900->684|1971->734|2059->795|2074->801|2135->840|2203->881|2218->887|2311->958|2393->1105|2434->1119|2462->1126|2498->1135|2555->1165|2570->1171|2641->1221|2702->1255|2717->1261|2786->1309|2847->1343|2862->1349|2926->1392|2987->1426|3002->1432|3073->1482|3134->1516|3149->1522|3213->1565|3274->1599|3289->1605|3353->1648
                  LINES: 33->7|38->8|39->9|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|54->25|55->26|55->26|56->27|57->28|57->28|57->28|58->29|58->29|58->29|59->30|59->30|59->30|60->31|60->31|60->31|61->32|61->32|61->32|62->33|62->33|62->33
                  -- GENERATED --
              */
          

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
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*14.95*/("""">
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("stylesheets/grade/grades.css")),format.raw/*15.94*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("stylesheets/grade/nice-select.css")),format.raw/*16.99*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
        <link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*18.116*/("""">
    </head>
    <body>
        <main>
            """),format.raw/*23.35*/("""
            """),_display_(/*24.14*/content),format.raw/*24.21*/("""
        """),format.raw/*25.9*/("""</main>
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*26.79*/(""""></script>
        <script src=""""),_display_(/*27.23*/routes/*27.29*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*27.77*/(""""></script>
        <script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("/javascripts/popper.js")),format.raw/*28.72*/(""""></script>
        <script src=""""),_display_(/*29.23*/routes/*29.29*/.Assets.versioned("/javascripts/bootstrap.min.js")),format.raw/*29.79*/(""""></script>
        <script src=""""),_display_(/*30.23*/routes/*30.29*/.Assets.versioned("javascripts/Chart.bundle.js")),format.raw/*30.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*31.23*/routes/*31.29*/.Assets.versioned("javascripts/grade/grades.js")),format.raw/*31.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.versioned("javascripts/grade/jquery.nice-select.js")),format.raw/*32.89*/("""" type="text/javascript"></script>
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
                  DATE: Thu Jan 31 14:15:25 JST 2019
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/section/grades/main.scala.html
                  HASH: c7ec5b1567bde54393a4051cc8fb64bd9f6fc4dd
                  MATRIX: 1216->255|1340->286|1367->287|1447->392|1483->401|1518->409|1544->414|1618->461|1633->467|1704->517|1772->558|1787->564|1857->613|1925->654|1940->660|2015->714|2103->775|2118->781|2179->820|2247->861|2262->867|2355->938|2436->1084|2477->1098|2505->1105|2541->1114|2598->1144|2613->1150|2684->1200|2745->1234|2760->1240|2829->1288|2890->1322|2905->1328|2969->1371|3030->1405|3045->1411|3116->1461|3177->1495|3192->1501|3261->1549|3345->1606|3360->1612|3429->1660|3513->1717|3528->1723|3609->1783|3693->1840|3708->1846|3772->1889
                  LINES: 33->7|38->8|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|52->23|53->24|53->24|54->25|55->26|55->26|55->26|56->27|56->27|56->27|57->28|57->28|57->28|58->29|58->29|58->29|59->30|59->30|59->30|60->31|60->31|60->31|61->32|61->32|61->32|62->33|62->33|62->33
                  -- GENERATED --
              */
          
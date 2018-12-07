
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
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("stylesheets/fontawesome-free-5.5.0-web/css/all.css")),format.raw/*16.116*/("""">
    </head>
    <body>
        <main>
            """),format.raw/*21.35*/("""
            """),_display_(/*22.14*/content),format.raw/*22.21*/("""
        """),format.raw/*23.9*/("""</main>
        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.versioned("/javascripts/jquery/jquery.js")),format.raw/*24.79*/(""""></script>
        <script src=""""),_display_(/*25.23*/routes/*25.29*/.Assets.versioned("/javascripts/fetch/fetch.js")),format.raw/*25.77*/(""""></script>
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
                  DATE: Fri Dec 07 12:26:36 JST 2018
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/section/main.scala.html
                  HASH: b937aca01829c3fc7721dc2da31cbe4cf3b0bf82
                  MATRIX: 1214->260|1338->291|1365->292|1445->397|1481->406|1516->414|1542->419|1616->466|1631->472|1696->516|1784->577|1799->583|1860->622|1928->663|1943->669|2036->740|2117->886|2158->900|2186->907|2222->916|2279->946|2294->952|2365->1002|2426->1036|2441->1042|2510->1090
                  LINES: 33->7|38->8|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|50->21|51->22|51->22|52->23|53->24|53->24|53->24|54->25|54->25|54->25
                  -- GENERATED --
              */
          
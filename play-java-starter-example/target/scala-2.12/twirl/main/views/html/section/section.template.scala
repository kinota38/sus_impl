
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

object section extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Mypage")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""

"""),format.raw/*5.1*/("""<div class="main">
    <div class="services">
        <h1>"""),_display_(/*7.14*/name),format.raw/*7.18*/(""" """),format.raw/*7.19*/("""さん</h1>
        <div class="cen">
            <a class="fixed" href="/calendar/month">
                <div class="service">
                    <i class="far fa-calendar-alt"></i>
                    <h2>Calendar</h2>
                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
                </div>
            </a>

            <a class="fixed" href="/grades/"""),_display_(/*17.45*/name),format.raw/*17.49*/("""">
                <div class="service">
                    <i class="fas fa-user-graduate"></i>
                    <h2>grades</h2>
                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
                </div>
            </a>

            <a class="fixed" href="/chat/"""),_display_(/*25.43*/name),format.raw/*25.47*/("""">
                <div class="service">
                    <i class="far fa-comments"></i>
                    <h2>Service Name</h2>
                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
                </div>
            </a>
            <div class="service">
                <i class="fab fa-apple-pay"></i>
                <h2>Service Name</h2>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
            </div>

            <div class="service">
                <i class="fas fa-taxi"></i>
                <h2>Service Name</h2>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
            </div>

            <div class="service">
                <i class="fab fa-youtube"></i>
                <h2>Service Name</h2>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
            </div>
        </div>

    </div>
</div>
""")))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 19 13:02:51 JST 2019
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/section.scala.html
                  HASH: 1fac23bb44aa288581a697e7246f61fac319e5c6
                  MATRIX: 958->1|1066->16|1093->18|1115->32|1154->34|1182->36|1267->95|1291->99|1319->100|1753->507|1778->511|2125->831|2150->835
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|38->7|38->7|38->7|48->17|48->17|56->25|56->25
                  -- GENERATED --
              */
          
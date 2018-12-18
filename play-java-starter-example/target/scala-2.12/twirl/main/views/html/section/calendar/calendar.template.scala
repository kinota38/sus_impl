
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

object calendar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("カレンダー")/*1.15*/{_display_(Seq[Any](format.raw/*1.16*/("""

    """),format.raw/*3.5*/("""<button id="tmonth" onclick='setCalendar()'>今月</button>
    <button id="bmonth" onclick='backmm(this);return false;'><<</button>
    <button id="nmonth" onclick='nextmm(this);return false;'> >> </button>
    <span id="year"></span>年<span id="month"></span>月<br />
    <span id="year_start"></span>/<span id="month_start"></span>/<span id="date_start"></span><br />
    <span id="year_end"></span>/<span id="month_end"></span>/<span id="date_end"></span>
    <div id="calendar-result" ></div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 18 11:41:56 JST 2018
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/section/calendar/calendar.scala.html
                  HASH: 9e3b34d10751bfc37a0b9492eef3f869859fb867
                  MATRIX: 1050->1|1071->14|1109->15|1141->21
                  LINES: 33->1|33->1|33->1|35->3
                  -- GENERATED --
              */
          
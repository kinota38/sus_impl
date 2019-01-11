
package views.html.section.calendar.month

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

    """),format.raw/*3.5*/("""<!--　<button id="tmonth" onclick='setCalendar()'>今月</button>
    <button id="bmonth" onclick='backmm(this);return false;'><<</button>
    <button id="nmonth" onclick='nextmm(this);return false;'> >> </button>

    <span id="year"></span>年<span id="month"></span>月<br />-->

    <span hidden id="all_start"><span id="year_start"></span>/<span id="month_start"></span>/<span id="date_start"></span></span><br />
    <span hidden id="all_end"><span id="year_end"></span>/<span id="month_end"></span>/<span id="date_end"></span></span>
    <span id="x_page"></span>~<span id="y_page"></span>
<div id="calendar-result"></div>

<div id="register_task" class="main-window">
    <h2>新規登録</h2>
    <span id="error-field" class="error"></span>
    <form id="registration-form">
        <dl>
            <dt>タスク名</dt>

            <dd>
                <input type="text" name="title" autocomplete="on" required>
            </dd>
            <dt>日時</dt>
            <dd>
                <input type="date" id="start_date">〜<input type="date" id="end_date">
            </dd>
        </dl>
        """),_display_(/*29.10*/helper/*29.16*/.CSRF.formField),format.raw/*29.31*/("""
    """),format.raw/*30.5*/("""</form>
    <!--<button onclick="register_new(); return false;">送信</button>
    <button onclick="close_registration_form(); return false;">キャンセル</button>-->
</div>
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
                  DATE: Fri Jan 11 11:09:38 JST 2019
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/section/calendar/month/calendar.scala.html
                  HASH: 8eff31e98262363fe95ac3cbb1b3a1c671e472df
                  MATRIX: 1056->1|1077->14|1115->15|1147->21|2261->1108|2276->1114|2312->1129|2344->1134
                  LINES: 33->1|33->1|33->1|35->3|61->29|61->29|61->29|62->30
                  -- GENERATED --
              */
          
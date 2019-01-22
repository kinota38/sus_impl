
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

object calendar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name :String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("カレンダー")/*2.15*/{_display_(Seq[Any](format.raw/*2.16*/("""

    """),format.raw/*4.5*/("""<!--　<button id="tmonth" onclick='setCalendar()'>今月</button>
    <button id="bmonth" onclick='backmm(this);return false;'><<</button>
    <button id="nmonth" onclick='nextmm(this);return false;'> >> </button>

    <span id="year"></span>年<span id="month"></span>月<br />

    <span id="year_start"></span>/<span id="month_start"></span>/<span id="date_start"></span><br />
    <span id="year_end"></span>/<span id="month_end"></span>/<span id="date_end"></span>-->
    <div id="calendar-result" ></div>

<span hidden ><span id="HH_start">0</span>:<span id="mm_start">0</span></span>
<span hidden ><span id="HH_end">0</span>:<span id="mm_end">0</span></span>
<span hidden><span id="year_start"></span>/<span id="month_start"></span>/<span id="date_start"></span></span>
<span hidden><span id="year_end"></span>/<span id="month_end"></span>/<span id="date_end"></span></span>
<div id="register_task" class="main-window">
    <h2>新規登録</h2>
    <span id="error-field" class="error"></span>
    <form id="registration-form">
        <input type="hidden" name="username" value=""""),_display_(/*22.54*/name),format.raw/*22.58*/("""">
        <dl>
            <dt>タスク名</dt>

            <dd>
                <input type="text" id="title" name="title" autocomplete="on" required>
            </dd>
            <dt>日時</dt>
            <dd>
                <input type="date" id="start_date" name="start_date">:<input type="time" id="start_time" name="start_time">
                <input type="date" id="end_date" name="end_date">:<input type="time" id="end_time" name="end_time">

            </dd>
        </dl>
        """),_display_(/*36.10*/helper/*36.16*/.CSRF.formField),format.raw/*36.31*/("""
    """),format.raw/*37.5*/("""</form>
    <button onclick="register_new(); return false;">送信</button>
    <button onclick="close_register_task(); return false;">キャンセル</button>
    <!--<button onclick="register_new(); return false;">送信</button>
    <button onclick="close_registration_form(); return false;">キャンセル</button>-->
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
                  DATE: Tue Jan 22 19:44:19 JST 2019
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/section/calendar/month/calendar.scala.html
                  HASH: 2ac29274743b9d309a678e2ce711eaec0174dba0
                  MATRIX: 974->1|1082->17|1103->30|1141->31|1173->37|2272->1109|2297->1113|2812->1601|2827->1607|2863->1622|2895->1627
                  LINES: 28->1|33->2|33->2|33->2|35->4|53->22|53->22|67->36|67->36|67->36|68->37
                  -- GENERATED --
              */
          
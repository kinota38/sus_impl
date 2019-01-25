
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
    """),format.raw/*3.5*/("""<header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="/helper/"""),_display_(/*5.52*/name),format.raw/*5.56*/("""" style="font-style: oblique; font-family: 'Arial Black', sans-serif;">
                <i class="fas fa-braille"></i>
                    Study Helper
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="/helper/"""),_display_(/*16.60*/name),format.raw/*16.64*/("""">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">リンク</a>
                    </li>
                    <li class="nav-item dropdown active">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            他の機能(この名称微妙なんで誰か考案ヨロピク)
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item active" href="/calendar/month">カレンダー<span class="sr-only">(current)</span></a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/grades/"""),_display_(/*28.69*/name),format.raw/*28.73*/("""">成績</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/chat/"""),_display_(/*30.67*/name),format.raw/*30.71*/("""">掲示板</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">TO DO リスト</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <div class="nav-link" id="tmonth" onclick='setCalendar()' style="cursor: pointer">今月</div>
                    </li>
                    <li class="nav-item">
                        <div class="nav-link" id="bmonth" onclick='backmm(this);return false;' style="cursor: pointer"><i class="fas fa-angle-left"></i></div>
                    </li>
                    <li class="nav-item">
                        <div class="nav-link" id="nmonth" onclick='nextmm(this);return false;' style="cursor: pointer"><i class="fas fa-angle-right"></i></div>
                    </li>
                    <li class="nav-item active">
                        <div class="nav-link"><span id="year"></span>年<span id="month"></span>月</div>
                    </li>
                    <li class="nav-item dropdown active " style="background-color: white; color: black; margin-left: 10px;">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: black">
                            月
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">年(作成未定)</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item active" href="/calendar/month">月<span class="sr-only">(current)</span></a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">週(作成未定)</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/calendar/day">日</a>
                        </div>
                    </li>
                </ul>
                <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-user"></i>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#"><i class="fas fa-wrench"></i>&nbsp;アカウント管理</a>
                                <a class="dropdown-item" href="#"><i class="fas fa-question"></i>&nbsp;Another action</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#"><i class="fas fa-sign-out-alt"></i>&nbsp;ログアウト</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <div class="wrapper">
        <div class="menu">
            <div id="mini-calendar-result"></div>
        </div>
        <div id="calendar-result" ></div>

        <span hidden ><span id="HH_start">0</span>:<span id="mm_start">0</span></span>
        <span hidden ><span id="HH_end">0</span>:<span id="mm_end">0</span></span>
        <span hidden><span id="year_start"></span>/<span id="month_start"></span>/<span id="date_start"></span></span>
        <span hidden><span id="year_end"></span>/<span id="month_end"></span>/<span id="date_end"></span></span>
        <div id="register_task" class="main-window">
            <h2>新規登録</h2>
            <span id="error-field" class="error"></span>
            <form id="registration-form">
                <input type="hidden" name="username" value=""""),_display_(/*94.62*/name),format.raw/*94.66*/("""">
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
                """),_display_(/*108.18*/helper/*108.24*/.CSRF.formField),format.raw/*108.39*/("""
            """),format.raw/*109.13*/("""</form>
            <button onclick="register_new(); return false;">送信</button>
            <button onclick="close_register_task(); return false;">キャンセル</button>
            <!--<button onclick="register_new(); return false;">送信</button>
            <button onclick="close_registration_form(); return false;">キャンセル</button>-->
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
                  DATE: Fri Jan 25 11:02:10 JST 2019
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/calendar/month/calendar.scala.html
                  HASH: 343dcbc1ea84735fe73ec347bd33f89040d677c5
                  MATRIX: 974->1|1082->17|1103->30|1141->31|1172->36|1324->162|1348->166|2064->855|2089->859|2940->1683|2965->1687|3132->1827|3157->1831|7259->5906|7284->5910|7896->6494|7912->6500|7949->6515|7991->6528
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|47->16|47->16|59->28|59->28|61->30|61->30|125->94|125->94|139->108|139->108|139->108|140->109
                  -- GENERATED --
              */
          

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
                            アプリ
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item active" href="/calendar/month">カレンダー<span class="sr-only">(current)</span></a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/grades/"""),_display_(/*28.69*/name),format.raw/*28.73*/("""">成績</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/chat/"""),_display_(/*30.67*/name),format.raw/*30.71*/("""">掲示板</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/todoApplication">TO DO リスト</a>
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
                                <i class="fas fa-user" data-toggle="tooltip" data-html="true" title="Study Helper アカウント<br>"""),_display_(/*66.125*/name),format.raw/*66.129*/(""" """),format.raw/*66.130*/("""さん"></i>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#"><i class="fas fa-wrench"></i>&nbsp;アカウント管理</a>
                                <a class="dropdown-item" href="#"><i class="fas fa-question"></i>&nbsp;Another action</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="/logout"><i class="fas fa-sign-out-alt"></i>&nbsp;ログアウト</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <div class="wrapper">
        <div class="left-menu-wrapper">
            <div class="left-menu">
                <div class="htpigd"></div>
                <div class="leftmenu-bottom">
                    <h1 tabindex="-1" class="ynRLnc">ドロワー</h1>
                    <div class="nav-calendar-all">
                        <h2 tabindex="-1" class="ynRLnc">ナビゲーション カレンダー</h2>
                        <div class="nav-calendar">
                            <div class="nav-calendar-op">
                                <span jsname="B1A7Xe" class="r4nke "><span id="year"></span>年 <span id="month"></span>月</span>
                                <div class="nav-calendar-display-pre" onclick="backmm()">
                                    <div class="VTBa7b MbhUzd" jsname="ksKsZd" style="top: 12px; left: 12px; width: 24px; height: 24px;"></div>
                                    <content class="xjKiLb">
                                        <span style="top: -9px">
                                            <span class="DPvwYc sm8sCf NhjcAb" aria-hidden="true"><i class="fas fa-chevron-left"></i></span>
                                        </span>
                                    </content>
                                </div>
                                <div class="nav-calendar-display-next" onclick="nextmm()">
                                    <div class="VTBa7b MbhUzd" jsname="ksKsZd" style="top: 12px; left: 12px; width: 24px; height: 24px;"></div>
                                    <content class="xjKiLb">
                                        <span style="top: -9px">
                                            <span class="DPvwYc sm8sCf NhjcAb" aria-hidden="true"><i class="fas fa-chevron-right"></i></span>
                                        </span>
                                    </content>
                                </div>
                            </div>
                            <div role="grid" aria-readonly="true" aria-label="2019年 1月" class="mini-calendar">
                                <div role="row" class="day-of-week">
                                    <span role="columnheader" aria-readonly="true" aria-label="日曜日" class="SoBqBf " data-toggle="tooltip" title="日曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                        <span aria-hidden="true">日</span>
                                        <span class="ynRLnc">日曜日</span>
                                    </span>
                                    <span role="columnheader" aria-readonly="true" aria-label="月曜日" class="SoBqBf " data-toggle="tooltip" title="月曜日" data-togg data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                        <span aria-hidden="true">月</span>
                                        <span class="ynRLnc">月曜日</span>
                                    </span>
                                    <span role="columnheader" aria-readonly="true" aria-label="火曜日" class="SoBqBf " data-toggle="tooltip" title="火曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                        <span aria-hidden="true">火</span>
                                        <span class="ynRLnc">火曜日</span>
                                    </span>
                                    <span role="columnheader" aria-readonly="true" aria-label="水曜日" class="SoBqBf " data-toggle="tooltip" title="水曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                        <span aria-hidden="true">水</span>
                                        <span class="ynRLnc">水曜日</span>
                                    </span>
                                    <span role="columnheader" aria-readonly="true" aria-label="木曜日" class="SoBqBf " data-toggle="tooltip" title="木曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                        <span aria-hidden="true">木</span>
                                        <span class="ynRLnc">木曜日</span>
                                    </span>
                                    <span role="columnheader" aria-readonly="true" aria-label="金曜日" class="SoBqBf " data-toggle="tooltip" title="金曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                        <span aria-hidden="true">金</span>
                                        <span class="ynRLnc">金曜日</span>
                                    </span>
                                    <span role="columnheader" aria-readonly="true" aria-label="土曜日" class="SoBqBf " data-toggle="tooltip" title="土曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                        <span aria-hidden="true">土</span>
                                        <span class="ynRLnc">土曜日</span>
                                    </span>
                                </div>
                                <div role="rowgroup" class="week-group" id="mini-calendar-result">

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div id="calendar-result" ></div>

        <span hidden ><span id="HH_start">0</span>:<span id="mm_start">0</span></span>
        <span hidden ><span id="HH_end">0</span>:<span id="mm_end">0</span></span>
        <span hidden><span id="year_start"></span>/<span id="month_start"></span>/<span id="date_start"></span></span>
        <span hidden><span id="year_end"></span>/<span id="month_end"></span>/<span id="date_end"></span></span>
        <!--<div id="register_task" class="main-window">
            <h2>新規登録</h2>
            <span id="error-field" class="error"></span>
            <form id="registration-form">
                <input type="hidden" name="username" value=""""),_display_(/*158.62*/name),format.raw/*158.66*/("""">
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
                """),_display_(/*172.18*/helper/*172.24*/.CSRF.formField),format.raw/*172.39*/("""
            """),format.raw/*173.13*/("""</form>
            <button onclick="register_new(); return false;">送信</button>
            <button onclick="close_register_task(); return false;">キャンセル</button>
            <button onclick="register_new(); return false;">送信</button>
            <button onclick="close_registration_form(); return false;">キャンセル</button>
        </div>-->

        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenteredLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalCenteredLabel">新規作成</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <span id="error-field"></span>
                        <form id="registration-form">
                            <input type="hidden" name="username" value=""""),_display_(/*192.74*/name),format.raw/*192.78*/("""">
                            <div class="form-group">
                                <input type="text" class="form-control" name="title" id="title" placeholder="タイトルを入力">
                            </div>
                            <div class="form-group">
                                <div class="input-group date" id="datetimepicker1">
                                    <label for="datetimepicker1" class="pt-2 pr-2">開始:</label>
                                    <input type="datetime-local" name="start_date" id="start_date" class="form-control" />
                                    <span class="input-group-append">
                                    <span class="input-group-text"><i class="fa fa-calendar"></i></span>
                                </span>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="input-group date" id="datetimepicker2">
                                    <label for="datetimepicker2" class="pt-2 pr-2">終了:</label>
                                    <input type="datetime-local" name="end_date" id="end_date" class="form-control" />
                                    <span class="input-group-append">
                                    <span class="input-group-text"><i class="fa fa-clock"></i></span>
                                </span>
                                </div>
                            </div>
                            <div class="form-group">
                                <select class="colorselector" name="color">
                                    <option value="#039BE5" data-color="#039BE5"　selected="selected">青</option>
                                    <option value="#be2edd" data-color="#be2edd">紫</option>
                                    <option value="#EE5A24" data-color="#EE5A24">オレンジ</option>
                                    <option value="#EA2027" data-color="#EA2027">赤</option>
                                    <option value="#2ecc71" data-color="#2ecc71">緑</option>
                                    <option value="#cd6133" data-color="#cd6133">茶</option>
                                </select>
                            </div>
                            """),_display_(/*224.30*/helper/*224.36*/.CSRF.formField),format.raw/*224.51*/("""
                        """),format.raw/*225.25*/("""</form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">閉じる</button>
                        <button type="button" class="btn btn-primary" onclick="register_new(); return false;">保存</button>
                    </div>
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
                  DATE: Tue Jan 29 14:09:22 JST 2019
                  SOURCE: /Users/shibainu/Documents2/sus_impl/play-java-starter-example/app/views/section/calendar/month/calendar.scala.html
                  HASH: 1a19fe017a4d48163642d49332b0387322cf8f7e
                  MATRIX: 974->1|1082->17|1103->30|1141->31|1172->36|1324->162|1348->166|2064->855|2089->859|2920->1663|2945->1667|3112->1807|3137->1811|5792->4438|5818->4442|5848->4443|13099->11666|13125->11670|13737->12254|13753->12260|13790->12275|13832->12288|15055->13483|15081->13487|17410->15788|17426->15794|17463->15809|17517->15834
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|47->16|47->16|59->28|59->28|61->30|61->30|97->66|97->66|97->66|189->158|189->158|203->172|203->172|203->172|204->173|223->192|223->192|255->224|255->224|255->224|256->225
                  -- GENERATED --
              */
          
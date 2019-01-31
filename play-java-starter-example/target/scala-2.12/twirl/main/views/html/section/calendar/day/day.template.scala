
package views.html.section.calendar.day

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

object day extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name :String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("カレンダー")/*2.15*/{_display_(Seq[Any](format.raw/*2.16*/("""
    """),format.raw/*3.5*/("""<div class="main">
        """),format.raw/*119.20*/("""
        """),format.raw/*120.9*/("""<span hidden ><span id="HH_start">0</span>:<span id="mm_start">0</span></span>
        <span hidden ><span id="HH_end">0</span>:<span id="mm_end">0</span></span>
        <span hidden><span id="year_start"></span>/<span id="month_start"></span>/<span id="date_start"></span></span>
        <span hidden><span id="year_end"></span>/<span id="month_end"></span>/<span id="date_end"></span></span>
        <header>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="/helper/"""),_display_(/*126.56*/name),format.raw/*126.60*/("""" style="font-style: oblique; font-family: 'Arial Black', sans-serif;">
                    <i class="fas fa-braille"></i>
                    Study Helper
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="/helper/"""),_display_(/*137.64*/name),format.raw/*137.68*/("""">Home</a>
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
                                <a class="dropdown-item" href="/grades/"""),_display_(/*149.73*/name),format.raw/*149.77*/("""">成績</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="/chat/"""),_display_(/*151.71*/name),format.raw/*151.75*/("""">掲示板</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="/todoApplication">TO DO リスト</a>
                            </div>
                        </li>
                        <li class="nav-item">
                            <div class="nav-link chosen-month" id="tmonth" onclick="setCalendar(); setMiniCalendar();" style="cursor: pointer">
                                今月
                            </div>
                            <div class="nav-link chosen-day" id="tday" onclick="setMiniCalendar(); showDate(); update_event_list();" style="cursor: pointer; display: none;">
                                今日
                            </div>
                        </li>
                        <li class="nav-item">
                            <div class="nav-link chosen-month" id="bmonth" onclick="backmm(this);" style="cursor: pointer"><i class="fas fa-angle-left"></i></div>
                            <div class="nav-link chosen-day" id="bday" onclick="backdd(this);" style="cursor: pointer; display: none;"><i class="fas fa-angle-left"></i></div>
                        </li>
                        <li class="nav-item">
                            <div class="nav-link chosen-month" id="nmonth" onclick="nextmm(this);" style="cursor: pointer"><i class="fas fa-angle-right"></i></div>
                            <div class="nav-link chosen-day" id="nday" onclick="nextdd(this);" style="cursor: pointer; display: none; margin: auto;"><i class="fas fa-angle-right"></i></div>
                        </li>
                        <li class="nav-item active">
                            <div class="nav-link"><span class="year-num" style="color: white;"></span>年<span class="month-num" style="color: white;"></span>月</div>
                        </li>
                        <li class="nav-item dropdown active " style="background-color: white; color: black; margin-left: 10px;">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: black">
                                <span class="chosen-day" style="display: none">日</span>
                                <span class="chosen-month">月</span>
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">年(作成未定)</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item active" href="/calendar/month">月</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">週(作成未定)</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item day-link" onclick="jumpDay()">日</a>
                            </div>
                        </li>
                    </ul>
                    <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
                        <ul class="navbar-nav">
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="fas fa-user" data-toggle="tooltip" data-html="true" title="Study Helper アカウント<br>"""),_display_(/*195.129*/name),format.raw/*195.133*/(""" """),format.raw/*195.134*/("""さん"></i>
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
        <div class="calendar-body">
            <div class="left-menu-wrapper">
                <div class="left-menu">
                    <div class="htpigd"><span hidden id="x-place"></span><span hidden id="y-place"></span><span hidden id="scroll-value"></span><span hidden id="start-Y"></span><span hidden id="end-Y"></span></div>
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
            <div id="month-scheduler-wrapper">
                <div class="event-month-field"></div>
                <div id="calendar-result" ></div>
            </div>

            <div class="date-scheduler-wrapper">

                <div class="date-scheduler-all">
                    <h1 id="c1836" class="ynRLnc"> 2019年 1月 3日 (木曜日)</h1>
                    <div class="date-scheduler">

                        <div role="grid" class="date-scheduler-core">
                            <div class="date-scheduler-top">
                                <div class="NBzXR">
                                    <div class="ALy9T" aria-hidden="true">
                                        <div class="Pgg38c Xc6hQ TzA9Ye">
                                            <div class="lmNFmc pCoqfc">GMT+09</div>
                                            <div class="lmNFmc MANBAf">午前12時</div>
                                            <div class="lmNFmc MANBAf">午前1時</div>
                                            <div class="lmNFmc MANBAf">午前2時</div>
                                            <div class="lmNFmc MANBAf">午前3時</div>
                                            <div class="lmNFmc MANBAf">午前4時</div>
                                            <div class="lmNFmc MANBAf">午前5時</div>
                                            <div class="lmNFmc MANBAf">午前6時</div>
                                            <div class="lmNFmc MANBAf">午前7時</div>
                                            <div class="lmNFmc MANBAf">午前8時</div>
                                            <div class="lmNFmc MANBAf">午前9時</div>
                                            <div class="lmNFmc MANBAf">午前10時</div>
                                            <div class="lmNFmc MANBAf">午前11時</div>
                                            <div class="lmNFmc MANBAf">午後12時</div>
                                            <div class="lmNFmc MANBAf">午後1時</div>
                                            <div class="lmNFmc MANBAf">午後2時</div>
                                            <div class="lmNFmc MANBAf">午後3時</div>
                                            <div class="lmNFmc MANBAf">午後4時</div>
                                            <div class="lmNFmc MANBAf">午後5時</div>
                                            <div class="lmNFmc MANBAf">午後6時</div>
                                            <div class="lmNFmc MANBAf">午後7時</div>
                                            <div class="lmNFmc MANBAf">午後8時</div>
                                            <div class="lmNFmc MANBAf">午後9時</div>
                                            <div class="lmNFmc MANBAf">午後10時</div>
                                            <div class="lmNFmc MANBAf">午後11時</div>
                                        </div>
                                    </div>
                                    <div aria-hidden="true" class="nL44Lb">
                                        <div class="Gk2izd">
                                            <div class="w61Ns pCoqfc">GMT+09</div>
                                            <div class="Pgg38c">
                                                <div class="lmNFmc pCoqfc">GMT+09</div>
                                                <div class="lmNFmc MANBAf">午前12時</div>
                                                <div class="lmNFmc MANBAf">午前1時</div>
                                                <div class="lmNFmc MANBAf">午前2時</div>
                                                <div class="lmNFmc MANBAf">午前3時</div>
                                                <div class="lmNFmc MANBAf">午前4時</div>
                                                <div class="lmNFmc MANBAf">午前5時</div>
                                                <div class="lmNFmc MANBAf">午前6時</div>
                                                <div class="lmNFmc MANBAf">午前7時</div>
                                                <div class="lmNFmc MANBAf">午前8時</div>
                                                <div class="lmNFmc MANBAf">午前9時</div>
                                                <div class="lmNFmc MANBAf">午前10時</div>
                                                <div class="lmNFmc MANBAf">午前11時</div>
                                                <div class="lmNFmc MANBAf">午後12時</div>
                                                <div class="lmNFmc MANBAf">午後1時</div>
                                                <div class="lmNFmc MANBAf">午後2時</div>
                                                <div class="lmNFmc MANBAf">午後3時</div>
                                                <div class="lmNFmc MANBAf">午後4時</div>
                                                <div class="lmNFmc MANBAf">午後5時</div>
                                                <div class="lmNFmc MANBAf">午後6時</div>
                                                <div class="lmNFmc MANBAf">午後7時</div>
                                                <div class="lmNFmc MANBAf">午後8時</div>
                                                <div class="lmNFmc MANBAf">午後9時</div>
                                                <div class="lmNFmc MANBAf">午後10時</div>
                                                <div class="lmNFmc MANBAf">午後11時</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div role="presentation" class="H7IzGb">
                                    <div class="Pjfgme">
                                        <div class="AvIB" jsname="kCV3k">
                                            <div class="xsOpqe"></div>
                                            <div class="rDiXPe">
                                                <div class="UrIkue"></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div role="row" class="Uit9Se"><!-- 曜日日付表示 -->
                                        <div role="presentation" jsname="ShISi" class="kxfKW">
                                            <div class="xsOpqe"></div>
                                            <div class="SU7tYb R2tnIf elYzab-cXXICe-Hjleke" role="columnheader" tabindex="-1">
                                                <div class="C5Jlgc"></div>
                                                <div aria-hidden="true" class="fimTmc">
                                                    <h2 class="rpCPrc">
                                                        <span hidden class="date-num"></span>
                                                        <div class="MmhHI qAeuG N4XV7d" aria-hidden="true"><span class="display-date"></span></div>
                                                        <div class="MmhHI KSxb4d N4XV7d" tabindex="0"><span class="display-day" style="color: white"></span></div>
                                                    </h2>
                                                </div>
                                            </div>
                                            <div aria-hidden="true" class="wcMO4d"></div>
                                        </div>
                                    </div>
                                    <div role="presentation" aria-hidden="true" class="jRJqje">
                                        <div class="xsOpqe"></div>
                                        <div class="MVMVEe  GFiTfe">
                                            <ul aria-hidden="true" class="ZHdPfd">
                                                <li class="yEkOpe"></li>
                                            </ul>
                                            <div role="presentation" class="rES0Be elYzab-cXXICe-Hjleke  uj9dId" style="height:0em;">
                                                <div role="gridcell" aria-labelledby="c1856" tabindex="-1" class="eADW5d">
                                                    <h2 id="c1856" class="ynRLnc">終日の予定一覧</h2>
                                                    <div role="presentation">
                                                        <div data-opens-details="true" data-keyboardactiontype="0;1" class="ifwtOb elYzab-cXXICe-Hjleke NlL62b" data-dragsource-type="6" style="left:0%; width:100%; top:0em;border-color:#039BE5;">
                                                            <div class="g3dbUc jKgTF XFPdgf QGRmIf" style="background-color:#039BE5;" role="button" tabindex="0">
                                                                <div class="zWcBU BvHyo gpOGPc" aria-hidden="true" style="border-left-color:#039BE5"></div>
                                                                <span aria-hidden="true" class="c1wk3e">
                                                                    <span class="yzifAd">ここここ</span>
                                                                </span>
                                                                <span class="ynRLnc">終日、ここここ、username、承諾済み、場所の指定なし、2019年 1月 2日 ～ 3日</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div aria-hidden="true" class="Xk5jT"></div>
                                    </div>
                                </div>
                            </div>
                            <div class="date-scheduler-main">
                                <div class="date-scheduler-main-core">
                                    <div class="left-time">
                                        <div class="GENA3c">
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午前12時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午前1時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午前2時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午前3時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午前4時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午前5時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午前6時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午前7時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午前8時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午前9時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午前10時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午前11時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午後12時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午後1時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午後2時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午後3時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午後4時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午後5時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午後6時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午後7時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午後8時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午後9時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午後10時</span></div>
                                            <div class="s4ZaLd"><span class="ebZ3od MANBAf">午後11時</span></div>
                                            <div class="Pgg38c">
                                                <div class="lmNFmc pCoqfc">GMT+09</div>
                                                <div class="lmNFmc MANBAf">午前12時</div>
                                      """),
format.raw("""          <div class="lmNFmc MANBAf">午前1時</div>
                                                <div class="lmNFmc MANBAf">午前2時</div>
                                                <div class="lmNFmc MANBAf">午前3時</div>
                                                <div class="lmNFmc MANBAf">午前4時</div>
                                                <div class="lmNFmc MANBAf">午前5時</div>
                                                <div class="lmNFmc MANBAf">午前6時</div>
                                                <div class="lmNFmc MANBAf">午前7時</div>
                                                <div class="lmNFmc MANBAf">午前8時</div>
                                                <div class="lmNFmc MANBAf">午前9時</div>
                                                <div class="lmNFmc MANBAf">午前10時</div>
                                                <div class="lmNFmc MANBAf">午前11時</div>
                                                <div class="lmNFmc MANBAf">午後12時</div>
                                                <div class="lmNFmc MANBAf">午後1時</div>
                                                <div class="lmNFmc MANBAf">午後2時</div>
                                                <div class="lmNFmc MANBAf">午後3時</div>
                                                <div class="lmNFmc MANBAf">午後4時</div>
                                                <div class="lmNFmc MANBAf">午後5時</div>
                                                <div class="lmNFmc MANBAf">午後6時</div>
                                                <div class="lmNFmc MANBAf">午後7時</div>
                                                <div class="lmNFmc MANBAf">午後8時</div>
                                                <div class="lmNFmc MANBAf">午後9時</div>
                                                <div class="lmNFmc MANBAf">午後10時</div>
                                                <div class="lmNFmc MANBAf">午後11時</div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="right-time-space">
                                        <div role="row" id="c3250" class="cOpq4e elYzab-cXXICe-Hjleke" style="z-index: 1"  data-dragsource-type="4">
                                            <div aria-hidden="true" class="wyrRZc">
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c Izq6pb"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                                <div class="mmsF1c"></div>
                                            </div>
                                            <div class="EdAri"></div>
                                            <div role="gridcell" tabindex="-1" style="pointer-events: none" aria-labelledby="tsc-0" data-column-index="0" data-datekey="25123" class="YvjgZe Qbfsob event-field">
                                                <h2 id="tsc-0" class="ynRLnc">予定一覧</h2>
                                                <div aria-hidden="true" class="H3tRZe" key="now-indicator" style="top: 890px;"></div>
                                                <div aria-hidden="true" class="h11RHc" key="now-indicator-dot" style="top: 890px;"></div>
                                                <div role="presentation" class="WJVfWe A3o4Oe event-field">
                                                    <div role="button" tabindex="0" data-keyboardactiontype="0;1" class="NlL62b EfQccc elYzab-cXXICe-Hjleke  EiZ8Dd jKgTF" style=" top:359px; height:58px;left:0%; width:100%;z-index:4;background-color: #039BE5;border-color: #039BE5;">
                                                        <div class="ynRLnc">午前9時～午前10:30、英語第九、場所: W934、2019年 1月 30日</div>
                                                        <div aria-hidden="true" class="lFe10c ">
                                                            <div class="Jmftzc RIOtYe EiZ8Dd TuM9nf" style="max-height:15px"><span class="FAxxKc">英語第九</span></div>
                                                            <div class="Jmftzc gVNoLb  EiZ8Dd TuM9nf">午前9時～10:30</div>
                                                            <div class="Jmftzc K9QN7e  EiZ8Dd TuM9nf">W934</div>
                                                        </div>
                                                        <div aria-hidden="true" class="leOeGd elYzab-cXXICe-Hjleke" data-dragsource-type="3"></div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!-- Create Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenteredLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalCenteredLabel">新規作成</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close" onclick="close_register_task()">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <span id="error-field"></span>
                    <form id="registration-form">
                        <input type="hidden" name="username" value=""""),_display_(/*532.70*/name),format.raw/*532.74*/("""">
                        <div class="form-group">
                            <input type="text" class="form-control" id="title" name="title" placeholder="タイトルを入力">
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
                        """),_display_(/*564.26*/helper/*564.32*/.CSRF.formField),format.raw/*564.47*/("""
                    """),format.raw/*565.21*/("""</form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal" onclick="close_register_task()">閉じる</button>
                    <button type="button" class="btn btn-primary" onclick="register_new(); return false;">保存</button>
                </div>
            </div>
        </div>
    </div>

        <!-- Edit Modal -->
    <div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenteredLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="editModalCenteredLabel">編集</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close" onclick="close_register_task();">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <span hidden id="edit-id"></span>
                    <span id="error-field"></span>
                    <form id="edit-form">
                        <input type="hidden" name="username" value=""""),_display_(/*589.70*/name),format.raw/*589.74*/("""">
                        <div class="form-group">
                            <input type="text" class="form-control" name="title" id="edit-title" placeholder="タイトルを入力">
                        </div>
                        <div class="form-group">
                            <div class="input-group date" id="datetimepicker1">
                                <label for="datetimepicker1" class="pt-2 pr-2">開始:</label>
                                <input type="datetime-local" name="start_date" id="edit-start_date" class="form-control" />
                                <span class="input-group-append">
                                    <span class="input-group-text"><i class="fa fa-calendar"></i></span>
                                </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group date" id="datetimepicker2">
                                <label for="datetimepicker2" class="pt-2 pr-2">終了:</label>
                                <input type="datetime-local" name="end_date" id="edit-end_date" class="form-control" />
                                <span class="input-group-append">
                                    <span class="input-group-text"><i class="fa fa-clock"></i></span>
                                </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <select class="colorselector" name="color">
                                <option value="#039BE5" data-color="#039BE5">青</option>
                                <option value="#be2edd" data-color="#be2edd">紫</option>
                                <option value="#EE5A24" data-color="#EE5A24">オレンジ</option>
                                <option value="#EA2027" data-color="#EA2027">赤</option>
                                <option value="#2ecc71" data-color="#2ecc71">緑</option>
                                <option value="#cd6133" data-color="#cd6133">茶</option>
                            </select>
                        </div>
                        """),_display_(/*621.26*/helper/*621.32*/.CSRF.formField),format.raw/*621.47*/("""
                    """),format.raw/*622.21*/("""</form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal" onclick="close_register_task();">閉じる</button>
                    <button type="button" class="btn btn-primary" onclick="edit_entry(); return false;">変更</button>
                    <button type="button" class="btn btn-secondary" data-toggle="tooltip" title="削除" onclick="delete_entry(); return false;">
                        <i class="fas fa-trash-alt"></i>
                    </button>
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
                  DATE: Thu Jan 31 21:32:15 JST 2019
                  SOURCE: /Users/shibainu/Documents2/sus_impl/play-java-starter-example/app/views/section/calendar/day/day.scala.html
                  HASH: e24fedac16ed8c40abab5b74faced7cc580f00e2
                  MATRIX: 967->1|1075->17|1096->30|1134->31|1165->36|1221->8874|1258->8883|1822->9419|1848->9423|2601->10148|2627->10152|3507->11004|3533->11008|3709->11156|3735->11160|7389->14785|7416->14789|7447->14790|34919->42214|34945->42218|37162->44407|37178->44413|37215->44428|37265->44449|38591->45747|38617->45751|40829->47935|40845->47941|40882->47956|40932->47977
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->119|36->120|42->126|42->126|53->137|53->137|65->149|65->149|67->151|67->151|111->195|111->195|111->195|449->532|449->532|481->564|481->564|481->564|482->565|506->589|506->589|538->621|538->621|538->621|539->622
                  -- GENERATED --
              */
          
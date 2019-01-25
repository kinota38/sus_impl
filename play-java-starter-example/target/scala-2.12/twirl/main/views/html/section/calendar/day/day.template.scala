
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
        """),format.raw/*120.9*/("""<header>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="/helper/"""),_display_(/*122.56*/name),format.raw/*122.60*/("""" style="font-style: oblique; font-family: 'Arial Black', sans-serif;">
                    <i class="fas fa-braille"></i>
                    Study Helper
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="/helper/"""),_display_(/*133.64*/name),format.raw/*133.68*/("""">Home</a>
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
                                <a class="dropdown-item" href="/grades/"""),_display_(/*145.73*/name),format.raw/*145.77*/("""">成績</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="/chat/"""),_display_(/*147.71*/name),format.raw/*147.75*/("""">掲示板</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">TO DO リスト</a>
                            </div>
                        </li>
                        <li class="nav-item">
                            <div class="nav-link" id="tmonth" onclick='setCalendar()' style="cursor: pointer">今日</div>
                        </li>
                        <li class="nav-item">
                            <div class="nav-link" id="bmonth" onclick='backdd(this);return false;' style="cursor: pointer"><i class="fas fa-angle-left"></i></div>
                        </li>
                        <li class="nav-item">
                            <div class="nav-link" id="nmonth" onclick='nextdd(this);return false;' style="cursor: pointer"><i class="fas fa-angle-right"></i></div>
                        </li>
                        <li class="nav-item active">
                            <div class="nav-link"><span id="year"></span>年<span id="month"></span>月</div>
                        </li>
                        <li class="nav-item dropdown active " style="background-color: white; color: black; margin-left: 10px;">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: black">
                                日
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">年(作成未定)</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="/calendar/month">月</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">週(作成未定)</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item active" href="/calendar/day">日<span class="sr-only">(current)</span></a>
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
        <div class="event-create-button-wrapper">
            <button class="event-create-button-button" type="button" name="button">
                <span class="event-create-button-core">
                    <div class="event-create-button">
                        <svg width="36" height="36" viewBox="0 0 36 36">
                            <path fill="#34A853" d="M16 16v14h4V20z"></path>
                            <path fill="#4285F4" d="M30 16H20l-4 4h14z"></path>
                            <path fill="#FBBC05" d="M6 16v4h10l4-4z"></path>
                            <path fill="#EA4335" d="M20 16V6h-4v14z"></path>
                            <path fill="none" d="M0 0h36v36H0z"></path>
                        </svg>
                    </div>
                    <div class="u5sQsb">作成</div>
                </span>
            </button>
        </div>
        <div class="calendar-body">
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
                                        <span role="columnheader" aria-readonly="true" aria-label="日曜日" class="SoBqBf " jscontroller="H5Cjge" jsaction="focus: eGiyHb;mouseenter: eGiyHb; touchstart: eGiyHb;" data-text="日曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                            <span aria-hidden="true">日</span>
                                            <span class="ynRLnc">日曜日</span>
                                        </span>
                                        <span role="columnheader" aria-readonly="true" aria-label="月曜日" class="SoBqBf " jscontroller="H5Cjge" jsaction="focus: eGiyHb;mouseenter: eGiyHb; touchstart: eGiyHb;" data-text="月曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                            <span aria-hidden="true">月</span>
                                            <span class="ynRLnc">月曜日</span>
                                        </span><span role="columnheader" aria-readonly="true" aria-label="火曜日" class="SoBqBf " jscontroller="H5Cjge" jsaction="focus: eGiyHb;mouseenter: eGiyHb; touchstart: eGiyHb;" data-text="火曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                        <span aria-hidden="true">火</span>
                                        <span class="ynRLnc">火曜日</span>
                                    </span>
                                        <span role="columnheader" aria-readonly="true" aria-label="水曜日" class="SoBqBf " jscontroller="H5Cjge" jsaction="focus: eGiyHb;mouseenter: eGiyHb; touchstart: eGiyHb;" data-text="水曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                            <span aria-hidden="true">水</span>
                                            <span class="ynRLnc">水曜日</span>
                                        </span>
                                        <span role="columnheader" aria-readonly="true" aria-label="木曜日" class="SoBqBf " jscontroller="H5Cjge" jsaction="focus: eGiyHb;mouseenter: eGiyHb; touchstart: eGiyHb;" data-text="木曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                            <span aria-hidden="true">木</span>
                                            <span class="ynRLnc">木曜日</span>
                                        </span>
                                        <span role="columnheader" aria-readonly="true" aria-label="金曜日" class="SoBqBf " jscontroller="H5Cjge" jsaction="focus: eGiyHb;mouseenter: eGiyHb; touchstart: eGiyHb;" data-text="金曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                            <span aria-hidden="true">金</span>
                                            <span class="ynRLnc">金曜日</span>
                                        </span>
                                        <span role="columnheader" aria-readonly="true" aria-label="土曜日" class="SoBqBf " jscontroller="H5Cjge" jsaction="focus: eGiyHb;mouseenter: eGiyHb; touchstart: eGiyHb;" data-text="土曜日" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
                                            <span aria-hidden="true">土</span>
                                            <span class="ynRLnc">土曜日</span>
                                        </span>
                                    </div>
                                    <div role="rowgroup" class="week-group" id="mini-calendar-result">

                                    </div>
                                </div>
                            </div>
                            <div jscontroller="rQoDSc" jsaction="IHPIXb:KbbOyc;hnxYEe:KbbOyc;fFEQy:toszxb;LTfiof:F8Awqb;"></div>
                        </div>
                        <div jscontroller="rQoDSc" jsaction="IHPIXb:KbbOyc;hnxYEe:KbbOyc;fFEQy:toszxb;LTfiof:F8Awqb;"></div>
                    </div>
                </div>
            </div>
            <div class="date-scheduler-wrapper">
                <div class="date-scheduler-all">
                    <h1 id="c1836" aria-label=" 2019年 1月 3日 (木曜日)" jscontroller="jsO44b" jsaction="focus: h06R8; blur: zjh6rb;" jsname="rb2thd" class="ynRLnc"> 2019年 1月 3日 (木曜日)</h1>
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
                                        <div class="Gk2izd" jscontroller="H5Cjge" jsaction="focus: eGiyHb;mouseenter: eGiyHb; touchstart: eGiyHb;" data-text="GMT+09" data-tooltip-position="bottom" data-tooltip-vertical-offset="0" data-tooltip-horizontal-offset="0" data-tooltip-only-if-necessary="false">
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
                                            <div class="SU7tYb R2tnIf elYzab-cXXICe-Hjleke" role="columnheader" aria-readonly="true" data-dragsource-type="8" data-dragsource-delay="0" tabindex="-1">
                                                <div class="C5Jlgc"></div>
                                                <div aria-hidden="true" class="fimTmc">
                                                    <h2 class="rpCPrc">
                                                        <div class="MmhHI qAeuG N4XV7d" aria-hidden="true"><span class="display-date"></span></div>
                                                        <div class="MmhHI KSxb4d N4XV7d" aria-label="1月 3日 (木曜日)" tabindex="0"><span class="display-day" style="color: white"></span></div>
                                                    </h2>
                                                </div>
                                            </div>
                                            <div aria-hidden="true" class="wcMO4d"></div>
                                        </div>
                                    </div>
                                    <div role="presentation" aria-hidden="true" class="jRJqje" jsname="sZR1Lb">
                                        <div class="xsOpqe"></div>
                                        <div class="MVMVEe  GFiTfe">
                                            <ul aria-hidden="true" class="ZHdPfd" jsname="GkYald">
                                                <li class="yEkOpe" jsname="LF4U9b"></li>
                                            </ul>
                                            <div role="presentation" class="rES0Be elYzab-cXXICe-Hjleke  uj9dId" style="height:0em;" jscontroller="njBlKd" data-dragsource-type="8" data-dragsource-delay="0">
                                                <div role="gridcell" aria-labelledby="c1856" tabindex="-1" class="eADW5d">
                                                    <h2 id="c1856" class="ynRLnc">終日の予定なし、natade cocoa さん</h2>
                                                </div>
                                            </div>
                                        </div>
                                        <div aria-hidden="true" class="Xk5jT"></div>
                                    </div>
                                </div>
                            </div>
                            <div class="da"""),
format.raw("""te-scheduler-main">
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
                                    <div class="right-time-space">
                                        <div role="row" id="c3250" class="cOpq4e elYzab-cXXICe-Hjleke" jsname="ff2wFe" data-dragsource-type="4">
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
                                            <div role="gridcell" tabindex="-1" aria-labelledby="tsc-0" jsname="RjPD4e" key="25123eW9zaGlha2kyMDE2NDE0QGdtYWlsLmNvbQ" data-column-index="0" data-datekey="25123" data-principal-ids="eW9zaGlha2kyMDE2NDE0QGdtYWlsLmNvbQ" class="YvjgZe Qbfsob">
                                                <h2 id="tsc-0" class="ynRLnc">予定一覧</h2>
                                                <div aria-hidden="true" class="H3tRZe" key="now-indicator" style="top: 890px;"></div>
                                                <div aria-hidden="true" class="h11RHc" key="now-indicator-dot" style="top: 890px;"></div>
                                                <div role="presentation" class="WJVfWe A3o4Oe">
                                                    <div role="button" tabindex="0" data-eventid="NTQyaDd2bzY1bXEzNjE0YmJraWYxdGo1bzJfMjAxOTAxMzBUMDAwMDAwWiB5b3NoaWFraTIwMTY0MTRAbQ" data-eventchip="" data-opens-details="true" data-keyboardactiontype="0;1" jscontroller="Bo3nHd" jsaction="click:cOuCgd; contextmenu:mg9Pef; dblclick:Reio8; mouseenter:tfO1Yc; mouseleave:JywGue;" jslog="35463; track:click,dblclick" class="NlL62b EfQccc elYzab-cXXICe-Hjleke  EiZ8Dd jKgTF" style=" top:359px; height:58px;left:0%; width:100%;z-index:4;background-color: #039BE5;border-color: #039BE5;">
                                                        <div class="ynRLnc">午前9時～午前10:30、英語第九、場所: W934、2019年 1月 30日</div>
                                                        <div aria-hidden="true" class="lFe10c ">
                                                            <div class="Jmftzc RIOtYe EiZ8Dd TuM9nf" style="max-height:15px"><span class="FAxxKc">英語第九</span></div>
                                                            <div class="Jmftzc gVNoLb  EiZ8Dd TuM9nf">午前9時～10:30</div>
                                                            <div class="Jmftzc K9QN7e  EiZ8Dd TuM9nf">W934</div>
                                                        </div>
                                                        <div aria-hidden="true" class="leOeGd elYzab-cXXICe-Hjleke" data-eventid="NTQyaDd2bzY1bXEzNjE0YmJraWYxdGo1bzJfMjAxOTAxMzBUMDAwMDAwWiB5b3NoaWFraTIwMTY0MTRAbQ" data-dragsource-type="3"></div>
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
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/calendar/day/day.scala.html
                  HASH: 0c6099073cabddae8012d775cb7590c90a89c70a
                  MATRIX: 967->1|1075->17|1096->30|1134->31|1165->36|1221->8874|1258->8883|1420->9017|1446->9021|2199->9746|2225->9750|3125->10622|3151->10626|3327->10774|3353->10778
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->119|36->120|38->122|38->122|49->133|49->133|61->145|61->145|63->147|63->147
                  -- GENERATED --
              */
          

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

object day extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("カレンダー")/*1.15*/{_display_(Seq[Any](format.raw/*1.16*/("""
    """),format.raw/*2.5*/("""<div class="main">
        <header>
            <div class="header-all" style="background-color: #fff">
                <div class="header-left">
                    <div class="humberger" aria-expanded="true">
                        <svg focusable="false" viewBox="0 0 24 24">
                            <path d="M3 18h18v-2H3v2zm0-5h18v-2H3v2zm0-7v2h18V6H3z"></path>
                        </svg>
                    </div>
                    <div class="calendar-icon">
                        <div class="calendar-icon-inner">
                            <a class="icon-all" aria-label="カレンダー" tabindex="-1" aria-hidden="true">
                                <img class="icon-img" alt="" aria-hidden="true" src="https://www.gstatic.com/images/branding/product/1x/calendar_48dp.png" srcset="https://www.gstatic.com/images/branding/product/1x/calendar_48dp.png 1x, https://www.gstatic.com/images/branding/product/2x/calendar_48dp.png 2x " style="width:40px;height:40px">
                                <span class="icon-moji" style="text-decoration: none;">カレンダー</span>
                            </a>
                        </div>
                    </div>
                </div>

                <div class="header-center">
                    <div class="date-op-all">
                        <div class="date-op-inner">
                            <div class="date-op-core">
                                <div class="date-op">
                                    <div class="date-op-real">
                                        <div class="today-op">
                                            <div class="Vwe4Vb MbhUzd" jsname="ksKsZd" style="top: 23px; left: 27px; width: 53px; height: 53px;"></div>
                                            <div class="ZFr60d CeoRYc"></div>
                                            <content class="CwaK9"><span class="RveJvd snByac">今日</span></content>
                                        </div>
                                        <div class="pre-month">
                                            <div class="VTBa7b MbhUzd" jsname="ksKsZd"></div>
                                            <content class="xjKiLb">
                                                <span style="top: -12px">
                                                    <span class="DPvwYc sm8sCf NhjcAb" aria-hidden="true"><i class="fas fa-chevron-left"></i></span>
                                                </span>
                                            </content>
                                        </div>
                                        <div class="next-month">
                                            <div class="VTBa7b MbhUzd" jsname="ksKsZd" style="top: 19px; left: 11.5px; width: 32px; height: 32px;"></div>
                                            <content class="xjKiLb">
                                                <span style="top: -12px">
                                                    <span class="DPvwYc sm8sCf NhjcAb" aria-hidden="true"><i class="fas fa-chevron-right"></i></span>
                                                </span>
                                            </content>
                                        </div>
                                    </div>
                                </div>
                                <div class="display-month">
                                    <div class="display-month-core">
                                        <span class="ynRLnc">2019年 1月</span>
                                        <div aria-hidden="true" class="bQnbhf">
                                            <div class="zR2Wpe">
                                                <div class="KaL5Wc">
                                                    <div class="rSoRzd">2019年 1月</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="other-op-all">
                        <div class="other-op-inner">
                            <div class="other-op-core">
                                <div class="search-icon-wrapper">
                                    <div class="search-icon">
                                        <div class="VTBa7b MbhUzd" jsname="ksKsZd"></div>
                                        <content class="xjKiLb">
                                            <span style="top: -12px">
                                                <span class="DPvwYc NhjcAb" aria-hidden="true"><i class="fas fa-search"></i></span>
                                            </span>
                                        </content>
                                    </div>
                                </div>
                                <div class="settings-icon-wrapper">
                                    <div class="settings-icon">
                                        <div class="NWlf3e MbhUzd" jsname="ksKsZd"></div>
                                        <content class="MhXXcc oJeWuf">
                                            <span class="Lw7GHd snByac">
                                                <svg xmlns="https://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                                                    <path d="M13.85 22.25h-3.7c-.74 0-1.36-.54-1.45-1.27l-.27-1.89c-.27-.14-.53-.29-.79-.46l-1.8.72c-.7.26-1.47-.03-1.81-.65L2.2 15.53c-.35-.66-.2-1.44.36-1.88l1.53-1.19c-.01-.15-.02-.3-.02-.46 0-.15.01-.31.02-.46l-1.52-1.19c-.59-.45-.74-1.26-.37-1.88l1.85-3.19c.34-.62 1.11-.9 1.79-.63l1.81.73c.26-.17.52-.32.78-.46l.27-1.91c.09-.7.71-1.25 1.44-1.25h3.7c.74 0 1.36.54 1.45 1.27l.27 1.89c.27.14.53.29.79.46l1.8-.72c.71-.26 1.48.03 1.82.65l1.84 3.18c.36.66.2 1.44-.36 1.88l-1.52 1.19c.01.15.02.3.02.46s-.01.31-.02.46l1.52 1.19c.56.45.72 1.23.37 1.86l-1.86 3.22c-.34.62-1.11.9-1.8.63l-1.8-.72c-.26.17-.52.32-.78.46l-.27 1.91c-.1.68-.72 1.22-1.46 1.22zm-3.23-2h2.76l.37-2.55.53-.22c.44-.18.88-.44 1.34-.78l.45-.34 2.38.96 1.38-2.4-2.03-1.58.07-.56c.03-.26.06-.51.06-.78s-.03-.53-.06-.78l-.07-.56 2.03-1.58-1.39-2.4-2.39.96-.45-.35c-.42-.32-.87-.58-1.33-.77l-.52-.22-.37-2.55h-2.76l-.37 2.55-.53.21c-.44.19-.88.44-1.34.79l-.45.33-2.38-.95-1.39 2.39 2.03 1.58-.07.56a7 7 0 0 0-.06.79c0 .26.02.53.06.78l.07.56-2.03 1.58 1.38 2.4 2.39-.96.45.35c.43.33.86.58 1.33.77l.53.22.38 2.55z"></path>
                                                    <circle cx="12" cy="12" r="3.5"></circle>
                                                </svg>
                                            </span>
                                        </content>
                                    </div>
                                </div>
                                <div class="field-selecter-wrapper">
                                    <div class="field-selecter">
                                        <div class="selected-field">
                                            <div class="lVYxmb MbhUzd" jsname="ksKsZd" style="top: 16px; left: 49.25px; width: 54px; height: 54px;"></div>
                                            <div class="g4jUVc" aria-hidden="true"></div>
                                            <content class="I3EnF oJeWuf"><span class="NlWrkb snByac">日</span></content>
                                        </div>
                                        <span class="DPvwYc xmVoP SGNdae" aria-hidden="true"><i class="fas fa-sort-down"></i></span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="header-right">
                    <div class="account-icon-all">
                        <div class="account-icon-wrapper">
                            <div class="account-icon">
                                <a class="gb_b gb_hb gb_R" href="https://accounts.google.com/SignOutOptions?hl=ja&amp;continue=https://calendar.google.com/calendar/r%3Ftab%3Dmc%26pli%3D1%26t%3DAKUaPmYff2C7oqO150U6LqR_21sHiQPFwpE8_cliogdFzFz7-oNG3c5se_QhAwQ-yQBTMACMB_nyz4ZWt0hA80QHIaUIrkg1Hg%253D%253D&amp;service=cl" role="button" tabindex="0" aria-expanded="false">
                                    <span class="gb_cb gbii"><i class="far fa-user"></i></span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
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
                              """),
format.raw("""                  <div class="lmNFmc MANBAf">午前2時</div>
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
                                                        <div class="MmhHI qAeuG N4XV7d" aria-hidden="true">木</div>
                                                        <div class="MmhHI KSxb4d N4XV7d" aria-label="1月 3日 (木曜日)" tabindex="0">3</div>
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
                                                <h2 id="tsc-0" class="ynRLnc">予定なし、natade cocoa さん</h2>
                                                <div aria-hidden="true" class="H3tRZe" key="now-indicator" style="top: 890px;"></div>
                                                <div aria-hidden="true" class="h11RHc" key="now-indicator-dot" style="top: 890px;"></div>
                                                <div role="presentation" class="WJVfWe A3o4Oe"></div>
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 12 03:23:31 JST 2019
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/calendar/day/day.scala.html
                  HASH: c0bae01454439215fe898592e55bcbe4cc929654
                  MATRIX: 1049->1|1070->14|1108->15|1139->20
                  LINES: 33->1|33->1|33->1|34->2
                  -- GENERATED --
              */
          
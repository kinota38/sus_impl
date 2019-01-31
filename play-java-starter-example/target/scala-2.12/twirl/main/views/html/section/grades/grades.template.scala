
package views.html.section.grades

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

object grades extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("成績")/*2.12*/ {_display_(Seq[Any](format.raw/*2.14*/("""
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
                    <li class="nav-item active">
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
                            <a class="dropdown-item" href="/calendar/month">カレンダー</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item active" href="/grades/"""),_display_(/*28.76*/name),format.raw/*28.80*/("""">成績 <span class="sr-only">(current)</span></a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/chat/"""),_display_(/*30.67*/name),format.raw/*30.71*/("""">掲示板</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/todoApplication">TO DO リスト</a>
                        </div>
                    </li>
                </ul>
                <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-user"　data-toggle="tooltip" data-html="true" title="Study Helper アカウント<br>"""),_display_(/*40.125*/name),format.raw/*40.129*/(""" """),format.raw/*40.130*/("""さん"></i>
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

    <div class="main">
        <form id="dummy-form">
            """),_display_(/*57.14*/helper/*57.20*/.CSRF.formField),format.raw/*57.35*/("""
        """),format.raw/*58.9*/("""</form>

        """),format.raw/*60.42*/("""
        """),format.raw/*61.9*/("""<div class="this-radio" id="tag-radio1">
            <input type="radio" name="tag-radio" id="on1" value="center" checked="">
            <label for="on1" class="switch-on">センター</label>
            <input type="radio" name="tag-radio" id="off1" value="niji">
            <label for="off1" class="switch-off">二次</label>
        </div>
        <div class="center">
            <div  class="first-section">
                <div  class="first-element" >
                    <div class="plus-icon" >
                        <i class="fa fa-plus"></i>
                    </div>
                    <div class="this-radio" id="chart1-radio-center">
                        <input type="radio" name="first-radio-center" id="on2" value="ave_grades" checked="">
                        <label for="on2" class="switch-on">平均点</label>
                        <input type="radio" name="first-radio-center" id="off2" value="max_grades">
                        <label for="off2" class="switch-off">最高点</label>
                    </div>
                    <canvas  id="myChart1-center" ></canvas>
                    <div class="no-grade" id="no-grade-center">成績が登録されてません</div>
                    <div class="add-acc-button"><a onclick="add_to_acc();">推移に追加する</a></div>

                </div>
            </div>

            <div class="chart-area2">
                <select class="chart2-select" id="chart2-select-center">

                </select>
                <canvas id="myChart2-center" ></canvas>
                <div class="no-grade" id="no-acc-center">成績推移が登録されてません</div>
            </div>
        </div>
        <div class="niji">
            <div  class="first-section">
                <div  class="first-element" >
                    <div class="plus-icon" >
                        <i class="fa fa-plus"></i>
                    </div>
                    <div class="this-radio" id="chart1-radio-niji">
                        <input type="radio" name="first-radio-niji" id="on3" value="ave_grades" checked="">
                        <label for="on3" class="switch-on">平均点</label>
                        <input type="radio" name="first-radio-niji" id="off3" value="max_grades">
                        <label for="off3" class="switch-off">最高点</label>
                    </div>
                    <canvas  id="myChart1-niji" ></canvas>
                    <div class="no-grade" id="no-grade-niji">成績が登録されてません</div>
                    <div class="add-acc-button"><a onclick="add_to_acc();">推移に追加する</a></div>
                </div>
            </div>
            <div class="chart-area2">
                <select class="chart2-select" id="chart2-select-niji">

                </select>
                <canvas id="myChart2-niji" ></canvas>
                <div class="no-grade" id="no-acc-niji">成績推移が登録されてません</div>
            </div>
        </div>

        <div class ="layer" id="edit-layer"></div>
        <div class="off" id="register-grade">
            <div class="slide-inner">
                <div id="register">
                    <form id="register-form">
                        <br>
                        科目名<br><input type="text" class="txtb" name="register-subject">
                        得点<br><input type="text" class="txtb" name="register-now">
                        """),_display_(/*128.26*/helper/*128.32*/.CSRF.formField),format.raw/*128.47*/("""
                    """),format.raw/*129.21*/("""</form>
                    <button class="button" onclick="register(); return false;">追加</button>
                </div>
            </div>
        </div>
        <div class="popup" id="edit-popup">
            <form id="edit-form">
                <br>
                自分の得点<br>
                <input type="text" name="new-grade" class="txtb" id="edit-grade"><br>
                """),_display_(/*139.18*/helper/*139.24*/.CSRF.formField),format.raw/*139.39*/("""
            """),format.raw/*140.13*/("""</form>
            <span id="edit_button-field"></span>
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
                  DATE: Thu Jan 31 21:39:50 JST 2019
                  SOURCE: /Users/shibainu/Documents2/sus_impl/play-java-starter-example/app/views/section/grades/grades.scala.html
                  HASH: 6aaedbaab24d4b90993bd2384dbe5b1c105221e0
                  MATRIX: 964->1|1072->17|1090->27|1129->29|1160->34|1312->160|1336->164|2055->856|2080->860|2873->1626|2898->1630|3104->1809|3129->1813|3902->2558|3928->2562|3958->2563|4793->3371|4808->3377|4844->3392|4880->3401|4925->3451|4961->3460|8294->6765|8310->6771|8347->6786|8397->6807|8809->7191|8825->7197|8862->7212|8904->7225
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|47->16|47->16|59->28|59->28|61->30|61->30|71->40|71->40|71->40|88->57|88->57|88->57|89->58|91->60|92->61|159->128|159->128|159->128|160->129|170->139|170->139|170->139|171->140
                  -- GENERATED --
              */
          
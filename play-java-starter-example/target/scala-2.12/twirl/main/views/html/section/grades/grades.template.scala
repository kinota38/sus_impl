
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

object grades extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("成績")/*1.12*/ {_display_(Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*3.1*/("""<div class="main">
    <form id="dummy-form">
        """),_display_(/*5.10*/helper/*5.16*/.CSRF.formField),format.raw/*5.31*/("""
    """),format.raw/*6.5*/("""</form>

    <div class="side-menu"></div>
    <div class="this-radio" id="tag-radio1">
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
                    """),_display_(/*76.22*/helper/*76.28*/.CSRF.formField),format.raw/*76.43*/("""
                """),format.raw/*77.17*/("""</form>
                <br>
                <br>
                <button class="button" onclick="register(); return false;">追加</button>
            </div>
        </div>
    </div>
    <div class="popup" id="edit-popup">
        <form id="edit-form">
            <br>
            自分の得点<br>
            <input type="text" name="new-grade" class="txtb" id="edit-grade"><br>
            """),_display_(/*89.14*/helper/*89.20*/.CSRF.formField),format.raw/*89.35*/("""
        """),format.raw/*90.9*/("""</form>
        <span id="edit_button-field"></span>
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
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/grades/grades.scala.html
                  HASH: 8761f995dfd99d7aecabc59c4e9f5625da5dbb9c
                  MATRIX: 1046->1|1064->11|1103->13|1131->15|1212->70|1226->76|1261->91|1292->96|4423->3200|4438->3206|4474->3221|4519->3238|4932->3624|4947->3630|4983->3645|5019->3654
                  LINES: 33->1|33->1|33->1|35->3|37->5|37->5|37->5|38->6|108->76|108->76|108->76|109->77|121->89|121->89|121->89|122->90
                  -- GENERATED --
              */
          
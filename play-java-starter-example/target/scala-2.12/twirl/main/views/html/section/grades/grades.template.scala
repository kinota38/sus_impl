
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

    <div  id="first-section">
        <div  class="first-element" id="first-chart">
            <div id="first-radio">
                <input type="radio" name="first-radio" value="ave_grades" checked>平均点
                <input type="radio" name="first-radio" value="max_grades">最高点
            </div>
            <canvas  id="myChart1" ></canvas>
            <button class="button" id="acc-register-button" onclick="add_to_acc();">累積に追加する</button>
        </div>
        <div class="first-element" id="register-grade">
            <form id="register-form">
                科目名<br><input type="text" class="register-input" name="register-subject"><br>
                得点<br><input type="text" class="register-input" name="register-now"><br>
                タグ<br><input type="text" class="register-input" name="register-tag"><br>
                """),_display_(/*22.18*/helper/*22.24*/.CSRF.formField),format.raw/*22.39*/("""
            """),format.raw/*23.13*/("""</form>
            <button  onclick="register(); return false;">追加</button>

        </div>
    </div>
    <div class ="layer" id="edit-layer"></div>
    <div class="popup" id="edit-popup">
        <div>popup</div>
        <form id="edit-form">
            <span id="input-type"></span>:<input type="text" name="new-grade" class="input-number" id="edit-grade"><br>
            """),_display_(/*33.14*/helper/*33.20*/.CSRF.formField),format.raw/*33.35*/("""
        """),format.raw/*34.9*/("""</form>
        <span id="edit_button-field"></span>
    </div>

    <div id="chart-area2">
        <select name="sources" id="chart2-select" class="custom-select sources" placeholder="科目選択"></select>
        <canvas id="myChart2" ></canvas>
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
                  DATE: Tue Dec 25 12:01:39 JST 2018
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/grades/grades.scala.html
                  HASH: d814281b15a029a031bf3ecfcd3c783df10255d3
                  MATRIX: 1046->1|1064->11|1103->13|1131->15|1212->70|1226->76|1261->91|1292->96|2175->952|2190->958|2226->973|2267->986|2673->1365|2688->1371|2724->1386|2760->1395
                  LINES: 33->1|33->1|33->1|35->3|37->5|37->5|37->5|38->6|54->22|54->22|54->22|55->23|65->33|65->33|65->33|66->34
                  -- GENERATED --
              */
          
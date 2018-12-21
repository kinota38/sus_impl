
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
"""),format.raw/*2.1*/("""<div class="header">
    <nav class="globalMenuSp">
        <ul>
            <li><a href="#">MypageTop</a></li>
            <li><a href="#">AccountSetting</a></li>
            <li><a href="/signout">LogOut</a></li>
        </ul>
    </nav>
</div>
<div class="navToggle">
    <span></span><span></span><span></span><span>menu</span>
</div>
<div class="main">

    <div  id="first-section">
        <div  class="first-element" id="first-chart">
            <canvas  id="myChart1" ></canvas>
            </div>
        <div class="first-element" id="register-grade">
            <div>popup</div>
            <form id="register-form">
                科目名:<br><input type="text" class="register-input" name="register-subject"><br>
                得点:<br><input type="text" class="register-input" name="register-now"><br>
                """),_display_(/*25.18*/helper/*25.24*/.CSRF.formField),format.raw/*25.39*/("""
            """),format.raw/*26.13*/("""</form>
            <button  onclick="register(); return false;">追加</button>

        </div>
    </div>

    <div class ="layer" id="edit-layer"></div>
    <div class="popup" id="edit-popup">
        <div>popup</div>
        <form id="edit-form">
            <span id="input-type"></span>:<input type="text" name="new-grade" class="input-number" id="edit-grade"><br>
            """),_display_(/*37.14*/helper/*37.20*/.CSRF.formField),format.raw/*37.35*/("""
        """),format.raw/*38.9*/("""</form>
        <span id="edit_button-field"></span>
    </div>

    <div id="chart-area2">
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
                  DATE: Thu Dec 20 23:06:44 JST 2018
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/grades/grades.scala.html
                  HASH: 117fba3aae6e5db26996d96d34c4d5650b91a97e
                  MATRIX: 1046->1|1064->11|1103->13|1130->14|1990->847|2005->853|2041->868|2082->881|2489->1261|2504->1267|2540->1282|2576->1291
                  LINES: 33->1|33->1|33->1|34->2|57->25|57->25|57->25|58->26|69->37|69->37|69->37|70->38
                  -- GENERATED --
              */
          
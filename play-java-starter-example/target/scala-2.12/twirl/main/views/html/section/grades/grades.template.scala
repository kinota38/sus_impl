
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
    """),format.raw/*2.5*/("""<div class="addgrade">
        <span></span><span></span>
    </div>
    <div>
        <canvas id="myChart"></canvas>
    </div>

<div class="layer" id="register-layer"></div>
<div class="popup" id="register-popup">
    <div>popup</div>
    <form id="register-form">
        科目名:<input type="text" class="register-input" name="register-subject"><br>
        目標:<input type="text" class="register-input" name="register-target"><br>
        現在:<input type="text" class="register-input" name="register-now"><br>
        """),_display_(/*16.10*/helper/*16.16*/.CSRF.formField),format.raw/*16.31*/("""
    """),format.raw/*17.5*/("""</form>
    <button  onclick="register(); return false;">追加</button>

</div>

<div class ="layer" id="edit-layer"></div>
<div class="popup" id="edit-popup">
    <div>popup</div>
    <form id="edit-form">
        <span id="input-type"></span>:<input type="text" name="new-grade" class="input-number" id="edit-grade"><br>
        """),_display_(/*27.10*/helper/*27.16*/.CSRF.formField),format.raw/*27.31*/("""
    """),format.raw/*28.5*/("""</form>
    <span id="edit_button-field"></span>
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
                  DATE: Tue Dec 18 00:21:13 JST 2018
                  SOURCE: /Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/app/views/section/grades/grades.scala.html
                  HASH: 8234edfe1cb553d575e013931a6e2b5762c063ba
                  MATRIX: 1046->1|1064->11|1103->13|1134->18|1679->536|1694->542|1730->557|1762->562|2118->891|2133->897|2169->912|2201->917
                  LINES: 33->1|33->1|33->1|34->2|48->16|48->16|48->16|49->17|59->27|59->27|59->27|60->28
                  -- GENERATED --
              */
          

package views.html.section

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

object section extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Welcome to Play")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""
    """),format.raw/*2.5*/("""<div class="services">
        <h1>Our Services</h1>
        <div class="cen">
            <a class="fixed" href="/grades">
            <div class="service">
                <i class="far fa-calendar-alt"></i>
                <h2>Calendar</h2>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
            </div>
            </a>

            <a class="fixed" href="/grades">
            <div class="service">
                <i class="fas fa-user-graduate"></i>
                <h2>grades</h2>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
            </div>
            </a>

            <div class="service">
                <i class="fab fa-android"></i>
                <h2>Service Name</h2>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
            </div>

            <div class="service">
                <i class="fab fa-apple-pay"></i>
                <h2>Service Name</h2>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
            </div>

            <div class="service">
                <i class="fas fa-taxi"></i>
                <h2>Service Name</h2>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
            </div>

            <div class="service">
                <i class="fab fa-youtube"></i>
                <h2>Service Name</h2>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. </p>
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
                  DATE: Fri Dec 07 12:26:36 JST 2018
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/section/section.scala.html
                  HASH: 50d10504393eac830bf6ac42c8ef1f723c5737ba
                  MATRIX: 1040->1|1071->24|1110->26|1141->31
                  LINES: 33->1|33->1|33->1|34->2
                  -- GENERATED --
              */
          
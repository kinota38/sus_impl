
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

object section extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Mypage")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
    """),format.raw/*4.5*/("""<div class="header">
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
        <div class="services">
            <h1>"""),_display_(/*19.18*/name),format.raw/*19.22*/("""</h1>
            <div class="cen">
                <a class="fixed" href="/calendar">
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
                <a class="fixed" href="/todoApplication">
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
                  DATE: Sun Jan 13 11:40:20 JST 2019
                  SOURCE: /Users/daikichi/Desktop/sus_impl2/play-java-starter-example/app/views/section/section.scala.html
                  HASH: d9b4d7f2b4d0dceb8c26dddc9fbc65b57e6c529b
                  MATRIX: 958->1|1066->16|1093->18|1115->32|1154->34|1185->39|1667->494|1692->498
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|50->19|50->19
                  -- GENERATED --
              */
          
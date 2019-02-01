
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
"""),_display_(/*3.2*/main("さあ、始めよう")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="/helper/"""),_display_(/*6.52*/name),format.raw/*6.56*/("""" style="font-style: oblique; font-family: 'Arial Black', sans-serif;">
                <i class="fas fa-braille"></i>
                    Study Helper
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="/helper/"""),_display_(/*17.60*/name),format.raw/*17.64*/("""">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">リンク</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            アプリ
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="/calendar/month">カレンダー</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/grades/"""),_display_(/*29.69*/name),format.raw/*29.73*/("""">成績</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/chat/"""),_display_(/*31.67*/name),format.raw/*31.71*/("""">掲示板</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/todoApplication">TO DO リスト</a>
                        </div>
                    </li>
                </ul>
                <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-user" data-toggle="tooltip" data-html="true" title="Study Helper アカウント<br>"""),_display_(/*41.125*/name),format.raw/*41.129*/(""" """),format.raw/*41.130*/("""さん"></i>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item disabled" href="#"><i class="fas fa-wrench"></i>&nbsp;アカウント管理</a>
                                <a class="dropdown-item disabled" href="#"><i class="fas fa-question"></i>&nbsp;Another action</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="/logout"><i class="fas fa-sign-out-alt"></i>&nbsp;ログアウト</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <br>
    <br>
    <br>
    <br>
    <br>
    <h2 class="start-text" style="text-align: center">さあ、始めよう！</h2>
    <br>
    <br>
    <br>
    <br>
    <br>
    <div class="demo">
        <div class="container">
            <div class="row">

                <div class="col-md-3">
                    <div class="servicebox">
                        <div class="service-icon">
                            <i class="far fa-calendar-alt"></i>
                        </div>
                        <h3 class="title">カレンダー</h3>
                        <p class="description">
                            スケージュールを管理して計画的に勉強を進めよう！
                        </p>
                        <a href="/calendar/month" class="read-more">今すぐ始める</a>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="servicebox blue">
                        <div class="service-icon">
                            <i class="fas fa-chart-pie"></i>
                        </div>
                        <h3 class="title">成績</h3>
                        <p class="description">
                            今までの成績を管理し、自分の弱点を見つけよう!
                        </p>
                        <a href="/grades/"""),_display_(/*92.43*/name),format.raw/*92.47*/("""" class="read-more">今すぐ始める</a>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="servicebox yellow">
                        <div class="service-icon">
                            <i class="fas fa-comments"></i>
                        </div>
                        <h3 class="title">掲示板</h3>
                        <p class="description">
                            わからないことがあったら他の人に質問してみよう!
                        </p>
                        <a href="/chat/"""),_display_(/*105.41*/name),format.raw/*105.45*/("""" class="read-more">今すぐ始める</a>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="servicebox green">
                        <div class="service-icon">
                            <i class="fas fa-list-alt"></i>
                        </div>
                        <h3 class="title">TO DO リスト</h3>
                        <p class="description">
                            これから勉強することをまとめて成果を確認しよう!
                        </p>
                        <a href="/todoApplication" class="read-more">今すぐ始める</a>
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
                  DATE: Fri Feb 01 10:53:23 JST 2019
                  SOURCE: /cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/app/views/section/section.scala.html
                  HASH: b5ab2ae2fbe38bfdc5a6e31ecdfce8fa496e1da4
                  MATRIX: 958->1|1066->16|1093->18|1116->33|1155->35|1186->40|1338->166|1362->170|2085->866|2110->870|2937->1670|2962->1674|3129->1814|3154->1818|3927->2563|3953->2567|3983->2568|6009->4567|6034->4571|6598->5107|6624->5111
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|48->17|48->17|60->29|60->29|62->31|62->31|72->41|72->41|72->41|123->92|123->92|136->105|136->105
                  -- GENERATED --
              */
          
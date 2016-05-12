
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String,inputData:Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""

"""),_display_(Seq[Any](/*3.2*/main("Sample Page")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  <h1>"""),_display_(Seq[Any](/*4.8*/msg)),format.raw/*4.11*/("""</h1>
	"""),_display_(Seq[Any](/*5.3*/helper/*5.9*/.form(action = routes.Application.editcreate)/*5.54*/ {_display_(Seq[Any](format.raw/*5.56*/("""
		"""),_display_(Seq[Any](/*6.4*/(helper.inputText(inputData("id"))))),format.raw/*6.39*/("""
		"""),_display_(Seq[Any](/*7.4*/(helper.inputText(inputData("name"))))),format.raw/*7.41*/("""
		"""),_display_(Seq[Any](/*8.4*/(helper.inputText(inputData("mail"))))),format.raw/*8.41*/("""
		"""),_display_(Seq[Any](/*9.4*/(helper.textarea(inputData("message"),'cols->50)))),format.raw/*9.53*/("""
		<input type = "submit">
	""")))})),format.raw/*11.3*/("""
""")))})))}
    }
    
    def render(msg:String,inputData:Form[Message]): play.api.templates.HtmlFormat.Appendable = apply(msg,inputData)
    
    def f:((String,Form[Message]) => play.api.templates.HtmlFormat.Appendable) = (msg,inputData) => apply(msg,inputData)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 12 13:15:10 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DatabaseApp/app/views/edit.scala.html
                    HASH: b28d3926803ffb623486375bd27f140fa883ad68
                    MATRIX: 787->1|918->38|955->41|982->60|1021->62|1063->70|1087->73|1129->81|1142->87|1195->132|1234->134|1272->138|1328->173|1366->177|1424->214|1462->218|1520->255|1558->259|1628->308|1688->337
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|33->5|33->5|33->5|33->5|34->6|34->6|35->7|35->7|36->8|36->8|37->9|37->9|39->11
                    -- GENERATED --
                */
            
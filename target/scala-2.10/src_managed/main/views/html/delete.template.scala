
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
object delete extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String, inputData:Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.40*/("""
"""),_display_(Seq[Any](/*2.2*/main("Sample Page")/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""

	<h1>Hello</h1>
	"""),_display_(Seq[Any](/*5.3*/helper/*5.9*/.form(action = routes.Application.deletecreate)/*5.56*/ {_display_(Seq[Any](format.raw/*5.58*/("""
	<input type="hidden" value = """),_display_(Seq[Any](/*6.32*/inputData/*6.41*/.name)),format.raw/*6.46*/(""" name="name">
	"""),_display_(Seq[Any](/*7.3*/(helper.inputText(inputData("id"))))),format.raw/*7.38*/("""
	<input type = "submit">
	""")))})),format.raw/*9.3*/("""
""")))})))}
    }
    
    def render(msg:String,inputData:Form[Message]): play.api.templates.HtmlFormat.Appendable = apply(msg,inputData)
    
    def f:((String,Form[Message]) => play.api.templates.HtmlFormat.Appendable) = (msg,inputData) => apply(msg,inputData)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 12 13:34:45 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DatabaseApp/app/views/delete.scala.html
                    HASH: 22601ba0db44c0b563ac959a7d1c32e33cdab628
                    MATRIX: 789->1|921->39|957->41|984->60|1023->62|1077->82|1090->88|1145->135|1184->137|1251->169|1268->178|1294->183|1344->199|1400->234|1458->262
                    LINES: 26->1|29->1|30->2|30->2|30->2|33->5|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|37->9
                    -- GENERATED --
                */
            

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
object find extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String, inputData:Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.40*/("""

"""),_display_(Seq[Any](/*3.2*/main("Sample Page")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

	<h1>Hello</h1>
	"""),_display_(Seq[Any](/*6.3*/helper/*6.9*/.form(action = routes.Application.findcreate)/*6.54*/ {_display_(Seq[Any](format.raw/*6.56*/("""
	"""),_display_(Seq[Any](/*7.3*/(helper.inputText(inputData("name"))))),format.raw/*7.40*/("""
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
                    DATE: Thu May 12 14:38:07 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DatabaseApp/app/views/find.scala.html
                    HASH: 0c8ec0456d80f1bf97646b2f56afb1bd920e8dca
                    MATRIX: 787->1|919->39|956->42|983->61|1022->63|1076->83|1089->89|1142->134|1181->136|1218->139|1276->176|1334->204
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|34->6|35->7|35->7|37->9
                    -- GENERATED --
                */
            
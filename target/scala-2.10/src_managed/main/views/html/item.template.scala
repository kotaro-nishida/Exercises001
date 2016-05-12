
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
object item extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String, inputData:Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.40*/("""

"""),_display_(Seq[Any](/*3.2*/main("Sample Page")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

	<h1>"""),_display_(Seq[Any](/*5.7*/msg)),format.raw/*5.10*/("""</h1>
	"""),_display_(Seq[Any](/*6.3*/helper/*6.9*/.form(action = routes.Application.edit)/*6.48*/ {_display_(Seq[Any](format.raw/*6.50*/("""
	<input type="hidden" value = """),_display_(Seq[Any](/*7.32*/inputData/*7.41*/.name)),format.raw/*7.46*/(""" name="name">
	"""),_display_(Seq[Any](/*8.3*/(helper.inputText(inputData("id"))))),format.raw/*8.38*/("""
	<input type = "submit">
	""")))})),format.raw/*10.3*/("""

""")))})))}
    }
    
    def render(msg:String,inputData:Form[Message]): play.api.templates.HtmlFormat.Appendable = apply(msg,inputData)
    
    def f:((String,Form[Message]) => play.api.templates.HtmlFormat.Appendable) = (msg,inputData) => apply(msg,inputData)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 12 11:35:28 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DatabaseApp/app/views/item.scala.html
                    HASH: 9552adf30a3b8fb9d6e0b0ee84f85507ea79fa83
                    MATRIX: 787->1|919->39|956->42|983->61|1022->63|1064->71|1088->74|1130->82|1143->88|1190->127|1229->129|1296->161|1313->170|1339->175|1389->191|1445->226|1504->254
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|38->10
                    -- GENERATED --
                */
            
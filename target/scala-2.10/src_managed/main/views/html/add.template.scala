
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
object add extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String,inputData:Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""

"""),_display_(Seq[Any](/*3.2*/main("Sample Page")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

  <h1>"""),_display_(Seq[Any](/*5.8*/msg)),format.raw/*5.11*/("""</h1>
	"""),_display_(Seq[Any](/*6.3*/helper/*6.9*/.form(action = routes.Application.addcreate)/*6.53*/ {_display_(Seq[Any](format.raw/*6.55*/("""
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
                    DATE: Wed May 11 19:36:15 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DatabaseApp/app/views/add.scala.html
                    HASH: 8761457721e631ecd3ea3cdb079e1b7ab74e6226
                    MATRIX: 786->1|917->38|954->41|981->60|1020->62|1063->71|1087->74|1129->82|1142->88|1194->132|1233->134|1271->138|1329->175|1367->179|1425->216|1463->220|1533->269|1593->298
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|34->6|34->6|34->6|35->7|35->7|36->8|36->8|37->9|37->9|39->11
                    -- GENERATED --
                */
            
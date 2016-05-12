
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String,datas: List[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""

"""),_display_(Seq[Any](/*3.2*/main("Sample Page")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

	<h1>"""),_display_(Seq[Any](/*5.7*/msg)),format.raw/*5.10*/("""</h1>
	<pre>"""),_display_(Seq[Any](/*6.8*/datas)),format.raw/*6.13*/("""</pre>
""")))})))}
    }
    
    def render(msg:String,datas:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(msg,datas)
    
    def f:((String,List[Message]) => play.api.templates.HtmlFormat.Appendable) = (msg,datas) => apply(msg,datas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 11 18:49:33 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DatabaseApp/app/views/index.scala.html
                    HASH: 733f57665b38d6d248980610d45c221dfbce151c
                    MATRIX: 788->1|916->35|953->38|980->57|1019->59|1061->67|1085->70|1132->83|1158->88
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|34->6
                    -- GENERATED --
                */
            
// @SOURCE:/Users/koutaroh.nishida/DatabaseApp/conf/routes
// @HASH:d3961cc9e31cfda84651891fa35fef90440ae1c3
// @DATE:Thu May 12 14:17:36 JST 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:7
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_add1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add"))))
        

// @LINE:10
private[this] lazy val controllers_Application_addcreate2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addcreate"))))
        

// @LINE:12
private[this] lazy val controllers_Application_setItem3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("item"))))
        

// @LINE:14
private[this] lazy val controllers_Application_edit4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit"))))
        

// @LINE:15
private[this] lazy val controllers_Application_editcreate5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editcreate"))))
        

// @LINE:17
private[this] lazy val controllers_Application_delete6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete"))))
        

// @LINE:18
private[this] lazy val controllers_Application_deletecreate7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletecreate"))))
        

// @LINE:20
private[this] lazy val controllers_Application_find8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("find"))))
        

// @LINE:21
private[this] lazy val controllers_Application_findcreate9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("findcreate"))))
        

// @LINE:24
private[this] lazy val controllers_Assets_at10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add""","""controllers.Application.add()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addcreate""","""controllers.Application.addcreate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """item""","""controllers.Application.setItem()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit""","""controllers.Application.edit()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editcreate""","""controllers.Application.editcreate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete""","""controllers.Application.delete()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletecreate""","""controllers.Application.deletecreate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """find""","""controllers.Application.find()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """findcreate""","""controllers.Application.findcreate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:7
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page
ホーム画面（DBデータ全件表示）""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_add1(params) => {
   call { 
        invokeHandler(controllers.Application.add(), HandlerDef(this, "controllers.Application", "add", Nil,"GET", """新規メッセージ作成画面""", Routes.prefix + """add"""))
   }
}
        

// @LINE:10
case controllers_Application_addcreate2(params) => {
   call { 
        invokeHandler(controllers.Application.addcreate(), HandlerDef(this, "controllers.Application", "addcreate", Nil,"GET", """""", Routes.prefix + """addcreate"""))
   }
}
        

// @LINE:12
case controllers_Application_setItem3(params) => {
   call { 
        invokeHandler(controllers.Application.setItem(), HandlerDef(this, "controllers.Application", "setItem", Nil,"GET", """投稿メッセージID検索画面""", Routes.prefix + """item"""))
   }
}
        

// @LINE:14
case controllers_Application_edit4(params) => {
   call { 
        invokeHandler(controllers.Application.edit(), HandlerDef(this, "controllers.Application", "edit", Nil,"POST", """投稿メッセージ編集画面""", Routes.prefix + """edit"""))
   }
}
        

// @LINE:15
case controllers_Application_editcreate5(params) => {
   call { 
        invokeHandler(controllers.Application.editcreate(), HandlerDef(this, "controllers.Application", "editcreate", Nil,"POST", """""", Routes.prefix + """editcreate"""))
   }
}
        

// @LINE:17
case controllers_Application_delete6(params) => {
   call { 
        invokeHandler(controllers.Application.delete(), HandlerDef(this, "controllers.Application", "delete", Nil,"GET", """削除データ指定画面""", Routes.prefix + """delete"""))
   }
}
        

// @LINE:18
case controllers_Application_deletecreate7(params) => {
   call { 
        invokeHandler(controllers.Application.deletecreate(), HandlerDef(this, "controllers.Application", "deletecreate", Nil,"POST", """""", Routes.prefix + """deletecreate"""))
   }
}
        

// @LINE:20
case controllers_Application_find8(params) => {
   call { 
        invokeHandler(controllers.Application.find(), HandlerDef(this, "controllers.Application", "find", Nil,"GET", """投稿者検索画面（名前で検索）""", Routes.prefix + """find"""))
   }
}
        

// @LINE:21
case controllers_Application_findcreate9(params) => {
   call { 
        invokeHandler(controllers.Application.findcreate(), HandlerDef(this, "controllers.Application", "findcreate", Nil,"POST", """""", Routes.prefix + """findcreate"""))
   }
}
        

// @LINE:24
case controllers_Assets_at10(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     
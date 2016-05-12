// @SOURCE:/Users/koutaroh.nishida/DatabaseApp/conf/routes
// @HASH:d3961cc9e31cfda84651891fa35fef90440ae1c3
// @DATE:Thu May 12 14:17:36 JST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:7
package controllers {

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:7
class ReverseApplication {
    

// @LINE:15
def editcreate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "editcreate")
}
                                                

// @LINE:17
def delete(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "delete")
}
                                                

// @LINE:14
def edit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "edit")
}
                                                

// @LINE:10
def addcreate(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "addcreate")
}
                                                

// @LINE:20
def find(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "find")
}
                                                

// @LINE:9
def add(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "add")
}
                                                

// @LINE:18
def deletecreate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "deletecreate")
}
                                                

// @LINE:21
def findcreate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "findcreate")
}
                                                

// @LINE:7
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:12
def setItem(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "item")
}
                                                
    
}
                          
}
                  


// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:7
package controllers.javascript {

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:7
class ReverseApplication {
    

// @LINE:15
def editcreate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editcreate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editcreate"})
      }
   """
)
                        

// @LINE:17
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.delete",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete"})
      }
   """
)
                        

// @LINE:14
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edit"})
      }
   """
)
                        

// @LINE:10
def addcreate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addcreate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcreate"})
      }
   """
)
                        

// @LINE:20
def find : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.find",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "find"})
      }
   """
)
                        

// @LINE:9
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.add",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
      }
   """
)
                        

// @LINE:18
def deletecreate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deletecreate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletecreate"})
      }
   """
)
                        

// @LINE:21
def findcreate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.findcreate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "findcreate"})
      }
   """
)
                        

// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:12
def setItem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.setItem",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "item"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:7
package controllers.ref {


// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:7
class ReverseApplication {
    

// @LINE:15
def editcreate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editcreate(), HandlerDef(this, "controllers.Application", "editcreate", Seq(), "POST", """""", _prefix + """editcreate""")
)
                      

// @LINE:17
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.delete(), HandlerDef(this, "controllers.Application", "delete", Seq(), "GET", """削除データ指定画面""", _prefix + """delete""")
)
                      

// @LINE:14
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.edit(), HandlerDef(this, "controllers.Application", "edit", Seq(), "POST", """投稿メッセージ編集画面""", _prefix + """edit""")
)
                      

// @LINE:10
def addcreate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addcreate(), HandlerDef(this, "controllers.Application", "addcreate", Seq(), "GET", """""", _prefix + """addcreate""")
)
                      

// @LINE:20
def find(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.find(), HandlerDef(this, "controllers.Application", "find", Seq(), "GET", """投稿者検索画面（名前で検索）""", _prefix + """find""")
)
                      

// @LINE:9
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.add(), HandlerDef(this, "controllers.Application", "add", Seq(), "GET", """新規メッセージ作成画面""", _prefix + """add""")
)
                      

// @LINE:18
def deletecreate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deletecreate(), HandlerDef(this, "controllers.Application", "deletecreate", Seq(), "POST", """""", _prefix + """deletecreate""")
)
                      

// @LINE:21
def findcreate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.findcreate(), HandlerDef(this, "controllers.Application", "findcreate", Seq(), "POST", """""", _prefix + """findcreate""")
)
                      

// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page
ホーム画面（DBデータ全件表示）""", _prefix + """""")
)
                      

// @LINE:12
def setItem(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.setItem(), HandlerDef(this, "controllers.Application", "setItem", Seq(), "GET", """投稿メッセージID検索画面""", _prefix + """item""")
)
                      
    
}
                          
}
        
    
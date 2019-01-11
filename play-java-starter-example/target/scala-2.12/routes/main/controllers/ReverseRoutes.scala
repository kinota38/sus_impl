// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/conf/routes
// @DATE:Sat Jan 05 13:40:05 JST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:29
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def at(): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "favicon.png"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "favicon.ico")
    }
  
    // @LINE:30
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:19
  class ReverseGradeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def registerAccGrade(username:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "grades/registeracc/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:20
    def gradeList(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "grades/gradelist/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:24
    def editGrade(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "grades/edit")
    }
  
    // @LINE:22
    def registerGrade(username:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "grades/register/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:19
    def gradesList(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "grades/gradeslist/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:25
    def removeGrade(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "grades/remove")
    }
  
    // @LINE:21
    def accGradeList(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "grades/accgradelist/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
  }

  // @LINE:28
  class ReverseDefault(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def notFound(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "robot.txt")
    }
  
  }

  // @LINE:11
  class ReverseMainController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def mypageForm(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "helper/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:16
    def calendar(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calendar")
    }
  
    // @LINE:14
    def signOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signout")
    }
  
    // @LINE:15
    def grade(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "grades/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
  }

  // @LINE:6
  class ReverseSignUpandInController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def helperTop(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def registerUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signup/register")
    }
  
    // @LINE:9
    def signinForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signin")
    }
  
    // @LINE:7
    def userList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "database/users")
    }
  
    // @LINE:10
    def signIn(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signin")
    }
  
  }


}

// @GENERATOR:play-routes-compiler
// @SOURCE:/cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/conf/routes
// @DATE:Fri Jan 11 11:50:40 JST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseSignUpandInController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def helperTop(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def signupForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:9
    def registerUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signup/register")
    }
  
    // @LINE:10
    def signinForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signin")
    }
  
    // @LINE:8
    def userList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "database/users")
    }
  
    // @LINE:11
    def signIn(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signin")
    }
  
  }

  // @LINE:12
  class ReverseMainController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def grade(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "grades")
    }
  
    // @LINE:12
    def mypageForm(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "helper/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:15
    def signOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signout")
    }
  
    // @LINE:18
    def calendarDay(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calendar/day")
    }
  
    // @LINE:17
    def calendarMonth(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calendar/month")
    }
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def at(): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "favicon.png"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "favicon.ico")
    }
  
    // @LINE:23
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:21
  class ReverseDefault(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def notFound(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "robot.txt")
    }
  
  }


}

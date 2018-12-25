// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/daikichi/Desktop/sus_impl2/play-java-starter-example/conf/routes
// @DATE:Tue Dec 25 11:31:16 JST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:25
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def at(): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "favicon.png"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "favicon.ico")
    }
  
    // @LINE:26
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:24
  class ReverseDefault(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def notFound(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "robot.txt")
    }
  
  }

  // @LINE:13
  class ReverseMainController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def grade(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "grades")
    }
  
    // @LINE:13
    def mypageForm(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "helper/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:21
    def calendar(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calendar")
    }
  
    // @LINE:19
    def signOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signout")
    }
  
  }

  // @LINE:16
  class ReverseTodoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def todoTop(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todoApplication")
    }
  
  }

  // @LINE:6
  class ReverseSignUpandInController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def helperTop(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:7
    def signupForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:10
    def registerUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signup/register")
    }
  
    // @LINE:11
    def signinForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signin")
    }
  
    // @LINE:9
    def userList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "database/users")
    }
  
    // @LINE:12
    def signIn(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signin")
    }
  
  }


}

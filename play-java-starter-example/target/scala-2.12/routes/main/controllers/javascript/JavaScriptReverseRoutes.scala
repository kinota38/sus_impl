// @GENERATOR:play-routes-compiler
// @SOURCE:/cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/conf/routes
// @DATE:Fri Jan 11 11:50:40 JST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseSignUpandInController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def helperTop: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.helperTop",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def signupForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.signupForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:9
    def registerUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.registerUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/register"})
        }
      """
    )
  
    // @LINE:10
    def signinForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.signinForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
    // @LINE:8
    def userList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.userList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "database/users"})
        }
      """
    )
  
    // @LINE:11
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.signIn",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseMainController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def grade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.grade",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grades"})
        }
      """
    )
  
    // @LINE:12
    def mypageForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.mypageForm",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "helper/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:15
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signout"})
        }
      """
    )
  
    // @LINE:18
    def calendarDay: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.calendarDay",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calendar/day"})
        }
      """
    )
  
    // @LINE:17
    def calendarMonth: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.calendarMonth",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calendar/month"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "favicon.ico"})
        }
      """
    )
  
    // @LINE:23
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseDefault(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def notFound: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Default.notFound",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "robot.txt"})
        }
      """
    )
  
  }


}

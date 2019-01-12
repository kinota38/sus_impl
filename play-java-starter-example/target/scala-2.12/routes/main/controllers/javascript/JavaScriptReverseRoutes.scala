// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/conf/routes
// @DATE:Sat Jan 12 12:32:28 JST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:31
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "favicon.ico"})
        }
      """
    )
  
    // @LINE:32
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
  class ReverseGradeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def registerAccGrade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GradeController.registerAccGrade",
      """
        function(username0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "grades/registeracc/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:22
    def gradeList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GradeController.gradeList",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grades/gradelist/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:26
    def editGrade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GradeController.editGrade",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "grades/edit"})
        }
      """
    )
  
    // @LINE:24
    def registerGrade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GradeController.registerGrade",
      """
        function(username0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "grades/register/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:21
    def gradesList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GradeController.gradesList",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grades/gradeslist/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:27
    def removeGrade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GradeController.removeGrade",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "grades/remove"})
        }
      """
    )
  
    // @LINE:23
    def accGradeList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GradeController.accGradeList",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grades/accgradelist/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseDefault(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def notFound: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Default.notFound",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "robot.txt"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseMainController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def mypageForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.mypageForm",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "helper/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:14
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signout"})
        }
      """
    )
  
    // @LINE:17
    def calendarDay: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.calendarDay",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calendar/day"})
        }
      """
    )
  
    // @LINE:15
    def grade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.grade",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grades/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:16
    def calendarMonth: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.calendarMonth",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calendar/month"})
        }
      """
    )
  
  }

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
  
    // @LINE:8
    def registerUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.registerUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/register"})
        }
      """
    )
  
    // @LINE:9
    def signinForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.signinForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
    // @LINE:7
    def userList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.userList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "database/users"})
        }
      """
    )
  
    // @LINE:10
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.signIn",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
  }


}

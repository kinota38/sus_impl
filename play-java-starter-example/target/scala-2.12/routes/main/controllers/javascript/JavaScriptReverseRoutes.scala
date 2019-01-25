// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/daikichi/Desktop/sus_impl2/play-java-starter-example/conf/routes
// @DATE:Fri Jan 25 06:45:12 JST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:29
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "favicon.ico"})
        }
      """
    )
  
    // @LINE:30
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseDefault(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def notFound: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Default.notFound",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "robot.txt"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseMainController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def grade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.grade",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grades"})
        }
      """
    )
  
    // @LINE:13
    def mypageForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.mypageForm",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "helper/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:25
    def calendar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.calendar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calendar"})
        }
      """
    )
  
    // @LINE:23
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signout"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseTodoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def analyzeList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.analyzeList",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "database/analyze"})
        }
      """
    )
  
    // @LINE:15
    def todoApplication: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.todoApplication",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todoApplication"})
        }
      """
    )
  
    // @LINE:19
    def taskDone: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.taskDone",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todoApplication/taskdone"})
        }
      """
    )
  
    // @LINE:17
    def taskList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.taskList",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "database/task"})
        }
      """
    )
  
    // @LINE:20
    def taskDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.taskDelete",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todoApplication/taskdelete"})
        }
      """
    )
  
    // @LINE:16
    def newTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.newTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todoApplication/newtask"})
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
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
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
  
    // @LINE:10
    def registerUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.registerUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/register"})
        }
      """
    )
  
    // @LINE:11
    def signinForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.signinForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
    // @LINE:9
    def userList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpandInController.userList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "database/users"})
        }
      """
    )
  
    // @LINE:12
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

// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/daikichi/Desktop/sus_impl2/play-java-starter-example/conf/routes
// @DATE:Fri Jan 25 06:45:12 JST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  SignUpandInController_0: controllers.SignUpandInController,
  // @LINE:13
  MainController_1: controllers.MainController,
  // @LINE:15
  TodoController_2: controllers.TodoController,
  // @LINE:28
  Default_3: controllers.Default,
  // @LINE:29
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    SignUpandInController_0: controllers.SignUpandInController,
    // @LINE:13
    MainController_1: controllers.MainController,
    // @LINE:15
    TodoController_2: controllers.TodoController,
    // @LINE:28
    Default_3: controllers.Default,
    // @LINE:29
    Assets_4: controllers.Assets
  ) = this(errorHandler, SignUpandInController_0, MainController_1, TodoController_2, Default_3, Assets_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, SignUpandInController_0, MainController_1, TodoController_2, Default_3, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.SignUpandInController.helperTop"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.SignUpandInController.signupForm"""),
    ("""GET""", this.prefix, """controllers.SignUpandInController.helperTop"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """database/users""", """controllers.SignUpandInController.userList"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup/register""", """controllers.SignUpandInController.registerUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.SignUpandInController.signinForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.SignUpandInController.signIn"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """helper/""" + "$" + """username<[^/]+>""", """controllers.MainController.mypageForm(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todoApplication""", """controllers.TodoController.todoApplication"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todoApplication/newtask""", """controllers.TodoController.newTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """database/task""", """controllers.TodoController.taskList"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """database/analyze""", """controllers.TodoController.analyzeList"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todoApplication/taskdone""", """controllers.TodoController.taskDone"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todoApplication/taskdelete""", """controllers.TodoController.taskDelete"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signout""", """controllers.MainController.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grades""", """controllers.MainController.grade"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calendar""", """controllers.MainController.calendar"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """robot.txt""", """controllers.Default.notFound"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """favicon.ico""", """controllers.Assets.at(path:String = "/public/images", file:String = "favicon.png")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_SignUpandInController_helperTop0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_SignUpandInController_helperTop0_invoker = createInvoker(
    SignUpandInController_0.helperTop,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpandInController",
      "helperTop",
      Nil,
      "GET",
      this.prefix + """""",
      """ signup and signin controller""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_SignUpandInController_signupForm1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_SignUpandInController_signupForm1_invoker = createInvoker(
    SignUpandInController_0.signupForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpandInController",
      "signupForm",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_SignUpandInController_helperTop2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_SignUpandInController_helperTop2_invoker = createInvoker(
    SignUpandInController_0.helperTop,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpandInController",
      "helperTop",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_SignUpandInController_userList3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("database/users")))
  )
  private[this] lazy val controllers_SignUpandInController_userList3_invoker = createInvoker(
    SignUpandInController_0.userList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpandInController",
      "userList",
      Nil,
      "GET",
      this.prefix + """database/users""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_SignUpandInController_registerUser4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup/register")))
  )
  private[this] lazy val controllers_SignUpandInController_registerUser4_invoker = createInvoker(
    SignUpandInController_0.registerUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpandInController",
      "registerUser",
      Nil,
      "POST",
      this.prefix + """signup/register""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_SignUpandInController_signinForm5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_SignUpandInController_signinForm5_invoker = createInvoker(
    SignUpandInController_0.signinForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpandInController",
      "signinForm",
      Nil,
      "GET",
      this.prefix + """signin""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_SignUpandInController_signIn6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_SignUpandInController_signIn6_invoker = createInvoker(
    SignUpandInController_0.signIn,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpandInController",
      "signIn",
      Nil,
      "POST",
      this.prefix + """signin""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_MainController_mypageForm7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("helper/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MainController_mypageForm7_invoker = createInvoker(
    MainController_1.mypageForm(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "mypageForm",
      Seq(classOf[String]),
      "GET",
      this.prefix + """helper/""" + "$" + """username<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_TodoController_todoApplication8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todoApplication")))
  )
  private[this] lazy val controllers_TodoController_todoApplication8_invoker = createInvoker(
    TodoController_2.todoApplication,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "todoApplication",
      Nil,
      "GET",
      this.prefix + """todoApplication""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_TodoController_newTask9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todoApplication/newtask")))
  )
  private[this] lazy val controllers_TodoController_newTask9_invoker = createInvoker(
    TodoController_2.newTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "newTask",
      Nil,
      "POST",
      this.prefix + """todoApplication/newtask""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_TodoController_taskList10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("database/task")))
  )
  private[this] lazy val controllers_TodoController_taskList10_invoker = createInvoker(
    TodoController_2.taskList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "taskList",
      Nil,
      "POST",
      this.prefix + """database/task""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_TodoController_analyzeList11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("database/analyze")))
  )
  private[this] lazy val controllers_TodoController_analyzeList11_invoker = createInvoker(
    TodoController_2.analyzeList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "analyzeList",
      Nil,
      "POST",
      this.prefix + """database/analyze""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_TodoController_taskDone12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todoApplication/taskdone")))
  )
  private[this] lazy val controllers_TodoController_taskDone12_invoker = createInvoker(
    TodoController_2.taskDone,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "taskDone",
      Nil,
      "POST",
      this.prefix + """todoApplication/taskdone""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_TodoController_taskDelete13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todoApplication/taskdelete")))
  )
  private[this] lazy val controllers_TodoController_taskDelete13_invoker = createInvoker(
    TodoController_2.taskDelete,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "taskDelete",
      Nil,
      "POST",
      this.prefix + """todoApplication/taskdelete""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_MainController_signOut14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signout")))
  )
  private[this] lazy val controllers_MainController_signOut14_invoker = createInvoker(
    MainController_1.signOut,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "signOut",
      Nil,
      "GET",
      this.prefix + """signout""",
      """ mypage controller""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_MainController_grade15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grades")))
  )
  private[this] lazy val controllers_MainController_grade15_invoker = createInvoker(
    MainController_1.grade,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "grade",
      Nil,
      "GET",
      this.prefix + """grades""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_MainController_calendar16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calendar")))
  )
  private[this] lazy val controllers_MainController_calendar16_invoker = createInvoker(
    MainController_1.calendar,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "calendar",
      Nil,
      "GET",
      this.prefix + """calendar""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Default_notFound17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("robot.txt")))
  )
  private[this] lazy val controllers_Default_notFound17_invoker = createInvoker(
    Default_3.notFound,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Default",
      "notFound",
      Nil,
      "GET",
      this.prefix + """robot.txt""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_at18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("favicon.ico")))
  )
  private[this] lazy val controllers_Assets_at18_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """favicon.ico""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_versioned19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned19_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_SignUpandInController_helperTop0_route(params@_) =>
      call { 
        controllers_SignUpandInController_helperTop0_invoker.call(SignUpandInController_0.helperTop)
      }
  
    // @LINE:7
    case controllers_SignUpandInController_signupForm1_route(params@_) =>
      call { 
        controllers_SignUpandInController_signupForm1_invoker.call(SignUpandInController_0.signupForm)
      }
  
    // @LINE:8
    case controllers_SignUpandInController_helperTop2_route(params@_) =>
      call { 
        controllers_SignUpandInController_helperTop2_invoker.call(SignUpandInController_0.helperTop)
      }
  
    // @LINE:9
    case controllers_SignUpandInController_userList3_route(params@_) =>
      call { 
        controllers_SignUpandInController_userList3_invoker.call(SignUpandInController_0.userList)
      }
  
    // @LINE:10
    case controllers_SignUpandInController_registerUser4_route(params@_) =>
      call { 
        controllers_SignUpandInController_registerUser4_invoker.call(SignUpandInController_0.registerUser)
      }
  
    // @LINE:11
    case controllers_SignUpandInController_signinForm5_route(params@_) =>
      call { 
        controllers_SignUpandInController_signinForm5_invoker.call(SignUpandInController_0.signinForm)
      }
  
    // @LINE:12
    case controllers_SignUpandInController_signIn6_route(params@_) =>
      call { 
        controllers_SignUpandInController_signIn6_invoker.call(SignUpandInController_0.signIn)
      }
  
    // @LINE:13
    case controllers_MainController_mypageForm7_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_MainController_mypageForm7_invoker.call(MainController_1.mypageForm(username))
      }
  
    // @LINE:15
    case controllers_TodoController_todoApplication8_route(params@_) =>
      call { 
        controllers_TodoController_todoApplication8_invoker.call(TodoController_2.todoApplication)
      }
  
    // @LINE:16
    case controllers_TodoController_newTask9_route(params@_) =>
      call { 
        controllers_TodoController_newTask9_invoker.call(TodoController_2.newTask)
      }
  
    // @LINE:17
    case controllers_TodoController_taskList10_route(params@_) =>
      call { 
        controllers_TodoController_taskList10_invoker.call(TodoController_2.taskList)
      }
  
    // @LINE:18
    case controllers_TodoController_analyzeList11_route(params@_) =>
      call { 
        controllers_TodoController_analyzeList11_invoker.call(TodoController_2.analyzeList)
      }
  
    // @LINE:19
    case controllers_TodoController_taskDone12_route(params@_) =>
      call { 
        controllers_TodoController_taskDone12_invoker.call(TodoController_2.taskDone)
      }
  
    // @LINE:20
    case controllers_TodoController_taskDelete13_route(params@_) =>
      call { 
        controllers_TodoController_taskDelete13_invoker.call(TodoController_2.taskDelete)
      }
  
    // @LINE:23
    case controllers_MainController_signOut14_route(params@_) =>
      call { 
        controllers_MainController_signOut14_invoker.call(MainController_1.signOut)
      }
  
    // @LINE:24
    case controllers_MainController_grade15_route(params@_) =>
      call { 
        controllers_MainController_grade15_invoker.call(MainController_1.grade)
      }
  
    // @LINE:25
    case controllers_MainController_calendar16_route(params@_) =>
      call { 
        controllers_MainController_calendar16_invoker.call(MainController_1.calendar)
      }
  
    // @LINE:28
    case controllers_Default_notFound17_route(params@_) =>
      call { 
        controllers_Default_notFound17_invoker.call(Default_3.notFound)
      }
  
    // @LINE:29
    case controllers_Assets_at18_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("favicon.png"))) { (path, file) =>
        controllers_Assets_at18_invoker.call(Assets_4.at(path, file))
      }
  
    // @LINE:30
    case controllers_Assets_versioned19_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned19_invoker.call(Assets_4.versioned(path, file))
      }
  }
}

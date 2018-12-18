// @GENERATOR:play-routes-compiler
// @SOURCE:/cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/conf/routes
// @DATE:Fri Dec 14 12:23:20 JST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  SignUpandInController_1: controllers.SignUpandInController,
  // @LINE:13
  MainController_0: controllers.MainController,
  // @LINE:21
  Default_3: controllers.Default,
  // @LINE:22
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    SignUpandInController_1: controllers.SignUpandInController,
    // @LINE:13
    MainController_0: controllers.MainController,
    // @LINE:21
    Default_3: controllers.Default,
    // @LINE:22
    Assets_2: controllers.Assets
  ) = this(errorHandler, SignUpandInController_1, MainController_0, Default_3, Assets_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, SignUpandInController_1, MainController_0, Default_3, Assets_2, prefix)
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
    SignUpandInController_1.helperTop,
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
    SignUpandInController_1.signupForm,
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
    SignUpandInController_1.helperTop,
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
    SignUpandInController_1.userList,
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
    SignUpandInController_1.registerUser,
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
    SignUpandInController_1.signinForm,
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
    SignUpandInController_1.signIn,
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
    MainController_0.mypageForm(fakeValue[String]),
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

  // @LINE:16
  private[this] lazy val controllers_MainController_signOut8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signout")))
  )
  private[this] lazy val controllers_MainController_signOut8_invoker = createInvoker(
    MainController_0.signOut,
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

  // @LINE:17
  private[this] lazy val controllers_MainController_grade9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grades")))
  )
  private[this] lazy val controllers_MainController_grade9_invoker = createInvoker(
    MainController_0.grade,
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

  // @LINE:18
  private[this] lazy val controllers_MainController_calendar10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calendar")))
  )
  private[this] lazy val controllers_MainController_calendar10_invoker = createInvoker(
    MainController_0.calendar,
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

  // @LINE:21
  private[this] lazy val controllers_Default_notFound11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("robot.txt")))
  )
  private[this] lazy val controllers_Default_notFound11_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_Assets_at12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("favicon.ico")))
  )
  private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
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

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_SignUpandInController_helperTop0_invoker.call(SignUpandInController_1.helperTop)
      }
  
    // @LINE:7
    case controllers_SignUpandInController_signupForm1_route(params@_) =>
      call { 
        controllers_SignUpandInController_signupForm1_invoker.call(SignUpandInController_1.signupForm)
      }
  
    // @LINE:8
    case controllers_SignUpandInController_helperTop2_route(params@_) =>
      call { 
        controllers_SignUpandInController_helperTop2_invoker.call(SignUpandInController_1.helperTop)
      }
  
    // @LINE:9
    case controllers_SignUpandInController_userList3_route(params@_) =>
      call { 
        controllers_SignUpandInController_userList3_invoker.call(SignUpandInController_1.userList)
      }
  
    // @LINE:10
    case controllers_SignUpandInController_registerUser4_route(params@_) =>
      call { 
        controllers_SignUpandInController_registerUser4_invoker.call(SignUpandInController_1.registerUser)
      }
  
    // @LINE:11
    case controllers_SignUpandInController_signinForm5_route(params@_) =>
      call { 
        controllers_SignUpandInController_signinForm5_invoker.call(SignUpandInController_1.signinForm)
      }
  
    // @LINE:12
    case controllers_SignUpandInController_signIn6_route(params@_) =>
      call { 
        controllers_SignUpandInController_signIn6_invoker.call(SignUpandInController_1.signIn)
      }
  
    // @LINE:13
    case controllers_MainController_mypageForm7_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_MainController_mypageForm7_invoker.call(MainController_0.mypageForm(username))
      }
  
    // @LINE:16
    case controllers_MainController_signOut8_route(params@_) =>
      call { 
        controllers_MainController_signOut8_invoker.call(MainController_0.signOut)
      }
  
    // @LINE:17
    case controllers_MainController_grade9_route(params@_) =>
      call { 
        controllers_MainController_grade9_invoker.call(MainController_0.grade)
      }
  
    // @LINE:18
    case controllers_MainController_calendar10_route(params@_) =>
      call { 
        controllers_MainController_calendar10_invoker.call(MainController_0.calendar)
      }
  
    // @LINE:21
    case controllers_Default_notFound11_route(params@_) =>
      call { 
        controllers_Default_notFound11_invoker.call(Default_3.notFound)
      }
  
    // @LINE:22
    case controllers_Assets_at12_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("favicon.png"))) { (path, file) =>
        controllers_Assets_at12_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:23
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_2.versioned(path, file))
      }
  }
}

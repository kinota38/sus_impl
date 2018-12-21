// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/conf/routes
// @DATE:Thu Dec 20 23:31:23 JST 2018

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
  // @LINE:11
  MainController_2: controllers.MainController,
  // @LINE:19
  GradeController_1: controllers.GradeController,
  // @LINE:25
  Default_3: controllers.Default,
  // @LINE:26
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    SignUpandInController_0: controllers.SignUpandInController,
    // @LINE:11
    MainController_2: controllers.MainController,
    // @LINE:19
    GradeController_1: controllers.GradeController,
    // @LINE:25
    Default_3: controllers.Default,
    // @LINE:26
    Assets_4: controllers.Assets
  ) = this(errorHandler, SignUpandInController_0, MainController_2, GradeController_1, Default_3, Assets_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, SignUpandInController_0, MainController_2, GradeController_1, Default_3, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.SignUpandInController.helperTop"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """database/users""", """controllers.SignUpandInController.userList"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup/register""", """controllers.SignUpandInController.registerUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.SignUpandInController.signinForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.SignUpandInController.signIn"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """helper/""" + "$" + """username<[^/]+>""", """controllers.MainController.mypageForm(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signout""", """controllers.MainController.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grades/""" + "$" + """username<[^/]+>""", """controllers.MainController.grade(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calendar""", """controllers.MainController.calendar"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grades/gradeslist/""" + "$" + """username<[^/]+>""", """controllers.GradeController.gradesList(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grades/gradelist/""" + "$" + """username<[^/]+>""", """controllers.GradeController.gradeList(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grade/register""", """controllers.GradeController.registerGrade"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grade/edit""", """controllers.GradeController.editGrade"""),
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
  private[this] lazy val controllers_SignUpandInController_userList1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("database/users")))
  )
  private[this] lazy val controllers_SignUpandInController_userList1_invoker = createInvoker(
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

  // @LINE:8
  private[this] lazy val controllers_SignUpandInController_registerUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup/register")))
  )
  private[this] lazy val controllers_SignUpandInController_registerUser2_invoker = createInvoker(
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

  // @LINE:9
  private[this] lazy val controllers_SignUpandInController_signinForm3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_SignUpandInController_signinForm3_invoker = createInvoker(
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

  // @LINE:10
  private[this] lazy val controllers_SignUpandInController_signIn4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_SignUpandInController_signIn4_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_MainController_mypageForm5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("helper/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MainController_mypageForm5_invoker = createInvoker(
    MainController_2.mypageForm(fakeValue[String]),
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

  // @LINE:14
  private[this] lazy val controllers_MainController_signOut6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signout")))
  )
  private[this] lazy val controllers_MainController_signOut6_invoker = createInvoker(
    MainController_2.signOut,
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

  // @LINE:15
  private[this] lazy val controllers_MainController_grade7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grades/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MainController_grade7_invoker = createInvoker(
    MainController_2.grade(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "grade",
      Seq(classOf[String]),
      "GET",
      this.prefix + """grades/""" + "$" + """username<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_MainController_calendar8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calendar")))
  )
  private[this] lazy val controllers_MainController_calendar8_invoker = createInvoker(
    MainController_2.calendar,
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

  // @LINE:19
  private[this] lazy val controllers_GradeController_gradesList9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grades/gradeslist/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GradeController_gradesList9_invoker = createInvoker(
    GradeController_1.gradesList(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GradeController",
      "gradesList",
      Seq(classOf[String]),
      "GET",
      this.prefix + """grades/gradeslist/""" + "$" + """username<[^/]+>""",
      """ grade controller""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_GradeController_gradeList10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grades/gradelist/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GradeController_gradeList10_invoker = createInvoker(
    GradeController_1.gradeList(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GradeController",
      "gradeList",
      Seq(classOf[String]),
      "GET",
      this.prefix + """grades/gradelist/""" + "$" + """username<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_GradeController_registerGrade11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grade/register")))
  )
  private[this] lazy val controllers_GradeController_registerGrade11_invoker = createInvoker(
    GradeController_1.registerGrade,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GradeController",
      "registerGrade",
      Nil,
      "POST",
      this.prefix + """grade/register""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_GradeController_editGrade12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grade/edit")))
  )
  private[this] lazy val controllers_GradeController_editGrade12_invoker = createInvoker(
    GradeController_1.editGrade,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GradeController",
      "editGrade",
      Nil,
      "POST",
      this.prefix + """grade/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Default_notFound13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("robot.txt")))
  )
  private[this] lazy val controllers_Default_notFound13_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_Assets_at14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("favicon.ico")))
  )
  private[this] lazy val controllers_Assets_at14_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
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
    case controllers_SignUpandInController_userList1_route(params@_) =>
      call { 
        controllers_SignUpandInController_userList1_invoker.call(SignUpandInController_0.userList)
      }
  
    // @LINE:8
    case controllers_SignUpandInController_registerUser2_route(params@_) =>
      call { 
        controllers_SignUpandInController_registerUser2_invoker.call(SignUpandInController_0.registerUser)
      }
  
    // @LINE:9
    case controllers_SignUpandInController_signinForm3_route(params@_) =>
      call { 
        controllers_SignUpandInController_signinForm3_invoker.call(SignUpandInController_0.signinForm)
      }
  
    // @LINE:10
    case controllers_SignUpandInController_signIn4_route(params@_) =>
      call { 
        controllers_SignUpandInController_signIn4_invoker.call(SignUpandInController_0.signIn)
      }
  
    // @LINE:11
    case controllers_MainController_mypageForm5_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_MainController_mypageForm5_invoker.call(MainController_2.mypageForm(username))
      }
  
    // @LINE:14
    case controllers_MainController_signOut6_route(params@_) =>
      call { 
        controllers_MainController_signOut6_invoker.call(MainController_2.signOut)
      }
  
    // @LINE:15
    case controllers_MainController_grade7_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_MainController_grade7_invoker.call(MainController_2.grade(username))
      }
  
    // @LINE:16
    case controllers_MainController_calendar8_route(params@_) =>
      call { 
        controllers_MainController_calendar8_invoker.call(MainController_2.calendar)
      }
  
    // @LINE:19
    case controllers_GradeController_gradesList9_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_GradeController_gradesList9_invoker.call(GradeController_1.gradesList(username))
      }
  
    // @LINE:20
    case controllers_GradeController_gradeList10_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_GradeController_gradeList10_invoker.call(GradeController_1.gradeList(username))
      }
  
    // @LINE:21
    case controllers_GradeController_registerGrade11_route(params@_) =>
      call { 
        controllers_GradeController_registerGrade11_invoker.call(GradeController_1.registerGrade)
      }
  
    // @LINE:22
    case controllers_GradeController_editGrade12_route(params@_) =>
      call { 
        controllers_GradeController_editGrade12_invoker.call(GradeController_1.editGrade)
      }
  
    // @LINE:25
    case controllers_Default_notFound13_route(params@_) =>
      call { 
        controllers_Default_notFound13_invoker.call(Default_3.notFound)
      }
  
    // @LINE:26
    case controllers_Assets_at14_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("favicon.png"))) { (path, file) =>
        controllers_Assets_at14_invoker.call(Assets_4.at(path, file))
      }
  
    // @LINE:27
    case controllers_Assets_versioned15_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_4.versioned(path, file))
      }
  }
}

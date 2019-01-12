// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/conf/routes
// @DATE:Sat Jan 12 12:32:28 JST 2019

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
  // @LINE:21
  GradeController_1: controllers.GradeController,
  // @LINE:30
  Default_3: controllers.Default,
  // @LINE:31
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    SignUpandInController_0: controllers.SignUpandInController,
    // @LINE:11
    MainController_2: controllers.MainController,
    // @LINE:21
    GradeController_1: controllers.GradeController,
    // @LINE:30
    Default_3: controllers.Default,
    // @LINE:31
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calendar/month""", """controllers.MainController.calendarMonth"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calendar/day""", """controllers.MainController.calendarDay"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grades/gradeslist/""" + "$" + """username<[^/]+>""", """controllers.GradeController.gradesList(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grades/gradelist/""" + "$" + """username<[^/]+>""", """controllers.GradeController.gradeList(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grades/accgradelist/""" + "$" + """username<[^/]+>""", """controllers.GradeController.accGradeList(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grades/register/""" + "$" + """username<[^/]+>""", """controllers.GradeController.registerGrade(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grades/registeracc/""" + "$" + """username<[^/]+>""", """controllers.GradeController.registerAccGrade(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grades/edit""", """controllers.GradeController.editGrade"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grades/remove""", """controllers.GradeController.removeGrade"""),
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
  private[this] lazy val controllers_MainController_calendarMonth8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calendar/month")))
  )
  private[this] lazy val controllers_MainController_calendarMonth8_invoker = createInvoker(
    MainController_2.calendarMonth,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "calendarMonth",
      Nil,
      "GET",
      this.prefix + """calendar/month""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_MainController_calendarDay9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calendar/day")))
  )
  private[this] lazy val controllers_MainController_calendarDay9_invoker = createInvoker(
    MainController_2.calendarDay,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "calendarDay",
      Nil,
      "GET",
      this.prefix + """calendar/day""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_GradeController_gradesList10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grades/gradeslist/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GradeController_gradesList10_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_GradeController_gradeList11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grades/gradelist/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GradeController_gradeList11_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_GradeController_accGradeList12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grades/accgradelist/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GradeController_accGradeList12_invoker = createInvoker(
    GradeController_1.accGradeList(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GradeController",
      "accGradeList",
      Seq(classOf[String]),
      "GET",
      this.prefix + """grades/accgradelist/""" + "$" + """username<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_GradeController_registerGrade13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grades/register/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GradeController_registerGrade13_invoker = createInvoker(
    GradeController_1.registerGrade(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GradeController",
      "registerGrade",
      Seq(classOf[String]),
      "POST",
      this.prefix + """grades/register/""" + "$" + """username<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_GradeController_registerAccGrade14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grades/registeracc/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GradeController_registerAccGrade14_invoker = createInvoker(
    GradeController_1.registerAccGrade(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GradeController",
      "registerAccGrade",
      Seq(classOf[String]),
      "POST",
      this.prefix + """grades/registeracc/""" + "$" + """username<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_GradeController_editGrade15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grades/edit")))
  )
  private[this] lazy val controllers_GradeController_editGrade15_invoker = createInvoker(
    GradeController_1.editGrade,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GradeController",
      "editGrade",
      Nil,
      "POST",
      this.prefix + """grades/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_GradeController_removeGrade16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grades/remove")))
  )
  private[this] lazy val controllers_GradeController_removeGrade16_invoker = createInvoker(
    GradeController_1.removeGrade,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GradeController",
      "removeGrade",
      Nil,
      "POST",
      this.prefix + """grades/remove""",
      """""",
      Seq()
    )
  )

  // @LINE:30
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

  // @LINE:31
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

  // @LINE:32
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
    case controllers_MainController_calendarMonth8_route(params@_) =>
      call { 
        controllers_MainController_calendarMonth8_invoker.call(MainController_2.calendarMonth)
      }
  
    // @LINE:17
    case controllers_MainController_calendarDay9_route(params@_) =>
      call { 
        controllers_MainController_calendarDay9_invoker.call(MainController_2.calendarDay)
      }
  
    // @LINE:21
    case controllers_GradeController_gradesList10_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_GradeController_gradesList10_invoker.call(GradeController_1.gradesList(username))
      }
  
    // @LINE:22
    case controllers_GradeController_gradeList11_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_GradeController_gradeList11_invoker.call(GradeController_1.gradeList(username))
      }
  
    // @LINE:23
    case controllers_GradeController_accGradeList12_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_GradeController_accGradeList12_invoker.call(GradeController_1.accGradeList(username))
      }
  
    // @LINE:24
    case controllers_GradeController_registerGrade13_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_GradeController_registerGrade13_invoker.call(GradeController_1.registerGrade(username))
      }
  
    // @LINE:25
    case controllers_GradeController_registerAccGrade14_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_GradeController_registerAccGrade14_invoker.call(GradeController_1.registerAccGrade(username))
      }
  
    // @LINE:26
    case controllers_GradeController_editGrade15_route(params@_) =>
      call { 
        controllers_GradeController_editGrade15_invoker.call(GradeController_1.editGrade)
      }
  
    // @LINE:27
    case controllers_GradeController_removeGrade16_route(params@_) =>
      call { 
        controllers_GradeController_removeGrade16_invoker.call(GradeController_1.removeGrade)
      }
  
    // @LINE:30
    case controllers_Default_notFound17_route(params@_) =>
      call { 
        controllers_Default_notFound17_invoker.call(Default_3.notFound)
      }
  
    // @LINE:31
    case controllers_Assets_at18_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("favicon.png"))) { (path, file) =>
        controllers_Assets_at18_invoker.call(Assets_4.at(path, file))
      }
  
    // @LINE:32
    case controllers_Assets_versioned19_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned19_invoker.call(Assets_4.versioned(path, file))
      }
  }
}

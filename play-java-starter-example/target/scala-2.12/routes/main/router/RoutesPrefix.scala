// @GENERATOR:play-routes-compiler
// @SOURCE:/cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/conf/routes
// @DATE:Fri Dec 14 12:23:20 JST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

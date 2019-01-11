// @GENERATOR:play-routes-compiler
// @SOURCE:/cs-home/cs-student/kinota.w.aa/Desktop/git/sus_impl/play-java-starter-example/conf/routes
// @DATE:Fri Jan 11 11:50:40 JST 2019


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

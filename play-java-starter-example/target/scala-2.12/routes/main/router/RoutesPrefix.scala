// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/daikichi/Desktop/sus_impl2/play-java-starter-example/conf/routes
// @DATE:Fri Jan 25 06:45:12 JST 2019


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

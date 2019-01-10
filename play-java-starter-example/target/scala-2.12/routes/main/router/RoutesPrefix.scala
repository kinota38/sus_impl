// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/shibainu/Documents2/sus_impl/play-java-starter-example/conf/routes
// @DATE:Thu Jan 10 00:09:19 JST 2019


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

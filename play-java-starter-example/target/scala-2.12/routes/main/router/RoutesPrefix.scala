// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/conf/routes
// @DATE:Sat Jan 05 13:40:05 JST 2019


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

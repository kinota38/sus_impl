// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itoutakeru/IdeaProjects/sus_impl/conf/routes
// @DATE:Sat Dec 08 11:15:36 JST 2018


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

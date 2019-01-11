// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itoutakeru/IdeaProjects/sus_impl/play-java-starter-example/conf/routes
// @DATE:Sat Jan 05 13:40:05 JST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseGradeController GradeController = new controllers.ReverseGradeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDefault Default = new controllers.ReverseDefault(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMainController MainController = new controllers.ReverseMainController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSignUpandInController SignUpandInController = new controllers.ReverseSignUpandInController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseGradeController GradeController = new controllers.javascript.ReverseGradeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDefault Default = new controllers.javascript.ReverseDefault(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMainController MainController = new controllers.javascript.ReverseMainController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSignUpandInController SignUpandInController = new controllers.javascript.ReverseSignUpandInController(RoutesPrefix.byNamePrefix());
  }

}

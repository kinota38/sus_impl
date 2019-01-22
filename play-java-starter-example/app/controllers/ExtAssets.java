package controllers;


import play.mvc.Controller;
import play.mvc.Result;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;


import java.io.File;

public class ExtAssets extends Controller {

    public Result at(String path,String filePath) {
        try {
            String decodedResult = URLDecoder.decode(path + filePath, "UTF-8");
            File file = new File(decodedResult);
            return ok(file, true);
        }catch(UnsupportedEncodingException e){
            System.out.println(e);
            return badRequest();
        }
    }
}
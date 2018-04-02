package login.controller;

import login.model.User;
import login.utils.GsonFactory;


import java.util.Date;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by mrivero on 25/3/18.
 */
public class Controller{


    public static void initInterface(){

        get("/example/:hello", (request, response) -> {
            response.type("application/json");
            //Student student = surveyService.getStudentByID(request.params("legajo"));
            return GsonFactory.toJson("El valor del query parameter es "+request.params("hello"));
        });

        get("/user/getAstrid", (request, response) -> {
            response.type("application/json");
            //Student student = surveyService.getStudentByID(request.params("legajo"));
            return GsonFactory.toJson(new User("Astrid", 25, "Ecker", "1992, 11, 3"));
        });



    }


}

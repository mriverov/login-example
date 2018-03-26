package login.controller;

import login.utils.GsonFactory;

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
            return GsonFactory.toJson("hola Astrid "+request.params("hello"));
        });


    }


}

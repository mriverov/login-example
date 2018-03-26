package login.utils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by mrivero on 25/3/18.
 */
public class GsonFactory {

    private static Gson instance = new GsonBuilder().serializeNulls()
            .registerTypeAdapterFactory(OptionalTypeAdapter.FACTORY)
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    public static <T> T fromJson(String json, Class<T> classOfObject) {
        return instance.fromJson(json, classOfObject);
    }

    public static String toJson(Object model) {
        return instance.toJson(model);
    }
}

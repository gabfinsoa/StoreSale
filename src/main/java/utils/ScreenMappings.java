package utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScreenMappings<T extends Generic> {

    public Generic getJson(String screen){

        StringBuilder fileName = new StringBuilder();
        fileName.append("src/test/resources/").append(Utils.getBrand()).append("/").append(screen).append(".json");

        Generic json = null;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName.toString()), "UTF8"))) {
            Gson gson = new Gson();
            JsonElement element = gson.fromJson(bufferedReader, JsonElement.class);
            if(Utils.getMode().equals("Mobile")){
                element = element.getAsJsonObject().get(screen.concat(Utils.getMode()));
            }else{
                element = element.getAsJsonObject().get(screen);
            }
            json = gson.fromJson(element, Generic.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}

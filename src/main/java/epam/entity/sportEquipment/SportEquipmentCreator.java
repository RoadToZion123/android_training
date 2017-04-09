package epam.entity.sportEquipment;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class SportEquipmentCreator {

    public List<SportEquipment> deserializeToList(String path, TypeToken<List<SportEquipment>> token) {
        Type type = token.getType();
        List<SportEquipment> list = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getClass()
                .getClassLoader().getResourceAsStream(path)))) {
            list = new Gson().fromJson(reader, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Map<String,String> deserializeToMap(String path, TypeToken<Map<String,String>> token) {
        Type type = token.getType();
        Map<String,String> map = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getClass()
                .getClassLoader().getResourceAsStream(path)))) {
            map = new Gson().fromJson(reader, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

}

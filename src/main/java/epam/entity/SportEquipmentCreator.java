package epam.entity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Created by Artem on 06.04.2017.
 */
public class SportEquipmentCreator {



    public Map<SportEquipment, Integer> deserializeToList(String path, TypeToken<Map<SportEquipment, Integer>> token) {
        Type type = token.getType();
        Map<SportEquipment, Integer> map = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getClass()
                .getClassLoader().getResourceAsStream(path)))) {
            map = new Gson().fromJson(reader, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public SportEquipmentCreator() {
    }
}

package org.problems.problem01;
import org.json.JSONArray;
import org.json.JSONObject;
import org.problems.problem01.bread.Bread;
import org.problems.problem01.factory.ButterFactory;
import org.problems.problem01.factory.CreamFactory;
import org.problems.problem01.factory.Factory;
import org.problems.problem01.factory.SugarFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bread> breadList = new ArrayList<>();

        String jsonData = "[\n" +
                "  {\n" +
                "    \"breadType\": \"cream\",\n" +
                "    \"recipe\": {\n" +
                "      \"flour\": 100,\n" +
                "      \"water\": 100,\n" +
                "      \"cream\": 200\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"breadType\": \"sugar\",\n" +
                "    \"recipe\": {\n" +
                "      \"flour\": 100,\n" +
                "      \"water\": 50,\n" +
                "      \"sugar\": 200\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"breadType\": \"butter\",\n" +
                "    \"recipe\": {\n" +
                "      \"flour\": 100,\n" +
                "      \"water\": 100,\n" +
                "      \"butter\": 50\n" +
                "    }\n" +
                "  }\n" +
                "]";

        JSONArray jsonArray = new JSONArray(jsonData);

        for(int i = 0; i < jsonArray.length(); i++) {
            JSONObject breadObject = jsonArray.getJSONObject(i);
            String breadType = breadObject.getString("breadType");

            Factory breadFactory = null;
            switch (breadType) {
                case "butter" -> {
                    breadFactory = new ButterFactory();
                }
                case "sugar" -> {
                    breadFactory = new SugarFactory();
                }
                case "cream" -> {
                    breadFactory = new CreamFactory();
                }
            }

            if (breadFactory == null) {
                throw new IllegalArgumentException("breadFactory is null.");
            }
            Bread bread = breadFactory.createBread(breadObject);

            breadList.add(bread);
        }

        for(Bread bread : breadList){
            System.out.println(bread.toString());
        }


    }

}

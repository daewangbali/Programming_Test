package org.problems.problem01.factory;

import org.json.JSONObject;
import org.problems.problem01.bread.Bread;
import org.problems.problem01.bread.ButterBread;

public class ButterFactory extends Factory{

    @Override
    public Bread createBread(JSONObject jsonObject) {
        String breadType = jsonObject.getString("breadType");

        JSONObject recipe = jsonObject.getJSONObject("recipe");
        int flour = recipe.getInt("flour");
        int water = recipe.getInt("water");
        int butter = recipe.getInt("butter");

        return new ButterBread(breadType, flour, water, butter);
    }

}

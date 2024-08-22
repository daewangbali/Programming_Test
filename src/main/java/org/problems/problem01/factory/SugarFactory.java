package org.problems.problem01.factory;

import org.json.JSONObject;
import org.problems.problem01.bread.Bread;
import org.problems.problem01.bread.SugarBread;

public class SugarFactory extends Factory{
    @Override
    public Bread createBread(JSONObject jsonObject) {
        String breadType = jsonObject.getString("breadType");

        JSONObject recipe = jsonObject.getJSONObject("recipe");
        int flour = recipe.getInt("flour");
        int water = recipe.getInt("water");
        int sugar = recipe.getInt("sugar");

        return new SugarBread(breadType, flour, water, sugar);
    }
}

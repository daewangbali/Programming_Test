package org.problems.problem01.factory;

import org.json.JSONObject;
import org.problems.problem01.bread.Bread;
import org.problems.problem01.bread.CreamBread;

public class CreamFactory extends Factory{
    @Override
    public Bread createBread(JSONObject jsonObject) {
        String breadType = jsonObject.getString("breadType");

        JSONObject recipe = jsonObject.getJSONObject("recipe");
        int flour = recipe.getInt("flour");
        int water = recipe.getInt("water");
        int cream = recipe.getInt("cream");

        return new CreamBread(breadType, flour, water, cream);
    }

}

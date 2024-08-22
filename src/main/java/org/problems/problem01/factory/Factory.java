package org.problems.problem01.factory;

import org.json.JSONObject;
import org.problems.problem01.bread.Bread;

public abstract class Factory {
    public abstract Bread createBread(JSONObject jsonObject);

}

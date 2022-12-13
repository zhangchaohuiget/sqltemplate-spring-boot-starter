package com.app.script;

import java.util.List;

import com.app.Context;

public class MixedSqlFragment implements SqlFragment {

    private List<SqlFragment> contents;

    public MixedSqlFragment(List<SqlFragment> contents) {
        this.contents = contents;
    }

    public boolean apply(Context context) {
        for (SqlFragment sf : contents) {
            sf.apply(context);
        }
        return true;
    }

}

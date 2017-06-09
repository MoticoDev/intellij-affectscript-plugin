package me.sangs.effects.script.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by dsa28s on 2017. 4. 30..
 */
public class AffectScriptErrorManager {

    public static String getErrorMessage(Throwable e) {
        StringWriter errors = new StringWriter();
        e.printStackTrace(new PrintWriter(errors));
        return errors.toString();
    }

}

package example.quickstart.json;

import static java.lang.System.err;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsonRunScript {

    public static void main(String[] args) {
	
	File newfile = new File("/home/satish/codebase/javaprojects/springboot/quickstart-json-xml/src/main/resources/static/Person.js");
	
	System.out.println(newfile.listFiles());
	
	if (args.length != 1) {
	    err.println("usage: java RunScript script");
	    return;
	}
	ScriptEngineManager manager = new ScriptEngineManager();
	ScriptEngine engine = manager.getEngineByName("nashorn");
	try {
	    engine.eval(new FileReader(args[0]));
	} catch (ScriptException se) {
	    err.println(se.getMessage());
	} catch (IOException ioe) {
	    err.println(ioe.getMessage());
	}
    }
}
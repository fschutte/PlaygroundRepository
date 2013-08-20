import freemarker.template.*;
import java.util.*;
import java.io.*;

public class TestXML {

    public static void main(String[] args) throws Exception {
        
        /* ----------------------------------------------------------------------- */    
        /* You should do this ONLY ONCE in the whole application life-cycle:       */    
    
        /* Create and adjust the configuration */
        Configuration cfg = new Configuration();

        cfg.setDirectoryForTemplateLoading(new File("templates"));
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
        cfg.setIncompatibleImprovements(new Version(2, 3, 20));

        /* ----------------------------------------------------------------------- */    
        /* You usually do these for many times in the application life-cycle:      */    

        /* Create a data-model */
        Map root = new HashMap();
        root.put(
                "doc",
                freemarker.ext.dom.NodeModel.parse(new File("xml/input1.xml")));  

        		
        /* Get the template */
        Template temp = cfg.getTemplate("test1.ftl");

        /* Merge data-model with template */
        Writer out = new OutputStreamWriter(System.out);
        temp.process(root, out);
    }
}  
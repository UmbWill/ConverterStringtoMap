import java.util.HashMap;
import java.util.regex.*;


public class ConverterStringtoMap{

    public boolean convert(String mapstr, HashMap<String,String> output_map){

        Pattern p = Pattern.compile("\\{(.*)\\}");
        Matcher m = p.matcher(mapstr);
        if(!(m.find())) return false;
        for(String iter : m.group(1).split(",")){
            String[] iterkv = iter.split("=");
            if(iterkv[0] != null && iterkv != null)
                output_map.put(iterkv[0].trim(),iterkv[1].trim());
        }
        return true;
    }

}
import java.util.HashMap;
import java.util.regex.*;


public class ConverterStringtoMap{
    
    public boolean convert(String mapstr, HashMap<String,String> output_map){
        if (output_map == null)return false;
        Pattern p = Pattern.compile("\\{(.*)\\}");
        Matcher m = p.matcher(mapstr);
        if(!(m.find())) return false;
        try{
            for(String iter : m.group(1).split(",")){
                String[] iterkv = iter.split("=");
                if(iterkv.length == 2 && iterkv[0] != null && iterkv[1] != null)
                    output_map.put(iterkv[0].trim(),iterkv[1].trim());
                else{return false;}    
            }
        }catch(ArrayIndexOutOfBoundsException err){
            err.printStackTrace();
            return false;
        }
        return true;
    }

}

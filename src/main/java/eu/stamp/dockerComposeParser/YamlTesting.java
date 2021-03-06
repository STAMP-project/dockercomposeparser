package eu.stamp.dockerComposeParser;
import java.io.File;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;

import eu.stamp.dockerComposeParser.model.Architecture;


public class YamlTesting {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory().enable(Feature.MINIMIZE_QUOTES)).enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);;
        mapper.setSerializationInclusion(Include.NON_DEFAULT);
//        mapper.setSerializationInclusion(Include.NON_EMPTY);
        try {
            Architecture a = mapper.readValue(new File("test3.yml"), Architecture.class);
           // System.err.println(a.getServices().getService().get(0).getImage());
            System.out.println(ReflectionToStringBuilder.toString(a,ToStringStyle.MULTI_LINE_STYLE));
            
            mapper.writeValue(System.out, a);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
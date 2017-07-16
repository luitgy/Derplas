package com.alonsosolera.derplas.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import org.springframework.stereotype.Service;

/**
 *
 * @author luitgy
 */
public interface JsonTransformer {

    public String toJson(Object data) throws JsonProcessingException;

    public Object fromJson(String json, Class cls) throws IOException;

}

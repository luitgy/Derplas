package com.alonsosolera.derplas.json.impl;

import com.alonsosolera.derplas.json.JsonTransformer;
import com.alonsosolera.derplas.util.DPConstants;
import com.alonsosolera.derplas.util.DPUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 *
 * @author luitgy
 */
public class JsonTransformerImpl implements JsonTransformer {

    @Override
    public String toJson(Object data) throws JsonProcessingException {

        if (data == null) {
            return null;
        }

        String json = DPConstants.EMPTY_STRING;

        try {

            ObjectMapper objectMapper = new ObjectMapper();
            json = objectMapper.writeValueAsString(data);

        } catch (JsonProcessingException ex) {
            throw ex;
        }

        return json;

    }

    @Override
    public Object fromJson(String json, Class cls) throws IOException {

        if (DPUtil.isEmpty(json) || cls == null) {
            return null;
        }

        Object obj = null;

        try {

            ObjectMapper objectMapper = new ObjectMapper();
            obj = objectMapper.readValue(json, cls);

        } catch (IOException ex) {
            throw ex;
        }

        return obj;

    }

}

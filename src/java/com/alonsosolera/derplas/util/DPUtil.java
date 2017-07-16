
package com.alonsosolera.derplas.util;

import java.util.List;

/**
 *
 * @author luitgy
 */
public class DPUtil {
    
    public static boolean isEmpty(String str){
        return str == null || (str.trim().equals(DPConstants.EMPTY_STRING));
    }
    
    public static boolean isEmtpty(List lst){
        return lst == null || (lst.isEmpty());
    }
    
}

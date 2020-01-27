package com.ziroom.crm;

import org.springframework.stereotype.Component;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2020-01-27 20:21
 * </pre>
 */
@Component("dao2")
public class IndexDaoImpl implements IndexDao {

    public void daoPrint() {
        System.out.println("indexDao...");
    }
}

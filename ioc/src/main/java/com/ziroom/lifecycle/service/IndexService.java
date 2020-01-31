package com.ziroom.lifecycle.service;

import com.ziroom.lifecycle.dao.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2020-01-28 19:47
 * </pre>
 */
@Service
public class IndexService {
    @Autowired
    private IndexDao indexDao;
}

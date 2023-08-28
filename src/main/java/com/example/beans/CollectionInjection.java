package com.example.beans;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * See <a href="https://stackoverflow.com/questions/22589302/where-is-javax-annotation">here</a> for understanding @Resource annotation
 */
@Service("injectCollection")
public class CollectionInjection {
    @Resource(name = "map")
    private Map<String, Object> map;
    @Resource(name = "set")
    private Set set;
    @Resource(name = "list")
    private List list;
    @Resource(name = "props")
    private Properties props;

    @Override
    public String toString() {
        return "CollectionInjection{" +
                "map=" + map +
                ", set=" + set +
                ", list=" + list +
                ", props=" + props +
                '}';
    }
}

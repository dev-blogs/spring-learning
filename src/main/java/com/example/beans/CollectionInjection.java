package com.example.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * See <a href="https://stackoverflow.com/questions/22589302/where-is-javax-annotation">here</a>
 * for understanding @Resource annotation
 */
@Service("injectCollection")
public class CollectionInjection {
    @Resource(name = "map")
    private Map<String, Object> map;
    @Resource(name = "set")
    private Set set;
    @Resource(name = "list")
    private List<Oracle> list;
    @Autowired
    private List<Oracle> anoterList;
    @Resource(name = "props")
    private Properties props;

    /**
     * The difference between @Autowired and @Resource is that @Autowired collects all beans of type which
     * defines its declaration whereas @Resource annotation with its qualifier looks for exactly qualified
     * bean, in this case bean with id "list"
     * @return
     */
    @Override
    public String toString() {
        return "CollectionInjection{" +
                "list=" + list +
                ", anoterList=" + anoterList +
                '}';
    }
}

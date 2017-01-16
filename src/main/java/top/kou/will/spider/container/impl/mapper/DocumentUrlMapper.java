package top.kou.will.spider.container.impl.mapper;

import top.kou.will.spider.model.DocumentUrl;

/**
 * Created by Hack on 2016/12/23.
 */
public interface DocumentUrlMapper {
    void save(DocumentUrl doc);
    void updateStatus(String url, String status);
    DocumentUrl lookupNextUnvisitedUrl();
}

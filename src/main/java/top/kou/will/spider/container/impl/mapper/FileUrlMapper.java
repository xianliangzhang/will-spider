package top.kou.spider.container.impl.mapper;

import top.kou.spider.model.FileUrl;

/**
 * Created by Hack on 2016/12/23.
 */
public interface FileUrlMapper {
    void save(FileUrl url);
    FileUrl lookupByUrl(String url);
}

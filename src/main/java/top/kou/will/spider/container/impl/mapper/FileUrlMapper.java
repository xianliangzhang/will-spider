package top.kou.will.spider.container.impl.mapper;

import top.kou.will.spider.model.FileUrl;

/**
 * Created by Hack on 2016/12/23.
 */
public interface FileUrlMapper {
    void save(FileUrl url);
    FileUrl lookupByUrl(String url);
}

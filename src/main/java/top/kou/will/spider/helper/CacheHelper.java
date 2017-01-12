package top.kou.spider.helper;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import top.kou.core.helper.AbstractCacheHelper;
import top.kou.core.helper.ConfigHelper;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Hack on 2016/12/2.
 */
public class CacheHelper {
    private static final Logger RUN_LOG = Logger.getLogger(AbstractCacheHelper.class);
    private static final SqlSessionFactory SQL_SESSION_FACTORY = setSqlSessionFactory();

    private CacheHelper() {

    }

    public static SqlSessionFactory setSqlSessionFactory() {
        try {
            Properties properties = new Properties();
            properties.setProperty("username", ConfigHelper.get("_env.KOME_X"));
            properties.setProperty("password", ConfigHelper.get("_env.KOME_Y"));

            InputStream inputStream = AbstractCacheHelper.class.getResource("/datasource/kome.xml").openStream();
            return new SqlSessionFactoryBuilder().build(inputStream, properties);
        } catch (Exception e) {
            RUN_LOG.error(e.getMessage(), e);
        }
        return null;
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return SQL_SESSION_FACTORY;
    }

}

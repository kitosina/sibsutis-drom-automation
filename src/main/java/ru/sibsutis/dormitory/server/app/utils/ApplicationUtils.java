package ru.sibsutis.dormitory.server.app.utils;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

import java.io.InputStream;

import static org.slf4j.LoggerFactory.getLogger;

public abstract class ApplicationUtils {

    private static final Logger LOG = getLogger(ApplicationUtils.class);

    /**
     * @return Возвращает версию приложения
     */
    public static String getVersion() {
        try (InputStream is = ApplicationUtils.class.getResourceAsStream("/app.version")) {
            return IOUtils.toString(is);
        } catch (Exception e) {
            LOG.warn(e.getMessage(), e);
        }
        return "Unknown version project";
    }

}

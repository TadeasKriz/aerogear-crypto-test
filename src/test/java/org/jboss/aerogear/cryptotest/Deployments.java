package org.jboss.aerogear.cryptotest;

import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;

/**
 * @author <a href="mailto:tkriz@redhat.com">Tadeas Kriz</a>
 */
public class Deployments {

    public static Archive testedApk() {
        return Maven.resolver()
                .resolve("org.jboss.aerogear:crypto-android-demo:apk:0.1.0")
                .withoutTransitivity()
                .asSingle(JavaArchive.class);
    }

}

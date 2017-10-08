import org.slf4j.LoggerFactory

@Grapes([
        @Grab(group='ch.qos.logback', module='logback-classic', version='1.2.3'),
        @Grab(group='org.slf4j', module='slf4j-api', version='1.7.25')
])
class LibClass {
    public void log() {
        def logger = LoggerFactory.getLogger("myLogger")
        logger.info("AAAAAAAAAAAAAAAAAAAAAAAAAAA")
    }
}

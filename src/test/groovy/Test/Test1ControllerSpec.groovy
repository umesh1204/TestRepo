package Test

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class Test1ControllerSpec extends Specification implements ControllerUnitTest<Test1Controller> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}

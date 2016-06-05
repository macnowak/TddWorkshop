package pl.decerto.workshop.tdd

import spock.lang.Specification

/**
 * Created by Maciek on 05.06.2016.
 */
class MainTest extends Specification {

	def "should say hello"() {
		expect:
		"hello" == new Main().sayHello()

	}
}
